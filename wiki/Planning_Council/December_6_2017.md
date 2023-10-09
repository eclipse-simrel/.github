## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, December 6, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=12&amp;day=6&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
</tr>
<tr class="odd">
<td><p>Dial in:</p></td>
<td><p>Topic: PC call - Dec 6 only Time: Dec 6, 2017 12:00 AM Eastern Time (US and Canada)</p>
<p>Join from PC, Mac, Linux, iOS or Android: <a href="https://eclipse.zoom.us/j/636198543?pwd=tWzAHHXJzXQ">https://eclipse.zoom.us/j/636198543?pwd=tWzAHHXJzXQ</a></p>
<p><code>   Password: 123456</code></p>
<p>Or iPhone one-tap :</p>
<p><code>   US: +14086380968,,636198543#  or +16468769923,,636198543#</code></p>
<p>Or Telephone:</p>
<p><code>   Dial(for higher quality, dial a number based on your current location)：</code><br />
<code>       US: +1 408 638 0968  or +1 646 876 9923  or +1 669 900 6833</code><br />
<code>   Meeting ID: 636 198 543</code><br />
<code>   International numbers available: </code><a href="https://eclipse.zoom.us/zoomconference?m=nNBU6gfmKc0Nc84Dn4eAG6zY9BDa2x6C"><code>https://eclipse.zoom.us/zoomconference?m=nNBU6gfmKc0Nc84Dn4eAG6zY9BDa2x6C</code></a></p></td>
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
  - Ericsson AB (Marc-Andre Laperle)
  - IBM (Thomas Watson)
  - itemis AG (Alexander Nyssen)
  - Obeo (Melanie Bats)
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

  - Oxygen & Photon status (by Fred Gurr/Mikael Barbero)
  - Future of the SimRel (by Mélanie Bats)

## Notes

### Oxygen & Photon status (by Fred Gurr)

Everything is going nicely, there is no big issue.

Oxygen.2:

  - this week = RC4
  - next week = quiet week
  - release for Wednesday, December 20, 2017

Photon M4 is for Friday, December 15, 2017

Fred works on cleaning the SimRel Jenkins instance, some disk space,
improving wiki pages...

### Future of the SimRel

The planning council has decided to propose for the future of the SimRel
that :

  - A new release will occur every 12 weeks.
  - All the work will be done only on one stream.
  - And that only one repository will be used that will be continuously
    updated. A stable "latest" URL will be used to allow the user to
    update continuously.
  - Specific URLs will be available to reference any release.
  - The opt-in process will evolve, mostly projects would be assumed
    "in" and someone will take care of cleaning the outdated projects
    from time to time.
  - It would be possible to add, update and remove API on any release.

Before deletion an announcement of the intention would be done a long
time before (1 year or 2 year) in order that the depending projects have
time to upgrade to the new API.

  - As The release cycle will be shorter, we will have also shorter
    period for breakage and shorter testing phase. A proposed planning
    will be discussed on the mailing list
  - A nightly SimRel build should be running.

Remaining questions :

  - How do we organize the verification & tests in order to evolve from
    a by hand homologation to a more automatic one ?

How do we implement integration testing ? Do we automatically create
something which contains everything starting it and see how it is going
on ? who would be responsible for that ?

  - Do the EDP delays, release review and manual IP log would scale ?

Theoretically release review should be done 2 weeks before the release.
But it is possible to continue to accept new contributions after that.
So changing the frequency should not change nothing for this point.

  - How do we name the releases ? What do we do about code names?