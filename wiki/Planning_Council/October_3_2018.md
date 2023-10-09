## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, Oct 3, 2018, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2018&amp;month=10&amp;day=03&amp;hour=11&amp;min=0&amp;sec=0&amp;p1=179">11:00 EDT</a></p></td>
</tr>
<tr class="odd">
<td><p>Dial in:</p></td>
<td><p>Topic: Planning Council Meeting Time: this is a recurring meeting Meet anytime</p>
<p>Join from PC, Mac, Linux, iOS or Android: <a href="https://eclipse.zoom.us/j/928841320">https://eclipse.zoom.us/j/928841320</a></p>
<p>Or iPhone one-tap :</p>
<p><code>   US: +16699006833,,928841320#  or +14086380968,,928841320#</code></p>
<p>Or Telephone:</p>
<p><code>   Dial(for higher quality, dial a number based on your current location)：</code><br />
<code>       US: +1 669 900 6833  or +1 408 638 0968  or +1 646 876 9923</code><br />
<code>       Canada: +1 647 558 0588</code><br />
<code>       France: +33 (0) 1 8288 0188</code><br />
<code>       Germany: +49 (0) 30 3080 6188</code><br />
<code>       United Kingdom: +44 (0) 20 3695 0088</code><br />
<code>       Switzerland: +41 (0) 31 528 0988</code><br />
<code>       Sweden: +46 (0) 8 4468 2488</code><br />
<code>       Denmark: +45 89 88 37 88</code><br />
<code>       Netherlands: +31 (0) 20 241 0288</code><br />
<code>   Meeting ID: 928 841 320</code><br />
<code>   International numbers available: </code><a href="https://eclipse.zoom.us/zoomconference?m=DufCm8dm7aEOYkLMWpY6qLgJMUtWhOnf"><code>https://eclipse.zoom.us/zoomconference?m=DufCm8dm7aEOYkLMWpY6qLgJMUtWhOnf</code></a></p></td>
</tr>
</tbody>
</table>

## Members

Temporary Planning Council Chair: Nick Boldt Planning Council Chair:
Melanie Bats (returns Dec 2018)

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
  - Eclipse Project PMC (Dani Megert)
  - IoT
  - LocationTech Technology
  - Eclipse Modeling Project PMC (Ed Merks)
  - Mylyn (Application Lifecycle Tools) PMC (Sam Davis)
  - PolarSys
  - Eclipse Runtime Project (RT) PMC
  - Eclipse Science
  - Service Oriented Architecture PMC (Adrian Mos)
  - Technology PMC (Chris Aniszczyk)
  - Tools Project PMC (Aleksandar Kurtakov)
  - Eclipse Web Tools Platform Project (WTP) PMC (Carl Anderson)

## Previous meeting minutes

  - Review [previous meeting minutes](../Planning_Council.md) if
    you'd like. That is, review them before the meeting, but if
    questions or issues with previous minutes, this would be a good time
    to bring them up.

## Attendance

Nick Boldt, Frederic Gurr, Martin Lippert, Pierre Charles David, Tom
Watson, Dani, Mikael Barbero, Alex K

## Agenda

  - \[Wayne\] Simultaneous Release Dates for 2018-12 -
    <https://www.eclipse.org/lists/eclipse.org-planning-council/msg03148.html>

:\* CQ submission deadline

:\* Nov 28 - IP log submission deadline

:\* Dec 5 - Review and N\&N due

:\* Dec 19 - Release reviews

:\* Dec 19 - Eclipse SimRel 2018-12 GA

  - \[Wayne\] Opt-in rules: announcement requirement? join-in/drop-out
    deadline?

### Bonus Bikeshedding Topic

  - \[Wayne\] Eclipse *Placeholder* IDE for Java Developers, 2018-12
    Edition" is created from the "Eclipse *Placeholder* Simultaneous
    Release": what could we use for *Placeholder*?

## Regrets

## Notes

### Schedule, Dates, Opt-in vs. Opt-out

Dani/Wayne: Rather than opting in, we throw everyone out (disable all
aggregator files) and they re-add themselves if they're not a new
project.

Fred: We used to do this, but because some projects didn't reply in
time, this broke some M1 builds. We decided to opt-out instead of opt-in
to avoid needlessly broken early builds.

Wayne: I can't recall which approach we prefer. Dani: We decided not to
throw out projects as this would be too disruptive (see Fred's comment).

Dani: what's wrong with using the release record for opt-in?

Wayne: Even simpler than having to update release record, we would just
have this opt-in recorded in aggregator files.

Dani/Wayne: we should enforce no /latest/ URLs in aggregator files, so
it's more obvious that people are opting in, contributing new builds.

Wayne: if you're new, you must announce yourself. Existing projects w/
breaking changes should announce those changes (eg., platform 4.10
dropping 32-bit support).

**AI**: Wayne: add a new date to the simrel schedule for when an
announcement is send to cross-projects@, to report who we think is
participating. If URLs are found w/ /latest/ or snapshot, they should be
disabled?

**AI**: Wayne: send note to cross-projects@ to announce not opting in

Fred: auditing will be in place to prevent late changes / new features
being added after M3, eg., as simple as disabling jenkins jobs?

**AI**: Wayne: update "ASAP" re: "Create your release record (for new
releases)". Actual date is on/before Oct 19.

**AI**: Wayne: create a wiki page for N\&N so projects can choose to
post their content. Deadline 2 weeks before GA (Dec 5). Offer of help
from Lakshmi?

  -
    **AI**: Dani: to follow up if Wayne doesn't find Lakshmi's email

**New** projects must join by M1, Oct 19 (not Oct 5 as previously
suggested).

### Bikeshedding

2 questions from the Foundation to solve:

  - TLP rename
  - simrel rename

Dani: (for TLP) show me the rules where it says the name must be
trademarkable

Alex: who is responsible for maintaining this doc? how can we get it
changed/evolved?

**AI**: Wayne to produce documentation re: rules and send to
planning-council list

### ECE Planning Council Meetup?

Dani: who will be at ECE? Arch council has a breakfast. We could do a
planning council meetup. Fred/Dani/Wayne to plan a meeting

Wayne: if you want informal we can do that; if more formal might require
some effort to plan

**AI**: Dani: send email to planning-council list to see who'll be at
ECE and who would want to meetup.

### Simrel status

2018-09M1 had some challenges, but plans are in place to avoid those
problems when we start up 2018-12 M1 soon.

**AI**: Fred restrict pushing to simrel w/o gerrit review

### Portal sunset

Everything should be moved over to <https://accounts.eclipse.org/>
already, but if you find anything that isn't please email wayne / open a
BZ with links/details.