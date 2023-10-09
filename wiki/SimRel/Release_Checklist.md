This is a chronological list of things to do before, on and after a
release day.

# Before release day

<table>
<thead>
<tr class="header">
<th><p>Task</p></th>
<th><p>Description</p></th>
<th><p>Responsibility</p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Add info center</p></td>
<td><ul>
<li>Run <a
href="https://ci.eclipse.org/simrel/job/simrel.create_infocenter/">simrel.create_infocenter
job</a> on SimRel JIPP</li>
<li>Run <a
href="https://ci.eclipse.org/simrel/job/simrel.publish_infocenter_pipeline/">simrel.publish_infocenter_pipeline
job</a> on SimRel JIPP</li>
<li>Set up infocenter on help.eclipse.org</li>
<li>Update second most recent infocenter to show the "past release"
header (Run job with "past_release" option turned on)</li>
<li>Add new info center to the shell script in this job: <a
href="https://ci.eclipse.org/simrel/job/simrel.check_infocenter">https://ci.eclipse.org/simrel/job/simrel.check_infocenter</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="even">
<td><p>Check mirrors</p></td>
<td><ul>
<li>Run the <a
href="https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.tools/+/master/checkMirrorsUtility/checkMirrors.sh">org.eclipse.simrel.tools/checkMirrorsUtility/checkMirrors.sh
script</a> from a local machine</li>
<li>Result should show 25+ mirrors for current release</li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="odd">
<td><p>Fix historical reports on SimRel JIPP main page</p></td>
<td><ul>
<li>Add link to current buildinfo/reporeports on <a
href="https://ci.eclipse.org/simrel/">https://ci.eclipse.org/simrel/</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
</tbody>
</table>

# On release day

<table>
<thead>
<tr class="header">
<th><p>Task</p></th>
<th><p>Description</p></th>
<th><p>Responsibility</p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Update "latest" composite repository (15min before
release)</p></td>
<td><ul>
<li>Run <a
href="https://ci.eclipse.org/simrel/job/simrel.releng.update_latest_repo">simrel.releng.update_latest_repo</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="even">
<td><p>Create P2 composite repository for next release</p></td>
<td><ul>
<li>Run <a
href="https://ci.eclipse.org/simrel/job/simrel.releng.setup_next_release">simrel.releng.setup_next_release</a></li>
<li>Do not add index.html to dir! (see <a
href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=544179">bug
544179</a>)</li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="odd">
<td><p>Update SimRel wiki pages</p></td>
<td><ul>
<li><a
href="https://wiki.eclipse.org/Simultaneous_Release">https://wiki.eclipse.org/Simultaneous_Release</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="even">
<td><p>Send announcement email to cross-project-issues-dev mailing
list</p></td>
<td></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="odd">
<td><p>Update various eclipse.org websites</p></td>
<td><ul>
<li><a
href="https://www.eclipse.org/eclipseide">https://www.eclipse.org/eclipseide</a></li>
<li><a
href="https://www.eclipse.org/downloads/packages/">https://www.eclipse.org/downloads/packages/</a></li>
<li><a
href="https://www.eclipse.org/documentation">https://www.eclipse.org/documentation</a></li>
<li><a
href="https://www.eclipse.org/getting_started">https://www.eclipse.org/getting_started</a></li>
</ul></td>
<td><p>Webdev team</p></td>
</tr>
<tr class="even">
<td><p>Upgrade community documentation</p></td>
<td><p>Upgrade <a
href="https://wiki.eclipse.org/FAQ_How_do_I_upgrade_Eclipse_IDE%3F">https://wiki.eclipse.org/FAQ_How_do_I_upgrade_Eclipse_IDE%3F</a></p></td>
<td><p>Developers Community</p></td>
</tr>
<tr class="odd">
<td><p>Announce to user community</p></td>
<td><ul>
<li>Post to "Announcements" and "Community News" on Eclipse website
<ul>
<li><a
href="https://newsroom.eclipse.org/">https://newsroom.eclipse.org/</a></li>
<li><a
href="https://newsroom.eclipse.org/eclipse/community-news/">https://newsroom.eclipse.org/eclipse/community-news/</a></li>
</ul></li>
<li>Send announcements to social media like (Twitter (with
@EclipseJavaIDE), Reddit, ...)</li>
</ul></td>
<td><p>Marketing team / Developers Community</p></td>
</tr>
</tbody>
</table>

# After release day

<table>
<thead>
<tr class="header">
<th><p>Task</p></th>
<th><p>Description</p></th>
<th><p>Responsibility</p></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><p>Tag simrel aggregator repo</p></td>
<td><ul>
<li>Determine final commit</li>
<li>Tag <a
href="https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.build/">org.eclipse.simrel.build</a>
with release name (e.g. '2018-12')</li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="even">
<td><p>Update build configuration</p></td>
<td><ul>
<li>Update TRAIN_NAME in <a
href="https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.build/+/master/Jenkinsfile">Jenkinsfile</a></li>
<li>Update trainName, referenceRepo, eclipse.repo.url in <a
href="https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.build/+/master/pom.xml">pom.xml</a></li>
<li>Update release name label in simrel.aggr (see <a
href="https://git.eclipse.org/r/c/simrel/org.eclipse.simrel.build/+/170670">an
example</a>)</li>
</ul>
<p>=&gt; Use <a
href="https://git.eclipse.org/c/simrel/org.eclipse.simrel.tools.git/tree/nextReleaseUtils/update_build_configuration.sh">update_build_configuration.sh</a>
script (execute on local machine for now)</p></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="odd">
<td><p>Re-enable aggregator job</p></td>
<td><ul>
<li>Re-enable <a
href="https://ci.eclipse.org/simrel/job/simrel.runaggregator.pipeline">simrel.runaggregator.pipeline</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="even">
<td><p>Remove milestones and release candidate repos</p></td>
<td><ul>
<li>Use <a
href="https://ci.eclipse.org/simrel/job/simrel.releng.clean_up_old_builds">simrel.releng.clean_up_old_builds</a></li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
<tr class="odd">
<td><p>Move old release repos to archive.eclipse.org</p></td>
<td><ul>
<li>Only keep the last 8 releases on download.eclipse.org</li>
</ul></td>
<td><p>SimRel release engineer</p></td>
</tr>
</tbody>
</table>
