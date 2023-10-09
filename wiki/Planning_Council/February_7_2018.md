## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, February 7, 2018, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2018&amp;month=02&amp;day=7&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
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

## Agenda

  - Photon & Oxygen status
  - Oxygen 3.a for Java 10 support
  - Future of SimRel

## Attendance

Aleksandar Kurtakov (Tools Project), Dani Megert (Eclipse Project), Ed
Merks (Eclipse Modeling Project), Frederic Gurr (Eclipse Foundation),
Martin Lippert (Eclipse Cloud Development), Mickael Barbero (Eclipse
Foundation), Mélanie Bats (Obeo), Nick Boldt (Red Hat), Sam Davis
(Mylyn), Thomas Watson (IBM), Wayne Beaton (Eclipse Foundation), EE4J

## Notes

### Photon & Oxygen status

Photon M5 shipped last Friday 02/02. Some project were disable as
EGerrit, Subversive... and the dependent project were disable as well.
LDT missed Photon M5 but will rejoin on M6.

There were some issues for EPP built see for details. In the end, build
succeeded and packages are available on website.

Next steps : Oxygen.3 RC1 February 9. Photon M6 March 16.

### Oxygen 3.a for Java 10 support

Support for Java 10 will be delivered as an update 3a as what we did for
1a and Java 9. Only projects providing changes needed for Java 10 can
participate in this release.

The planning approved by the council is :

  - \+0 on Friday
  - \+1 on Monday
  - \+2 on Tuesday
  - \+3 on Wednesday
  - EPP on Thursday
  - Complete RC Available on (next) Friday

<!-- end list -->

  - RC1 +0: Friday, March 23
  - RC2 +0: Friday, March 30
  - GA: Wednesday, April 11

Java 10 is mostly a test bend for Oracle short release cycle, there is
few features. From the JDT point of view it is mostly the support of
local variable type inference : <http://openjdk.java.net/jeps/286>

### Future of SimRel

The Planning Council has decided for the future of the SimRel that :

  - The release will be 12 weeks long. The releases will occur almost
    every 12 weeks +1 or +2 weeks depending on period to prevent
    holidays time and keep the planning equal each year.
  - All the work will be done only on one stream.
  - And that only one repository will be used that will be continuously
    updated. A stable "latest" update site will be used to allow the
    user to update continuously.
  - Specific update sites will be available to reference any release. No
    composite repos will be built.
  - The opt-in process will evolve, mostly projects would be assumed
    "in" and someone will take care of cleaning the outdated projects
    from time to time.
  - It would be possible to add, update and remove API on any release.

The Planning Council proposed the following release cycle planning:

  - C1 Friday Week 3 Checkpoint
  - M1 Friday Week 5 --\> testing & packages, API breakage in
  - C2 Friday Week 7
  - RC1 Friday Week 10 API & Feature freeze
  - RC2 Friday Week 11, it is assumed all code is done by the end of
    RC2.
  - GA Wednesday Week 12

Mikael asked if a solution should be developed for rollbacking to a
previous release in order to revert stuff. The conclusion was that it
would be prefered to make efforts to release a new version pretty fast
if needed.

According to the proposed plan EPP packages will be built at M1, RC1 &
RC2, this means 3 times in 5 weeks. How many manual work it needs? We
should take care of that and discuss this with EPP packages maintainers?
3 in 6 weeks ? Produce packages can be automated ? Mélanie will launch
this discussion on the EPP mailing list to ask the EPP maintainers what
they think about this.

  - How do we name the releases ? What do we do about code names?

It exists at least 3 different possibilities:

`* Using a year/month pattern : YYYY-MM`
`* Using codename pattern : CodeName.X`
`* Using a mix of the two previous patterns : YYYY-MM CodeName.X`

Mélanie will propose something on the mailing list but a first
conclusion was that changing name pattern could just reflect the fact
that things are changing.

Mélanie will prepare also a mail to cross project to share our post
photon plans to a larger part of the community.