## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, August 02, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=08&amp;day=02&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
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

## Members

Planning Council Chair: Melanie Bats

### Eclipse Foundation

  - Wayne Beaton, ~~interim chair~~
  - Frederic Gurr
  - Mikael Barbero

### Strategic Members

  - CA Technologies
  - CEA LIST
  - Codenvy, S.A. (Tyler Jewell)
  - Ericsson AB (~~Marc Khouzam~~ Marc-Andre Laperle)
  - IBM (Thomas Watson)
  - itemis AG (Alexander Nyssen)
  - OBEO (Melanie Bats)
  - Oracle (Neil Hauge)
  - Red Hat, Inc. (Nick Boldt)
  - Robert Bosch GmbH
  - SAP SE (Stephan Merker)

### PMC Representatives

  - Business Intelligence and Reporting Tools (BIRT) PMC (Gary Xue)
  - Data Tools Platform PMC (Brian Payton)
  - Eclipse Cloud Development PMC (Martin Lippert)
  - Eclipse Project PMC (Dani Megert)
  - IoT
  - LocationTech Technology
  - Eclipse Modeling Project PMC (Ed Merks)
  - Mylyn (Application Lifecycle Tools) PMC (Sam Davis)
  - PolarSys
  - Eclipse Runtime Project (RT) PMC (Ian Bull)
  - Eclipse Science
  - Service Oriented Architecture PMC (Adrian Mos)
  - Technology PMC (Chris Aniszczyk)
  - Tools Project PMC (Aleksandar Kurtakov)
  - Eclipse Web Tools Platform Project (WTP) PMC (Carl Anderson)

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

## Agenda

### Date for Oxygen.1 release (Frederic Gurr)

The Oxygen.1 release was planned for September 27, 2017. Since JDK 9 GA
is currently planned for September 21, I guess we need to realign.
However, moving the Oxygen.1 release to September 21 collides with the
Photon M2 release (September 22). Do we move Photon M2 to September 15
or do we postpone it to September 29? Are there any alternatives? (see
also
<https://wiki.eclipse.org/Photon/Simultaneous_Release_Plan#Schedule>)

Suggestions raised in
<https://wiki.eclipse.org/Planning_Council/June_07_2017#Java_9> involve
having JDT produce a release candidate build that includes Java 9 on
Sept 21.

  - Option \#1: Move the Oxygen.1 date to 2nd week October - GA on Oct
    11 or 18
      - Pro: neither of these conflict with the Photon dates (M2:
        09/15-22, M3: 10/27-11/03)
      - Con: delays Oxygen support for JDK9 so we might lose market
        share to other IDEs who can react faster (Mike's concern)

<!-- end list -->

  - Option \#2: Add an extra release in October - GA on Oct 11 or 18
      - Pro: get out an .1 release in September, as we've always done,
        even if it only has prelim support for JDK9
      - Con: more overhead to do another release, even if it's a "JDK9
        Update Only" change

<!-- end list -->

  - Option \#3: Roll out Java 9 with Oxygen.2 in December (with
    Marketplace-based rollout in the interim on Oct 11 or 18)
      - Pro: regular update release schedule (Sept, Dec) is maintained;
        early access support can be provided in Marketplace and updated
        once finalized outside the simrel train schedule
      - Con: might be perceived as being slow to market; marketplace
        uptake might be small

More recently, a 4th option was proposed in this thread:
<https://dev.eclipse.org/mhonarc/lists/eclipse.org-planning-council/msg02769.html>

  - Option \#4: Move Oxygen.1 to mid-September (Sept 13?), with a
    special JDK 9 / JUnit 5 Update release no more than a week later
    (Sept 21?) (Dani's suggestion)
      - Con: would require adjusting the Photon M2 dates (09/15-22) to
        avoid overlap - could be 09/01-08 or 09/22-29
      - Pro: would allow prompt support for JDK 9 as close to the Sept
        21 GA date as possible

## Notes

### Attendance

Stephan Merker (SAP) Tom Watson (IBM) Mikael Barbero (Eclipse
Foundation) Carl Anderson (Webtools PMC) Dani Megert (Eclipse PMC)
Melanie Bats (OBEO) Alexander Nyssen (Itemis) Fred Gurr (Eclipse
Foundation) Wayne Beaton (Eclipse Foundation)

### Discussion

Announcement: **Melanie Bats** is the new Eclipse Planning Council
Chair. Thanks, Melanie, for stepping up\!

Fred walked us through the Oxygen.1 date options captured in the agenda.

Fred: Date for the Oxygen.1 release. Currently September 27. Java 9’s
release date is September 21. Do we want to have these on the same date?
Note that Photon M2 release is in that week.

Mikael: why is it an issue that Photon M2 and Oxygen.1 collide?

Fred: definitely possible. Just complex. If anything goes wrong, there
could be delays.

Dani: availability of resources to test things is an issue.

Dani: direction from most people on last call. Update 1 without Java 9.
We can easily ship Java 9 + JUnit 5 support via Marketplace. More
predictable update schedule is more important that moving the date to
accommodate the new features. Oxygen.1 on Sept. 27 does not include Java
9 support. JDT will make an official release via Marketplace on Sept.
21. Target a Oxygen.1a release on October 11 that will include Java 9
and JUnit 5. This will be included in updates to all users. Oxygen.1
will be a stable usual release. JDT will issue updates as necessary.

Dani: To put something into the extra release, a project must bring the
issue to their PMC. PMC brings it to the Planning Council for approval.
Oxygen.1a is for Java 9 and JUnit 5 related fixes only. The Planning
Council will decide what features will be included in Oxygen.1a.

Wayne: After Oxygen.1a ships. If JDT identifies a critical bug, what
then?

Dani: We’ll deal with that when we have to.

**Conclusion: JDT will issue “official” Java 9 support via Marketplace
on Sept. 21/2017. Oxygen.1 will be released on September 27 without Java
9 or JUnit 5 support. Oxygen.1a on October 11/2017 will include Java
9+JUnit 5.**

*Wayne's unvoiced observation: we're treating Oxygen.1 as an update
release. The Planning Council decided some time ago that these are not
update releases, but rather are more like minor (quarterly) releases and
it is okay for them to include new functionality. As we move forward
with Melanie's ideas (discussion started below; watch for the document
link), one big part of our challenge is break these old opinions and
habits.*

Melanie will put a message on the mailing list to give the rest of the
Planning Council a chance to express concerns.

Melanie: Mikael, Melanie, and Wayne have been discussing a change in the
way that we do the simultaneous release to be more of a rolling release
style. Melanie has reviewed how other open source organizations do
releases. We tried to image what could be done to the simultaneous
release. Melanie will distribute a working document that discusses this.
All members should please read the document. Melanie will start a thread
in the mailing list.

Dani: The Eclipse project is planning to add a new top-level menu
labelled “Debug” for Photon. Nobody will be broken by the change, but to
avoid contributing menu items that look out of place, others projects
(and adopters) who contribute to the “Run” menu will have to change.
This is part of an effort to reorganize the Debug Perspective. The
Planning Council did not voice any dissent. Dani will put a note out on
the cross-project-issues-dev mailing list.

Wayne; We’re rolling out some changes to the legal documentation. We
will not be asking projects that are following the current guidelines to
change. These changes are for projects using technology other than
Eclipse Platform Plug-ins and Features (e.g. for project that it makes
no sense to include an about.html file or a “Feature Blurb”). We will
regard the existing guidelines as a specific implementation of the more
general guidelines. We’re rolling those changes into the handbook and
will let the community know via the cross-project-issues-dev mailing
list.