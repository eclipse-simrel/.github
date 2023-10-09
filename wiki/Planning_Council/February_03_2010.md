## Logistics

|                |                                                                                                                                                                                                  |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Meeting Title: | **Planning Council Conference Call**                                                                                                                                                             |
| Date & Time:   | Wednesday, February 03, 2010, at [1700 UTC / 0900 SFO / 1200 NYC / 1700 London / 1800 Berlin](http://www.timeanddate.com/worldclock/fixedtime.html?year=2010&month=02&day=3&hour=17&min=0&sec=0) |
| Dial-in:       | For the call-in numbers, see the "Project Review" number on [Foundation Portal](https://dev.eclipse.org/portal/myfoundation/portal/portal.php) page.                                             |

## Attendees

<table style="width:30%;">
<colgroup>
<col style="width: 30%" />
</colgroup>
<tbody>
<tr class="odd">
<td><p>PMC (and Strategic) Reps</p>
<table>
<tbody>
<tr class="odd">
<td><p>Chris Aniszczyk</p></td>
<td><p>Technology (PMC)</p></td>
<td><p> </p></td>
</tr>
<tr class="even">
<td><p>John Arthorne</p></td>
<td><p>Eclipse (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Oliver Cole</p></td>
<td><p>Tptp (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>Brian Payton</p></td>
<td><p>Datatools (PMC)</p></td>
<td><p><br />
</p></td>
</tr>
<tr class="odd">
<td><p><del>Doug Gaff</del> ???</p></td>
<td><p>Dsdp (PMC)</p></td>
<td><p><br />
</p></td>
</tr>
<tr class="even">
<td><p>Anthony Hunter</p></td>
<td><p>Tools (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Oisin Hurley</p></td>
<td><p>Stp (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>Ed Merks</p></td>
<td><p>Modeling (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Thomas Watson</p></td>
<td><p>Rt (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>David Williams</p></td>
<td><p>WTP (PMC) (appointed Chair)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Gary Xue</p></td>
<td><p>Birt (PMC)</p></td>
<td><p><br />
</p></td>
</tr>
</tbody>
</table>
<p>Strategic Reps</p>
<table>
<tbody>
<tr class="odd">
<td><p>Cedric Brun</p></td>
<td><p>OBEO (Strategic Developer)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>Stefan Daume</p></td>
<td><p>Cloudsmith Inc.(Strategic Developer)</p></td>
<td><p>R</p></td>
</tr>
<tr class="odd">
<td><p>Neil Hauge</p></td>
<td><p>Oracle (Strategic Developer)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>Kaloyan Raev</p></td>
<td><p>SAP AG (Strategic Developer)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Markus Knauer</p></td>
<td><p>Innoopract (Strategic Developer)</p></td>
<td><p><br />
</p></td>
</tr>
<tr class="even">
<td><p>Christian Kurzke</p></td>
<td><p>Motorola (Strategic Developer)</p></td>
<td><p> </p></td>
</tr>
</tbody>
</table>
<p>Appointed</p>
<table>
<tbody>
<tr class="odd">
<td><p>Wayne Beaton</p></td>
<td><p>Eclipse Foundation (appointed)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="even">
<td><p>Mike Milinkovich</p></td>
<td><p>Eclipse Foundation (appointed)</p></td>
<td><p><br />
</p></td>
</tr>
</tbody>
</table>
<p><br />
<small>Note: feel free to correct any errors/omissions in above attendance record.</small><br />
<small>Y = Yes, attended</small><br />
<small>N = No, did not</small><br />
<small>R = regrets sent ahead of time</small></p></td>
</tr>
</tbody>
</table>

## Inactive

<table style="width:30%;">
<colgroup>
<col style="width: 30%" />
</colgroup>
<tbody>
<tr class="odd">
<td><table>
<tbody>
<tr class="odd">
<td><p> ?</p></td>
<td><p>Nokia (Strategic Developer)</p></td>
<td><p>X</p></td>
</tr>
<tr class="even">
<td><p> ?</p></td>
<td><p>CA Inc. (Strategic Consumer)</p></td>
<td><p>X</p></td>
</tr>
<tr class="odd">
<td><p> ?</p></td>
<td><p>brox IT-Solutions GmbH (Strategic Developer)</p></td>
<td><p>X</p></td>
</tr>
</tbody>
</table>
<p><br />
<small>Note: "Inactive" refers to <a href="http://www.eclipse.org/membership/showMembersWithTag.php?TagID=strategic">Strategic Members</a> we have not heard from in a year or so, and have been unable to convince to participate. Those members can become active again at any time. Contact David Williams if questions.</small></p></td>
</tr>
</tbody>
</table>



## Galileo

Any SR2 issues?

## Helios

### Exceptions for post-M4

  - LinuxTools
  - EEF
  - EGit
  - Riena

### Exceptions for post-M5

  - Sequoyah
  - Jetty
  - Heads up for Exception coming for Market Place Client ()

### Late M5 builds\!?

  -
    And what are we going to do about them?
      -
        *It was agreed in meeting to advocate "warm up" builds beginning
        at least the week (or two) before +0. This has the advantage
        that others, less comfortable with .build files and P2
        repositories, can do their own warm up build (or, early testing)
        before their deadline. This may, however, sometimes "break" the
        build if higher level items have to adjust their prereq
        versions, or similar. \[revisit in postmortem to explore better
        ways than '+0, +1, +2\]*

<!-- end list -->

  - Platform. John?

<!-- end list -->

  -

      -
        *Build was done on time, but tests take a long time to finish.
        \[good case for warm up builds to start on Helios, without
        necessarily final bits. Plus, good time for reminder that
        "meeting deadline" means build is done, tests are done, all
        votes in, builds promoted, and and ep.build file updated.*\]

<!-- end list -->

  - EMF. Ed?

<!-- end list -->

  -

      -
        *Unexpected, or poorly communicated, loss of member who used to
        do the builds. A replacement has been found, but will take some
        time to ramp up*.

<!-- end list -->

  - **In all cases of a missed deadline, it is essential to keep
    everyone informed on cross-project list, or else others end up
    thinking deadline was met, and may have to do extra debugging,
    re-work, or re-builds, etc. thus compounding the problem that could
    have been avoided with just a little better communication.**

### Cross-Project Teams

#### Aggregation

[Planning Council/Cross Project
Teams/Aggregation](Cross_Project_Teams/Aggregation.md)

Status: me, john, and thomas meeting on Friday

#### Structure of Common Discovery Site

*Due to lack of interest or volunteers, it was decided to drop this
item, and what we have must be good enough.*

  -
    users vs. extenders (minimum runtimes vs. SDKs)
    runtime targets vs. tools
    hierarchical categories (are more levels required?)

Anyone care? Any volunteers? (If not ... and you leave it up to me ...
you know what's going to happen, right?)

#### Tracking progress and compliance

  -
    [Planning Council/Cross Project
    Teams/Tracking](Cross_Project_Teams/Tracking.md)
      -
        me, gabe, and wayne have meetings once a week to check on
        progress. Sample: ![Image:Screenshot-1.png](Screenshot-1.png
        "Image:Screenshot-1.png")

<!-- end list -->

  -

      -
        Interim Plan: provide "check list style" version of
        requirements, similar to [original sample
        prototype](http://www.eclipse.org/helios/planning/EclipseSimultaneousReleaseFormPrototype.html)

<!-- end list -->

  -

      -
        Backup Plan?
          -
            xml files? (that can be transformed to pretty web page
            reports

<!-- end list -->

  -

      -
        ''Wayne did not have any additional information, but said he
        would check with Gabe. It is "high priority", but still under
        "EclipseCon work". ''

<!-- end list -->

  -

      -
        *Backup Plan C: revert to bugzilla*

## Other business

  - Propose face-face EclipseCon meeting 2:00 (local time) on the Sunday
    before EclispeCon (3/21)?

<!-- end list -->

  -

      -
        ''Confirmed (there was no clear alternative, so "like last year"
        seems best course). ''

## ToDo Items

(volunteers welcome)

  - create (and update) [helios container
    plan](http://www.eclipse.org/projects/project-plan.php?projectid=helios)
    (Wayne (re) volunteered)

<!-- end list -->

  - coordinate community input for next year's name (Oliver says last
    year this was started "shortly before EclipseCon" ... so, no rush).

<!-- end list -->

  - provide concrete instructions for (new) license-consistency
    requirement (John Arthorne).

<!-- end list -->

  - add automatic tests (e.g. non-api scans, layouts, presence of BREE,
    versioning, signed, etc.)

## Next Meeting

  -
    [March 3, Wednesday](March_03_2010.md),
    Noon Eastern Time.

## Reference

[Helios Simultaneous Release](Helios_Simultaneous_Release "wikilink")

[Planning Council
Members](http://www.eclipse.org/org/foundation/council.php#planning)

[Simultaneous Release Roles](Simultaneous_Release_Roles "wikilink") and
[Simultaneous Release
Roles/EMO](Simultaneous_Release_Roles/EMO "wikilink")