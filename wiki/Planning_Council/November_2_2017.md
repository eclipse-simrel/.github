## Logistics

<table>
<tbody>
<tr class="odd">
<td><p>Meeting Title:</p></td>
<td><p><strong>Planning Council Conference Call</strong></p></td>
</tr>
<tr class="even">
<td><p>Date &amp; Time:</p></td>
<td><p>Wednesday, November 10, 2017, at <a href="http://www.timeanddate.com/worldclock/fixedtime.html?year=2017&amp;month=11&amp;day=10&amp;hour=11&amp;min=0&amp;sec=0&amp;p1=179">1100 Noon Eastern</a></p></td>
</tr>
<tr class="odd">
<td><p>Dial in:</p></td>
<td><p>Topic: PC call - Nov 10 only Time: Nov 10, 2017 11:00 AM Eastern Time (US and Canada)</p>
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

  - Oxygen & Photon status (by Fred Gurr/Mikael Barbero)
  - JDT & Platform news (by Dani Megert)
  - Status of the brainstorm about the future of the SimRel (by Mélanie
    Bats)

## Notes

### Oxygen & Photon status

Photon M3 was a little bit tend Oxygen 2 RC1 is for December 20th Photon
M4 on 15th

No real issues at the moment.

### JDT & Platform news

Java releases will occur in March & September every year. It was decided
to keep the Simultaneous Release schedule stable as lots of projects are
not interested by Java at all and so do not depend on the Oracle
planning. So when necessary a ".a" version will be released as it was
done for Oxygen1.

The Eclipse SDK will change its release cadence after Photon to a
release every 3 months. See the cross project mailing list for details :
[1](https://dev.eclipse.org/mhonarc/lists/cross-project-issues-dev/msg15021.html)

JDT and Platform has decided to

#### JDT dependent projects

To avoid the problem that appeared during the last JDT update, it was
discussed at ECE to list all the projects depending on the JDT. The
purpose is to get an overview, then we have to decided what we will do
next when a JDT update come out? Should the automated build must
notified automatically those projects ?

Here is the list of JDT dependent projects, that I gathered by scanning
for "\*.jdt\*" in MANIFEST.MF files in all plugins (except JDT plugins)
in the latests Photon release P2 repo:

  - List of JDT dependent projects
      - ./org.apache.jasper (bundles jdt so not affected)
      - ./org.eclipse.acceleo
      - ./org.eclipse.ant (Eclipse TLP so released together with JDT)
      - ./org.eclipse.birt
      - ./org.eclipse.bpmn2
      - ./org.eclipse.buildship
      - ./org.eclipse.cft
      - ./org.eclipse.datatools
      - ./org.eclipse.debug (Eclipse TLP so released together with JDT)
      - ./org.eclipse.dltk
      - ./org.eclipse.e4 (Eclipse TLP so released together with JDT)
      - ./org.eclipse.eclemma
      - ./org.eclipse.egf
      - ./org.eclipse.egit
      - ./org.eclipse.emf
      - ./org.eclipse.epp
      - ./org.eclipse.fx
      - ./org.eclipse.gmt
      - ./org.eclipse.graphiti
      - ./org.eclipse.jem
      - ./org.eclipse.jface (Eclipse TLP so released together with JDT)
      - ./org.eclipse.jpt
      - ./org.eclipse.jst (WTP)
      - ./org.eclipse.jubula
      - ./org.eclipse.jwt
      - ./org.eclipse.libra
      - ./org.eclipse.linuxtools
      - ./org.eclipse.lsp4e
      - ./org.eclipse.m2e
      - ./org.eclipse.m2m
      - ./org.eclipse.modisco
      - ./org.eclipse.mylyn
      - ./org.eclipse.net4j
      - ./org.eclipse.ocl
      - ./org.eclipse.oomph
      - ./org.eclipse.papyrus
      - ./org.eclipse.pde (Eclipse TLP so released together with JDT)
      - ./org.eclipse.pmf
      - ./org.eclipse.qvtd
      - ./org.eclipse.rap
      - ./org.eclipse.rcptt
      - ./org.eclipse.recommenders
      - ./org.eclipse.sapphire
      - ./org.eclipse.scout
      - ./org.eclipse.sirius
      - ./org.eclipse.sphinx
      - ./org.eclipse.swtbot
      - ./org.eclipse.team (Eclipse TLP so released together with JDT)
      - ./org.eclipse.uml2
      - ./org.eclipse.viatra
      - ./org.eclipse.wb
      - ./org.eclipse.wst (WTP)
      - ./org.eclipse.xpand
      - ./org.eclipse.xsd
      - ./org.eclipse.xtend
      - ./org.eclipse.xtext

This includes optional dependencies.