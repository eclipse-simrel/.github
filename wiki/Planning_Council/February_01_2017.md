## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, Feb 01, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=02&amp;day=01&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
</tr>
<tr class="odd">
<td><p>Dial in:</p></td>
<td><p>(See <a href="Asterisk" title="wikilink">Asterisk</a> service for complete details on SIP, potential new numbers, phone mute commands, etc.)</p>
<p>Phone Numbers: (Check <a href="Asterisk/Numbers" title="wikilink">Asterisk/Numbers</a> for more or current phone numbers.)</p>
<dl>
<dt></dt>
<dd><strong>For all phone lines: Participant conference extension: 710 then enter pin 35498</strong>
</dd>
</dl>
<ul>
<li>Ottawa (local call in Ottawa) 1-613-454-1403</li>
<li>North America (toll free) 1-866-569-4992</li>
<li>Germany (local call anywhere in Germany) +49-692-2224-6059</li>
<li>France (local call anywhere in France) +33-17-070-8535</li>
<li>UK (toll free) 0800-033-7806</li>
<li>Switzerland (local call anywhere in Switzerland) +41-44-580-2115</li>
</ul>
<ul>
<li>SIP clients:</li>
</ul>
<dl>
<dt></dt>
<dd>call 710@asterisk.eclipse.org, then enter pin 35498.
</dd>
</dl></td>
</tr>
</tbody>
</table>

## Members and Attendees

### Eclipse Foundation

  - Wayne Beaton, interim chair Y
  - Frederic Gurr Y

### Strategic Members

  - CA Technologies
  - CEA LIST
  - Codenvy, S.A. (Tyler Jewell)
  - Ericsson AB (Marc Khouzam) Y
  - IBM (Thomas Watson) Y
  - itemis AG (Alexander Nyssen) Y
  - OBEO (Melanie Bats) Y
  - Oracle (Neil Hauge)
  - Red Hat, Inc. (Nick Boldt)
  - Robert Bosch GmbH
  - SAP SE (Stephan Merker)

### PMC Representatives

  - Business Intelligence and Reporting Tools (BIRT) PMC (Gary Xue)
  - Data Tools Platform PMC (Brian Payton)
  - Eclipse Cloud Development PMC (Martin Lippert)
  - Eclipse Project PMC (Dani Megert) Y
  - IoT
  - LocationTech Technology
  - Eclipse Modeling Project PMC (Ed Merks)
  - Mylyn (Application Lifecycle Tools) PMC (Sam Davis)
  - PolarSys
  - Eclipse Runtime Project (RT) PMC (Ian Bull) Y
  - Eclipse Science
  - Service Oriented Architecture PMC (Adrian Mos)
  - Technology PMC (Chris Aniszczyk)
  - Tools Project PMC (Doug Schaefer)
  - Eclipse Web Tools Platform Project (WTP) PMC (Carl Anderson) Y

<small>Note: "Inactive" refers to [Strategic
Members](http://www.eclipse.org/membership/showMembersWithTag.php?TagID=strategic)
or PMCs we have not heard from for a while and have been unable to
convince to participate. Those members can become active again at any
time. Contact Wayne Beaton if questions.</small>

<small>Note: feel free to correct any errors/omissions in above
attendance record.</small>
<small>Y = Yes, attended</small>
<small>N = No, did not</small>
<small>R = regrets sent ahead of time</small>
<small>D = delegated</small>
<small>X = not expected</small>

## Previous meeting minutes

  - Review [previous meeting minutes](../Planning_Council.md) if
    you'd like. That is, review them before the meeting, but if
    questions or issues with previous minutes, this would be a good time
    to bring them up.

## Notes

Melanie Bats joins us as the new representative for strategic member
OBEO.

Dani's team is working on a tool (based on JDeps) to test for
dependencies on internal APIs that may break project code running on
Java 9. Dani will provide links. We need a means for projects to state
their support for Java 9. There are two (at least) concerns: does the
project code run on Java 9, and does the project code leverage Java 9
features.

The Eclipse Platform is almost done with their own process of ensuring
that they're not using internal APIs.

We will need to have a release that coincides with the release of Java
9. This includes the repository, packages, and the installer. Expected
delivery date for Java 9 is July 27/2017 (we feel that the Java 9 team
will is about 80% likely to meet this date). This release will likely be
in addition to our planned Oxygen.1 release in September. There was some
discussion regarding who can and should participate in this release. The
extra release is generally intended for those projects that do something
related to Java 9; in the end, I think that we decided that all projects
that want to can participate in this special release. We need to get the
EF Marketing team engaged.

We've acknowledged that vacations may be a problem with the timing of
this release and we'll have to proactively sort out schedules to give us
the best chances of success.

Fred provided a brief update. His biggest concern is that lots of
feature/bundle versions have changed and there's been some merge
conflicts. Fred has asked that project teams push to Gerrit rather than
directly.

As of this point-in-time, we haven't heard from the LDT project (Wayne
has since managed to get commitment from them to join and has engaged
the Tools PMC).

OSGi R7 spec is releasing in September. We should get the EF Marketing
team to do some outreach.