## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, September 06, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=09&amp;day=06&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
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

  - Wayne Beaton
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
  - Eclipse Project PMC (Dani Megert) - R
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

  - Oxygen.1 status (by Fred Gurr/Mikael Barbero)
  - Photon update (by Fred Gurr/Mikael Barbero)
  - Java 9 release
      - see [proposed
        schedule](https://dev.eclipse.org/mhonarc/lists/eclipse.org-planning-council/msg02785.html)
  - Brainstorm about the future of the SimRel (by Mélanie Bats)

## Notes

# Attendance

Aleksandar Kurtakov (Tools Project), Carl Anderson (Eclipse Web Tools
Platform Project), Frederic Gurr (Eclipse Foundation), Mélanie Bats
(Obeo), Mikael Barbero (Eclipse Foundation), Thomas Watson (IBM), Wayne
Beaton (Eclipse Foundation)

# Oxygen.1/Photon status (Frederic Gurr /Mikaël Barbero)

Fred sums up the status of the Oxygen.1 release:

  - some problems with the EPP package, it was not provided for the
    first RC
  - unreliable services for macOS build (UI testing, macOS bundles & DMG
    files creation and signing). Mikael is trying to replace the actual
    old MacMini machine by a new one not hosted anymore by the Eclipse
    infrastruture, there will be two separate machines one for the UI
    testing and another one for the signing services. As this new infra
    will not be ready for Oxygen.1, an on demand signing is proposed for
    people needing signing service.

See the message sent by Mikael on the cross project mailing list for
details:
<https://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg14725.html>

Next relevant dates for Oxygen.1:

  - Oxygen.1 RC4 EPP Thursday, September 14, 2017
  - Oxygen.1 RC4 Friday, September 15, 2017
  - **Oxygen.1 Wednesday, September 27, 2017**

Next photon milestone, eveything is ok. Wayne ask for projects on the
cross project list to declare there intention to opt-in:
<https://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg14694.html>
Projects must declare before the M4 milestone. +1 and +2 projects should
declare and participate earlier as there is more consequences because of
the depending projects. If a project does not declared its intention
before M4, it will be out at M5. An email will be sent on cross-project
this week by Wayne at this subject.

Next relevant dates for Photon:

  - Photon M2 Friday, September 22, 2017
  - Photon M3 Friday, November 03, 2017
  - Photon M4 Friday, December 15, 2017

# Java 9 release

The schedule for the Oxygen Update 1a (Java 9 and JUnit 5) is:

  - **Oxygen JDT Official JDK9 release on Thursday, September 21**
  - Oxygen.1a Platform RC1 on Friday, September 22
  - Oxygen.1a RC1 on Friday, September 29,
  - Oxygen.1a Platform RC2 on Friday, September 29
  - Oxygen.1a RC2 on Friday October 6
  - **Oxygen.1a Wednesday, October 11**

# Brainstorm about the future of the SimRel (by Mélanie Bats)

The java community decided to move to a new Java release cycle with a
new Java release every 6 months in March and September starting from
2018: <https://mreinhold.org/blog/forward-faster>

Melanie launched a discussion during the August meeting about the future
of the release train to evolve to a rolling release:
<https://dev.eclipse.org/mhonarc/lists/eclipse.org-planning-council/msg02779.html>

Mélanie asked the Planning Council members to review and comment the
following document before the next Plannning Council meeting in October:
<https://docs.google.com/document/d/1R3RhAKMFbtBrv3KcyLV48mQJRs59GHao7XEbzZM07Jw/edit?usp=sharing>