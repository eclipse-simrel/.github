/*******************************************************************************
 * Copyright (c) 2025, 2025 Hannes Wellmann and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Hannes Wellmann - initial API and implementation
 *******************************************************************************/

final Locale LOCAL = Locale.ENGLISH;
final DateTimeFormatter LONG = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", LOCAL);
final DateTimeFormatter SHORT = DateTimeFormatter.ofPattern("MM/dd", LOCAL);

private record SimRelDates(LocalDate M1, LocalDate M2, LocalDate M3, LocalDate RC1, LocalDate RC2, LocalDate GA) {
}

void main(String[] args) throws IOException {
	String simRelName = readSimRelName(args);
	Path templateFile = Path.of("wiki/SimRel/releaseDetails.template_md");
	Path overviewFile = templateFile.resolveSibling(simRelName + ".md");

	SimRelDates dates = parseDatesJSON(Path.of("wiki/SimRel/" + simRelName + "_dates.json"));
	performSanityChecks(simRelName, dates);

	String simRelMonthYear = DateTimeFormatter.ofPattern("MMMM yyyy", LOCAL).format(dates.GA);
	String previousSimRelName = DateTimeFormatter.ofPattern("yyyy-MM", LOCAL).format(dates.GA.minusMonths(3));
	if (!Files.isRegularFile(overviewFile.resolveSibling(previousSimRelName + ".md"))) {
		throw new IllegalStateException("Previous SimRel " + previousSimRelName + " not found.");
	}
	var calendarDate = DateTimeFormatter.ofPattern("yyyyMMdd", LOCAL);
	String calendarPeriodStart = calendarDate.format(dates.M1.minusWeeks(2));
	String calendarPeriodEnd = calendarDate.format(dates.GA.plusDays(1));

	String content = Files.readString(templateFile);
	content = content.replace("${SIMREL_NAME}", simRelName) //
			.replace("${PREVIOUS_SIMREL_NAME}", previousSimRelName) //
			.replace("${SIMREL_FULL_MONTH_YEAR}", simRelMonthYear)
			.replace("${QUIET_PERIOD_START_SHORT}", SHORT.format(dates.RC2))
			.replace("${QUIET_PERIOD_END_SHORT}", SHORT.format(dates.GA.minusDays(1)))
			.replace("${CALENDAR_PERIOD}", calendarPeriodStart + "%2F" + calendarPeriodEnd);
	content = resolveDateVariables(content, "M1", dates.M1);
	content = resolveDateVariables(content, "M2", dates.M2);
	content = resolveDateVariables(content, "M3", dates.M3);
	content = resolveDateVariables(content, "RC1", dates.RC1);
	content = resolveDateVariables(content, "RC2", dates.RC2);
	content = resolveDateVariables(content, "GA", dates.GA);

	Files.writeString(overviewFile, content);

	IO.println("Overview for " + simRelName + " generated successfully: " + overviewFile);
}

String readSimRelName(String[] args) {
	if (args.length < 1) {
		throw new IllegalArgumentException("Expected SimRel name argument is missing");
	}
	String simRelName = args[0];
	if (!Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})").matcher(simRelName).matches()) {
		throw new IllegalArgumentException("SimRel name has unexpected format: " + simRelName);
	}
	return simRelName;
}

SimRelDates parseDatesJSON(Path file) throws IOException {
	// Use built-in JSON parser once the JDK provides one
	String content = Files.readString(file).trim();
	if (!content.startsWith("{") || !content.endsWith("}")) {
		throw new IllegalArgumentException("Unexpected content of" + file.getFileName());
	}
	var jsonDateObject = Pattern.compile("\"(?<name>\\w+)\"\\s*:\\s*\"(?<date>[^\"]+)\"\\s*(,|})");
	var dates = jsonDateObject.matcher(content).results()
			.collect(Collectors.toMap(m -> m.group("name"), m -> LocalDate.parse(m.group("date"))));
	return new SimRelDates(getDate(dates, "M1"), getDate(dates, "M2"), getDate(dates, "M3"), //
			getDate(dates, "RC1"), getDate(dates, "RC2"), getDate(dates, "GA"));
}

LocalDate getDate(Map<String, LocalDate> dates, String key) {
	return Objects.requireNonNull(dates.get(key), key + " date not specified");
}

void performSanityChecks(String simRelName, SimRelDates dates) {
	var allDates = Arrays.stream(SimRelDates.class.getRecordComponents()).map(RecordComponent::getAccessor).map(m -> {
		try {
			return m.invoke(dates);
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new IllegalStateException(e);
		}
	}).map(LocalDate.class::cast).toList();
	for (int i = 1; i < allDates.size(); i++) {
		if (allDates.get(i - 1).compareTo(allDates.get(i)) >= 0) {
			throw new IllegalArgumentException("Dates are not in strictly ascending order: " + allDates);
		}
	}
	if (!allDates.subList(0, allDates.size() - 1).stream().allMatch(d -> d.getDayOfWeek() == DayOfWeek.FRIDAY)) {
		throw new IllegalArgumentException("Not all milestones and RCs are Fridays: " + dates);
	}
	if (dates.GA.getDayOfWeek() != DayOfWeek.WEDNESDAY) {
		throw new IllegalArgumentException("GA release day is not a Wednesday: " + dates.GA);
	}
	if (!simRelName.equals(String.format("%d-%02d", dates.GA.getYear(), dates.GA.getMonthValue()))) {
		throw new IllegalArgumentException("GA date does not match the SimRel name (" + simRelName + "): " + dates.GA);
	}
	var milestoneLengths = Set.of(Period.ofWeeks(2), Period.ofWeeks(3), Period.ofWeeks(4));
	if (!milestoneLengths.contains(dates.M1.until(dates.M2)) || !milestoneLengths.contains(dates.M2.until(dates.M3))) {
		// The number of weeks between M1 and M2 may be subject to adjustments in order
		// to adapt to years not having exactly 52 years and correspondingly increase or
		// decrease the offset of M1 from M2 as necessary. Usually both are three weeks
		// apart, just like M2 and M3 (which is usually not adapted).
		throw new IllegalArgumentException(
				"M1, M2 and M3 are further apart than usual: " + dates.M1 + ", " + dates.M2 + ", " + dates.M3);
	}
	if (dates.M3.until(dates.RC1, ChronoUnit.DAYS) != 7 || dates.RC1.until(dates.RC2, ChronoUnit.DAYS) != 7) {
		throw new IllegalArgumentException("M3, RC1 and RC2 are not in strictly one week apart: " + dates.M3 + ", "
				+ dates.RC1 + ", " + dates.RC2);
	}
	if (dates.RC2.until(dates.GA, ChronoUnit.DAYS) >= 7) {
		throw new IllegalArgumentException(
				"RC2 and GA are not in strictly within one week: " + dates.RC2 + ", " + dates.GA);
	}
}

String resolveDateVariables(String str, String name, LocalDate date) {
	return str.replace("${" + name + "_DATE_LONG}", LONG.format(date))
			.replace("${" + name + "_START_SHORT}", SHORT.format(date.minusDays(7)))
			.replace("${" + name + "_END_SHORT}", SHORT.format(date));
}
