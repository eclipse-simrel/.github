## Logistics

|                |                                                                                                                                                             |
| -------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Meeting Title: | **Planning Council Conference Call**                                                                                                                        |
| Date & Time:   | Wednesday, September 07, 2011, at [1200 Eastern](http://www.timeanddate.com/worldclock/fixedtime.html?year=2011&month=09&day=07&hour=12&min=0&sec=0&p1=179) |
| Dial-in:       | For the call-in numbers, see the "Project Review" number on [Foundation Portal](https://dev.eclipse.org/portal/myfoundation/portal/portal.php) page.        |

## Members and Attendees

<table>
<tbody>
<tr class="odd">
<td><p>width="100%" valign="top"</p></td>
<td></td>
<td><table>
<caption><strong>PMC (and Strategic) Reps</strong></caption>
<tbody>
<tr class="odd">
<td><p>Chris Aniszczyk</p></td>
<td><p>Technology (PMC)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>John Arthorne</p></td>
<td><p>Eclipse (PMC)</p></td>
<td></td>
</tr>
<tr class="odd">
<td><p>??</p></td>
<td><p>?TPTP? (PMC)</p></td>
<td><p>X</p></td>
</tr>
<tr class="even">
<td><p>Mik Kersten</p></td>
<td><p>Mylyn (ALM) PMC</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Brian Payton</p></td>
<td><p>Datatools (PMC)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>Doug Schaefer</p></td>
<td><p>Tools (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Adrian Mos</p></td>
<td><p>SOA (PMC)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>Ed Merks</p></td>
<td><p>Modeling (PMC)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Jesse McConnell</p></td>
<td><p>Rt (PMC)</p></td>
<td><p>Y (with Tom Watson, "for his last meeting" :)</p></td>
</tr>
<tr class="even">
<td><p>David Williams</p></td>
<td><p>WTP (PMC) (appointed Chair)</p></td>
<td><p>Y</p></td>
</tr>
<tr class="odd">
<td><p>Gary Xue</p></td>
<td><p>Birt (PMC)</p></td>
<td></td>
</tr>
</tbody>
</table></td>
<td><table>
<caption><strong>Strategic Reps</strong></caption>
<tbody>
<tr class="odd">
<td><p>Cedric Brun</p></td>
<td><p>OBEO (Strategic Developer)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>Stefan Daume</p></td>
<td><p>Cloudsmith Inc.(Strategic Developer)</p></td>
<td></td>
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
<td><p>Pascal Rapicault</p></td>
<td><p>Sonatype (Strategic Developer)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>Markus Knauer</p></td>
<td><p>Innoopract (Strategic Developer)</p></td>
<td></td>
</tr>
<tr class="odd">
<td><p>Christian Kurzke</p></td>
<td><p>Motorola (Strategic Developer)</p></td>
<td></td>
</tr>
<tr class="even">
<td><p>Achim Loerke</p></td>
<td><p>BREDEX (Strategic Developer)</p></td>
<td><p>Y</p></td>
</tr>
</tbody>
</table></td>
</tr>
<tr class="even">
<td><p>width="100%" valign="top"</p></td>
<td></td>
<td><table>
<caption><strong>Appointed</strong></caption>
<tbody>
<tr class="odd">
<td><p>Wayne Beaton</p></td>
<td><p>Eclipse Foundation (appointed)</p></td>
<td></td>
</tr>
</tbody>
</table></td>
<td><table>
<caption><strong>Inactive</strong></caption>
<tbody>
<tr class="odd">
<td><p>[no name]</p></td>
<td><p>Nokia (Strategic Developer)</p></td>
<td><p>X</p></td>
</tr>
<tr class="even">
<td><p>[no name]</p></td>
<td><p>CA Inc. (Strategic Consumer)</p></td>
<td><p>X</p></td>
</tr>
<tr class="odd">
<td><p>[no name]</p></td>
<td><p>brox IT-Solutions GmbH (Strategic Developer)</p></td>
<td><p>X</p></td>
</tr>
</tbody>
</table></td>
</tr>
</tbody>
</table>

<small>Note: "Inactive" refers to [Strategic
Members](http://www.eclipse.org/membership/showMembersWithTag.php?TagID=strategic)
we have not heard from in a year or so, and have been unable to convince
to participate. Those members can become active again at any time.
Contact David Williams if questions.</small>

<small>Note: feel free to correct any errors/omissions in above
attendance record.</small>
<small>Y = Yes, attended</small>
<small>N = No, did not</small>
<small>R = regrets sent ahead of time</small>
<small>X = not expected</small>

## Announcements

  - *none*

## Indigo SR1

### What to do about breaking changes?

Achim: We discovered an issue where a change in Equinox broke
EclipseLink for Jubula
[Bugzilla](https://bugs.eclipse.org/bugs/show_bug.cgi?id=355484). We
filed this bug which is a showstopper for us shortly after RC1 and the
fix will be in RC4. This leaves us with very little time to do any
testing on the release (Of course we've tested this on internal builds
but the RCs where not testable). What is the recommended way to deal
with this? We could have fixed this for the EPP packages by using
specific versions of Equinox and/or EclipseLink but that would still
leave the feature in the repo unusable.

  -

      -
        davidw: I think you handled it in the best way possible. First,
        opening the bug, and second, drawing attention to it via your
        [post to cross-project
        list](http://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg06428.html).
        If you are asking if there is a way to extend the schedule for
        extra time for testing, I'd say "no", we seldom have (never, so
        far), and this case doesn't seem to need it. If you are asking
        if there is an "escalation path", I'd also say "no" (there is,
        if you feel you were being treated unfairly according to Eclipse
        by-laws, but "technical issues" would seldom qualify). In other
        words, "support" needs to be worked out between projects, and
        there is no absolute, perfect, guarantee of support. In general,
        there is certainly every intent to avoid breaking others, and
        from reading the bug report, it sounds like there were two known
        paths forward (fix the EclipseLink code, or the Equinox fix
        could have been backed out until later). If you want to scold
        the Equinox team for making a breaking change in behaviour ...
        consider is done\! :) I do sympathize with them for this case
        though, as it is a difficult case to deal with ... where the API
        behaviour is implemented wrong, according to its documented
        contract, so in fixing that bug, it is discovered someone was
        accidentally depending on the incorrect behaviour. We must be
        able to "fix API behaviour" but, granted, it is risky to do so
        in a maintenance release and this case serves as an excellent
        reminder to all teams to use great care in doing that. All in
        all, this issue actually has an excellent outcome, thanks to you
        and your teams testing early, and thanks to Tom Watson and Tom
        Ware getting the fix in time for SR1. In other, cases, if had
        been found too late, shortly after the Service Release, it would
        have been impossible to "back out" the change, and would have
        only left out the option of someone producing a patch to apply
        after the fact. So, thank you for finding and thank you for
        drawing our attention to it.

<!-- end list -->

  -

      -
        achim: Just to make this clear: we don't blame any project at
        all. It was okay for the Equinox team to fix a problem in their
        API and the EclipseLink team responded equally well. Since the
        fix will be in RC3 we don't have a problem in testing the
        release, so all changed for the good. Our heart rate is back
        close to normal:-) I still don't know what would have happened
        if the issue had not been resolved. Is it possible to "skip" a
        service release in this case? Delivering a non-working
        feature/package obviously can't be a valid solution.

*We could not come up with general solution that would fit all cases
(after all, it is an exception, and hard to anticipate all possibilities
for exceptions) but "skipping a service release" could be one drastic
solution. A less drastic solution would have been to back out the
original fix ... as a general rule (after I have just said there were
not any :) ... is that "status quo" usually trumps "fixes" (that is,
better to have the original bug, until a better fix can be made, if a
fix causes a worse regression). The take-away message from this
experience, though, that pretty much any blocking problem can be solved,
due to the commitment and skills of Eclipse committers. It has happened
several times over the years. Thanks for reporting, thanks for fixing,
and thanks for the discussion.*

### Tweak future SR drop windows?

Should we tweak schedule for SR2 (and future maintenance releases)? So
weekly rhythm is same for maintenance as release? Namely, instead of
Monday (+0) to Friday, have Friday (+0) to Friday?

*There were no objections during meeting, and I checked with John and
Kim for Platform, and they said "fine". I will change calendar, plan,
and announce to cross-project list after SR1 (to avoid confusion or
churn during SR1).*

### Is there an issue with pack.gz files?

I've not understood the the implications of the [cross-project
thread](http://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg06431.html)
on this topic ... does anyone else? Is there something to fix or solve?

  -
    I opened . Does seem an issue, but does not seem to be a regression.

### Any other issues?

*Ed gave a "heads up" that gmf-tooling might try a release and be a "new
addition" for SR1 ... as long as they fulfil the normal release and SR
requirements (such as signed jars, etc.) this is within our policy.
(but, getting pretty late\!) Ed said there were no direct dependencies
in Indigo stack, so no risk of breaking others (famous last words :).
But seriously, we do want to welcome those that make the effort to be
part of Eclipse Simultaneous Release and do what we can. It is mostly up
to the project's PMC to say "yea or nay" (and Ed said he'd support it,
if they get coordinated quickly).*

## Indigo Retrospective

Primary purpose is to brainstorm; to capture good and bad aspects of
Indigo Simultaneous Release. While we want items to be actionable, we do
not want to "judge" or get distracted by finding solutions, in this
initial meeting.

We'll capture notes in [Planning
Council/Indigo_retrospective](Indigo_retrospective.md).

