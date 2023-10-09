## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, October 04, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=10&amp;day=04&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
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

  - Oxygen.1a status (by Fred Gurr/Mikael Barbero)
  - Photon update (by Fred Gurr/Mikael Barbero)
  - EPLv2 adoption schedule for projects involved in Photon? (by Mélanie
    Bats)
  - Results of the brainstorm about the future of the SimRel / New Java
    SE release schedule ? (by Mélanie Bats)

## Notes

### Attendance

Aleksandar Kurtakov (Tools Project), Carl Anderson (Eclipse Web Tools
Platform Project), Dani Megert (Eclipse Project), Frederic Gurr (Eclipse
Foundation), Mélanie Bats (Obeo), Mikael Barbero (Eclipse Foundation),
Thomas Watson (IBM), Wayne Beaton (Eclipse Foundation)

### Regrets

Martin Lippert (Eclipse Cloud Development PMC)

### Oxygen/Photon status (by Frederic Gurr / Wayne Beaton)

#### Oxygen 1.a

  - Oxygen 1.a RC2 October 06, 2017
  - Oxygen 1.a GA October 11, 2017

The projects declaring their intents to particiate to this special
release to contribute Java9 and Junit5 related features are : Equinox,
MPC, WTP. This release will also include the fix for the MacOS issue:
<https://bugs.eclipse.org/bugs/show_bug.cgi?id=520176>

Wayne raise a question to the planning council about the fact that
potentially if the Oxygen 1.a will be released as we do for the other
classical releases, due to the updates about Java 9, it could break the
IDE of 1.6 million people after the automatic update. Wayne proposed to
keep the oxygen 1.a separated from the main repo and just disseminate to
users who just want to do Java 9 development. Wayne was asking if enough
people had already tested the JDT update to Java 9 through the
marketplace available install, according to the results he got, it seems
that it represents around 2% of the IDE users. Dani and the JDT team are
confident and the only issues they got at the moment are VM arguments
problem which is fixed for Oxygen 1.a. Today people using Oxygen.1 and
trying to run under Java 9 result to a non starting IDE. After
discussing the pros and cons the planning council decided to keep
releasing Oxygen 1.a as a classical update release. We all agreed that
if a major problem is detected after this update a respin will be done
as quick as possible to fix it.

#### Oxygen.3 / Java 18.3

Today Oxygen.3 is scheduled for March 21, 2018. In the past, we decided
to not move the Oxygen.1 release to provide Java 9 support and we
decided to release a special Oxygen 1.a. This in the end, confuse
people. So the question is do we want to adjust update.3 ? and so do not
no provide an update3.a ? The main problem for us at the moment is that
Java declared that they will do a release in March 2018 but they do not
define a clear date. Another question was raised that we pay attention
to the Java release schedule, but we do not care about C or PHP? Which
are important for CDT and or PDT?

#### Photon

  - Photon M2 September 22, 2017
  - Photon M3 November 03, 2017

Intent for participation is running pretty smoothly.

### EPLv2 (by Mélanie Bats)

Mélanie asked for more precision about the EPL 2 and if the planning
council should propose a schedule for the projects who want to update
their license to coordinate or if we just let the projects do it when
they want. The first press release by the foundation was not clear
enough about this as it said : "Users and adopters of Eclipse projects
should expect the next release of each Eclipse project will be using EPL
v2." View :
<https://www.eclipse.org/org/press-release/20170829eplv2.php>

Wayne said that the projects can move to EPL 2 when they want, there is
no specific requirement to update and he is trying to provide all the
expected documentation, CQs... about this before the end of the year. He
will send a mail on cross project also to clarify this.

Mikael will work on adding the EPL 2 to CBI as today projects using the
shared licence can not update to EPL 2, and the recommended practice is
to use the shared licence when a project participate to the SimRel.

### Brainstorm about the future of the SimRel (by Mélanie Bats)

The document used as the base for the discussion is available on :
<https://docs.google.com/document/d/1R3RhAKMFbtBrv3KcyLV48mQJRs59GHao7XEbzZM07Jw/edit?usp=sharing>

The planning council seems to agree that an evolution of the SimRel
habits would be useful and that we should give up the year long ramp up
to provide a predictable short release cycle. Some point have to be
discussed then to see how we go further:

  - What it would be exactly ? The idea is to provide no more update but
    a new release each time with only one stream. In that case code
    names seems meaningless.
  - How do we release it ? An option would be to keep only one
    repository in place and continuously update it which means from the
    users point of view new stuff with every release.
  - What would be the cadence ? A quarter release (every 12 weeks) looks
    feasible as it is more or less corresponding to the actual
    milestones cadence. The main change is that those "milestones" are
    considered as releasable.
  - How do we ensure API stability & compatibility ? When projects can
    make API break? How do we organize API freeze ? How do we deal with
    bigger features more than a release ?
  - How do we organize the verification & tests in order to evolve from
    a by hand homologation to a more automatic one ?
  - If we imagine that the developments could be done organized on the
    new release cycle, do the EDP delays, release review and manual IP
    log would scale ?

Mélanie proposed to continue this discussion on the mailing list to get
the maximum of opinions and be able to propose a new plan.

Mélanie proposed also to discuss this topic with the architecture
council and Wayne proposed to organize a planning council meeting at
EclipseCon Europe during lunch time or just to 'hijack' the architecture
council meeting to discuss this with more people.