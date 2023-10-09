## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, January 3, 2018, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2018&amp;month=01&amp;day=3&amp;hour=12&amp;min=0&amp;sec=0&amp;p1=179">1200 Noon Eastern</a></p></td>
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

  - Oxygen & Photon status (by Fred Gurr)
  - CBI aggregator
  - Future of the SimRel (by Mélanie Bats)

## Notes

/\!\\ Very low participation : Kind reminder to everyone, as a Planning
Council Member you should participate to the call and to the mailing
list, when you are not available for the call you should send a
representative.

### Attendance

Aleksandar Kurtakov (Tools Project), Dani Megert (Eclipse Project),
Frederic Gurr (Eclipse Foundation), Mélanie Bats (Obeo)

### Regrets

Martin Lippert (Eclipse Cloud Development PMC), Alexander Nyssen (itemis
AG), Mikael Barbero (Eclipse Foundation), Wayne Beaton (Eclipse
Foundation), Nick Boldt (Red Hat; on vacation this week)

#### Oxygen & Photon status (by Fred Gurr)

Not a lot to say, Photon M4 & Oxygen.2 were released. Next steps :
Photon M5 Friday, February 02, 2018 and Oxygen.3 Wednesday, March 21,
2018

An Oxygen.3a should occur due to the release of Java 10 in March 20,
2018

#### CBI aggregator

Raised by Stephan Herrmann
<https://bugs.eclipse.org/bugs/show_bug.cgi?id=528798>

Should we keep CBI aggregator alive or do we switch to a Tycho based
solution?

Aleksandar points that the code of the CBI aggregator is outdated,
unmaintainable and makes lots of assumptions about P2 that are not
anymore true. No one still knows the code base. In another hand, lots of
people are used to work with Tycho. A year ago Mickael Istria started to
create some patches to got to a Tycho based solution. Fred will have a
look to the remaining patches not yet merged. Aleksandar says that they
will try to push to a Tycho based solution but without any promise. In
any case, Fred will support any moves, and keep the releng running until
a new solution works.

#### Future of the SimRel

The Planning Council has decided for the future of the SimRel that :

  - A new release will occur every 12 weeks.
  - All the work will be done only on one stream.
  - And that only one repository will be used that will be continuously
    updated. A stable "latest" url will be used to allow the user to
    update continuously.
  - Specific urls will be available to reference any release. No
    composite repos will be built.
  - The opt-in process will evolve, mostly projects would be assumed
    "in" and someone will take care of cleaning the outdated projects
    from time to time.
  - It would be possible to add, update and remove API on any release.

The Planning Council discussed the following points during the call:

  - A first release cycle planning was discussed:
      - M1 Friday Week 2
      - M2 Friday Week 4
      - M3 Friday Week 6
      - M4 Friday Week 8
      - RC1 Friday Week 9 API & Feature freeze
      - RC2 Friday Week 10
      - Quiet week Week 11, it is assumed all code is done by the end of
        RC2.
      - GA Wednesday Week 12

We still need to be nail how the legal team can handle the load of CQs
and how we deal with the release reviews, maybe they can be simplified?

When the EPP packages will be built ? For each milsetones and RCs? How
many manual work it needs? We should take care of that and discuss this
with EPP packages maintainers?

Between M4 and RC1 accepted changes will be only the ones to adjust what
came with M4 for projects that are higher in the stack.

  - The existence of a nightly SimRel build was also discussed, would it
    be an aggregation only build ? or building from the source ? It was
    conclude that it would not be necessary if the Gerrit builds run
    enough.