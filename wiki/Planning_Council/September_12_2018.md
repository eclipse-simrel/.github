## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, Sep 12, 2018, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2018&amp;month=09&amp;day=12&amp;hour=11&amp;min=0&amp;sec=0&amp;p1=179">11:00 EDT</a></p></td>
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

Nick Boldt, Wayne Beaton, Frederic Gurr, Pierre Charles David, Dani
Megert, Tom Watson

## Agenda

None posted in advance.

## Regrets

## Notes

### \[Fred\] Simrel status: green

  - Small issues w/ aggregation
      - Missing repo from RAP? Pipeline not notifying committers when
        breaks happen. AI: Fred to fix today
  - Gerrit trigger not compatible with pipeline job, so freestyle job
    enabled instead for gerrit reviews
  - HIPPs being flaky last couple days, not impacting simrel, just
    upstream projects

### \[Wayne\] Release review status: yellow?

  - Unsure if everyone has declared & approached EMO for reviews
  - Concerned with projects ”breezing in late”, ie., changing things
    between RCx and Final? BIRT did this for Photon.
      - To prevent this, the aggregation pipeline job is disabled to
        prevent new stuff being aggregated after RC
  - Opt in date - is it still reasonable?

BIRT still using their Photon contribution - is that cause for alarm
(project dormant), or does it demonstrate stability (nothing needs
changing between quarterly releases) ? More importantly, how do we know?

  - Arch council planning to change process for release reviews
    annually, not quarterly. IP rules not changing. See [cross-projects
    list](https://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg15971.html)
    for more info.