Before the meeting, please review [last year's
notes](Helios_retrospective.md).

''Useful discussion. See [Planning
Council/Indigo_retrospective](Indigo_retrospective.md)
for notes I captured. ''

## Juno Requirements

### Support for Eclipse 3.8 workbench

We will have 4.2 as primary (hence the one used for EPP Packages) but
ask participating projects to have a clear plan item titled, exactly,
"Support for Eclipse 3.8 workbench" where possible descriptions might be
similar to:

  - Not at all. No support for 3.8 based apps.

<!-- end list -->

  - We will accept bugs against 3.8 based apps, but do not test or
    compile against it.

<!-- end list -->

  - We will compile against and somewhat test 3.8, though 4.2 is
    primary.

<!-- end list -->

  - We will support 3.8 as well as 4.2, but the exact functionality may
    differ.

<!-- end list -->

  - We will support 3.8 and 4.2 equally.

*Good discussion with Modelling Rep (i.e. Ed). He did feel sort of
obligated to support 3.8, since he knows it would "short circuit" a
whole stack of plans, if not. So, he'll look into what it'd take, at
least from a releng/build point of view (and, will likely depend on
consumers to test one of the stacks). He thinks they can do it with "one
stream", but the issue for them is their prereq versioning ranges. They
currently set ranges automatically during builds ... at least for lower
bound ... setting the lower bound to be equal to what they build
against, so, first impression, is they could build against 3.8 and that
be used for both 3.8 and 4.2 stacks. Apparently upper level is "set" to
be 5.0, or similar? Thanks for the insights.*

## Next Meeting

  - October 5, 2011 (our regular "first Wednesday" meeting, at Noon
    Eastern).

## Reference

  -
    [Indigo
    Requirements](http://www.eclipse.org/indigo/planning/EclipseSimultaneousRelease.php)

<!-- end list -->

  -
    [Juno Wiki page](Juno "wikilink")

<!-- end list -->

  -
    [Planning Council/Helios
    retrospective](Helios_retrospective.md)

<!-- end list -->

  -
    [Indigo Simultaneous
    Release](Indigo/Simultaneous_Release_Plan "wikilink")

<!-- end list -->

  -
    [Planning Council
    Members](http://www.eclipse.org/org/foundation/council.php#planning)

<!-- end list -->

  -
    [Simultaneous Release Roles](Simultaneous_Release_Roles "wikilink")
    and [Simultaneous Release
    Roles/EMO](Simultaneous_Release_Roles/EMO "wikilink")