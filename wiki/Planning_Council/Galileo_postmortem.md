# Galileo Planning Council postmortem

*These notes were collected at the end of the Galileo Release,
6/17/2009, specifically just to collect them. And not to solve them, or
even suggest solutions, but just to capture issues (good and bad) while
the release was still fresh on our minds. Where solutions are suggested
below, it was just to better capture the issue discussed .. not really
to propose a solution. Action plans and solutions will be discussed in
the Fall.*

## History

Galileo is the fourth simultaneous release, following Callisto, Europa,
and Ganymede. The Planning Council met regularly, starting in August
2008, firming up much planning at the face-face meeting in October,
2008, at EclipseWorld. For meeting minutes, see
<http://wiki.eclipse.org/Planning_Council>.

The number of "must do" requirements was increased from previous years,
with an explicit desire to "raise the bar" and have projects reach a
(slightly) higher level of quality than in the past. The focus remained,
as in previous years, on the 'simultaneous' part of Simultaneous Release
(as opposed to, say, a "one huge product" emphasis).

The original Galileo-PC Chair (Richard Gronbech) "retired" in January
2009 (due to change in membership at Eclipse) \[thanks for getting us
off to a good start, Rich\!\] and a new chair (David Williams) was named
in March.

Our first delivered Simultaneous milestone was M6 (previous years were
M5 or M4).

## Comments from PC during 6/17 meeting

In general, PC members thought it went "ok", accomplished what was
intended.

The predictable date is great.

The common P2 repository is good, and very important (such as for EPP,
and others). Allows a common place to get code that at least is roughly
"correct" (in that the versions match up, the jars are retrievable, etc)
as compared to what it would be like going to 33 different URLs to get
the code that would be needed.

### Quantities

And, we did increase the number of projects participating, to 33 (or
so). The quantity was seen as important, and a positive aspect (best for
Eclipse and adopters) ... as long as quality is reasonable, and it is
understandable by consumers.

One issue related to "quantity" was the inconsistent nature of Project
level. Some, such as DTP, WTP, release and are tracked as one Top Level
Project (even though each made up of a number of sub-projects). Others,
such as Modeling projects not only had sub- projects, but also
sub-sub-projects. It was noted that even then, while there were 33
"projects" tracked for Galileo, there were 50 "projects" from the
Foundation's records and IP Logs. So at least consistency could be
improved, if not perhaps even have an explicit "roll up" to top-level
projects.

Another issue related to quantity: consistency with things like the type
and location of New and Noteworthy would be good.

Automated tests are good (e.g. to check version numbers, about files)
especially if earlier than this time and those test should be "rolled
out" to Projects to run during their own builds\!

### Communication

Many noted that communication with projects (Project Leads) needed to be
improved.

  -
    One idea was to have large group meetings.

<!-- end list -->

  -
    Another was encourage PMC reps to communicate more with their
    Project Leads they are representing.

<!-- end list -->

  -
    Another was to perhaps meet "with everyone" once per milestone.

Some specific communication issues:

  -
    'Capabilities' requirements were not communicated well, and could
    improve their "delivery".

<!-- end list -->

  -
    Late breaking requirement for Projects to update their meta-data to
    signify participation was not communicated to each PL.

### Quality and Purpose

The nature of "must do" was questioned. Some voicing support that most
really are "must do" to use project code as a coordinated release (for
example, signing doesn't help much unless everyone does it), even "new
and noteworthy" (not done by several projects) was probably not
communicated well that the goal is to "communicate with your users and
get your early testers motivated to do some early testing" .... and
without some early testing, it's not much of a release.

Some suggested presenting "must do" more along the lines of
"good-for-you to do" (i.e. in a project's best interests ... not an
arbitrary rule "for everyone else").

Question raised about if "the release" and "update site" should be
decoupled? Then projects could be in common discovery site, even if not
in simultaneous release. \[In previous meetings, we discussed and
concluded "no" ... just documenting here what was discussed\].

Keep emphasis on ability to meaningfully consumed (by end-users and
adopters).

Keep emphasis on "participation" by projects (and even increase that)
(that is, attend meetings, respond to notes, etc.)

Could "participation" be defined differently for different projects (for
example, some might want to be "date only", some meet some core
requirements, but not all).

Perhaps projects could decide (in advance) in which capacity they would
participate. And then, "declare intent" early, so adopters know what to
expect.

Discussion lead to the question of why do projects participate in the
first place? No one seemed to know :) so thought we should ask them.
Some reasons that have been heard in the past:

\- they want mutual dates to allow easier consumption

\- coolness

\- right of passage (a recognized "real" Eclipse project then)

\- learn a lot from the community of those releasing

\- publicity and visibility

\[See Ian's BLOG on the 10 new projects for this release.\]

### Misc

Some wondered if we could improve the "delivery" of the code?

\- new front end to discovery site? Such as more "questions and answers"
or wizard to narrow choices.

\- should we still have EPP Packages.

\- not to mention issues of zip files versus installable repositories.

Some would like longer-than-a-year maintenance.

P2 is still not used by all adopters, being unpredictable and not
understandable whereas update manager works as expected (in same
context). \[Sort of unrelated to Simultaneous Release ... but kind of
is.\]

## Notes after the meeting

One of the 'good' things about this cycle was improvements in the
"aggregation" process; First with the builder created by Rich, which
introduced the concept of modeling in the builds and build process (doh,
why didn't we think of that before\!) and then later with the
Buckminster based builder which, among other things, worked around some
P2 limitations to mirror sites much more quickly than otherwise
possible, and added better 'integrity' checking and not, for example,
accept bundles with incorrect checksums. Hopefully, many of these
concepts can be carried forward into PDE and/or P2 directly, but we
could not have done the Galileo release without these innovative
approaches to dealing with thousands of plugins.

A thought during final few days. There's really no process in place to
"approve" changes at the last minute. It would be best to have an
initial PMC Review, and then a request come from that PMC to Planning
Council for final "vote" on respin or not respin.

During August Planning Council, John Arthorne provided some additional
feedback (to paraphrase): The Eclipse Platform team did not participate
in forming these notes, but that it corresponds to their own
team-meeting notes, except they would have also added the "+1", "+2"
categories of dependencies may be too simplified, since in reality, some
projects need to deliver part of their components, say, at +0 or +1, but
another leaf component at +2 or +3). They would also appreciate making
sure that the simultaneous release criteria be better explained.

See also
[Galileo_postmortem_PLs](Planning_Council/Galileo_postmortem_PLs.md)

[Category:Galileo](Category:Galileo "wikilink")