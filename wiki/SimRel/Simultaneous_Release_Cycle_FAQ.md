This page is to document answers to frequently asked questions about
Simultaneous Release cycle, process or build.

# What is the Simultaneous Release cycle ?

The releases will occur every 13 weeks. It will follow the planning
below:

-   **M1 Friday Week 3** : Milestone 1
    -   all the projects are expected to contribute their latest working
        version for a 1st alignment
    -   Staging repo is built \[1\]
    -   EPP packages are released for tests \[2\]
-   **M2 Friday Week 6**: Milestone 2
    -   API breakages are in
    -   all the projects are expected to contribute their latest working
        version for a 2nd alignment
    -   Staging repo is built \[1\]
    -   EPP packages are released for tests \[2\]
-   **M3 Friday Week 9** : Milestone 3
    -   all the projects are expected to contribute their latest working
        version for a 3rd alignment
    -   Staging repo is built \[1\]
    -   EPP packages are released for tests \[2\]
-   **RC1 Friday Week 10** :
    -   API & Feature freeze
    -   Staging repo is built \[1\]
    -   EPP packages are released for tests \[2\]
-   **RC2 Friday Week 11** :
    -   Only fixes. It is assumed all code is done by the end of RC2
    -   Staging repo is built \[1\]
    -   EPP packages are released for tests \[2\]
-   **Quiet Week 12**:
    -   If all goes well, no changes will occur this week
    -   If a blocker is found, this week allows for a final respin.
-   **GA Wednesday Week 13** :
    -   <https://www.eclipse.org/downloads/eclipse-packages/> is updated
        with the latest EPP packages
    -   <http://download.eclipse.org/releases/latest> is updated to
        point to the new release’s update site.

\[1\] <http://download.eclipse.org/staging/><release-name>

\[2\] <https://www.eclipse.org/downloads/index-developer.php>

The releases will occur near the middle of June, September, December and
March each year.

# Why was the release cycle changed ?

There were different motivations to update the release cadence from one
year to every 13 weeks. The main ones are:

-   Ease the update from one release to another for the end user
-   Let developers provide new features faster to their users
-   Simplify the maintenance by keeping only one stream for contributors

# What are the streams to work on ?

There is only one master stream, it will be updated continuously. This
means that there will be no more service releases after Photon.

# As my project is part of the release train do I have to follow the exact cycle ?

Individual projects may have their own cycle releases at any time if
they need to, but all participants in the Simultaneous Release, are
expected to participate fully in the Simultaneous Release. Projects are
expected to contribute a working version to each cycle, even if it is
the same as the previous one. What new features are added or what bugs
are fixed is up to each project to decide, but each project must, at
least, continue to "fit in"; build, install and avoid conflicts.

Projects are free to have their own schedules as long as they meet the
deliverables & deadlines.

# When can I add, update and remove API ?

It is possible to add, update and remove API on any release. API breaks
should be contributed no later than M3 and API & feature freeze must
occur at RC1. Each project is responsible for its own API deprecation
policy.

# My project is part of the Simultaneous Release but is quite stable. Do I have to provide new features for each release ?

No, you just need to provide the same version as the previous one but
ensure that it continues to “fit in”, your build is ok, and it works
fine.

For example, should API be added to a project on which you depend, you
must commit to updating your project so it can continue to be compiled,
run, and installed along with the updated dependencies. For example, if
Platform’s IJavaProject adds API to an abstract class, your
implementation in webtools.jsf must also add those new methods.

# Where can I find the latest working (staging) version ?

The latest working version is available on
<http://download.eclipse.org/staging/xxx/> where xxx = 2018-12, 2018-09,
photon, oxygen, neon...

# Where can I find the latest stable release ?

One repository will be used, which will be continuously updated after
each release: <http://download.eclipse.org/releases/latest/>

This will be a moving target pointing to the latest stable release at
any time.

# Where could I find previous stable release ?

All the stable releases will be also kept available on specific URLs
according to the following pattern:
<http://download.eclipse.org/releases/xxx/> where xxx = 2018-12,
2018-09, photon, oxygen, neon...

# What is the naming pattern for the releases ?

The releases will be named following the pattern year.month: **Eclipse
IDE YYYY-MM**.

For instance *Eclipse IDE 2018-09*, *Eclipse IDE 2018-12*, *Eclipse IDE
2019-03*, *Eclipse IDE 2019-06*…

Note that unlike past years, the name will no longer change annually
with an alphabetically increasing name (Kepler, Luna, Mars, Neon,
Oxygen, Photon) but will instead remain the singular name of the train.

# What is the schedule for the next releases ?

After the release of Photon in June 2018, we have switched to the new
release cadence. Releases are quarterly, or about every 13 weeks.

The exact dates are listed in the Simultaneous Release Plan documents,
e.g.
[SimRel/2019-09/Simultaneous_Release_Plan](SimRel/2019-09/Simultaneous_Release_Plan "wikilink").

You can find the planning documents in the release overview here:
[Simultaneous_Release](../Simultaneous_Release.md) (look for the
"wiki" or "plan" links in the rightmost column).

# How do we join the simultaneous release train

Pretty much any project that wants to join the release train can and are
encouraged to. Of course, it does sometimes take more work ... it is not
just a matter of timing. But, often makes things much easier for your
adopters and users. You should discuss with your mentors and PMC if you
have any doubts or to make sure they agree its appropriate for your
project.

For "how to join", see [Simultaneous Release
Requirements](Simultaneous_Release_Requirements#State_intent_early_.28M4.29)
document.

## How to decide if offset is +N category

It depends on who you depend on and who depends on you. The Eclipse
Platform is +0, so nearly everyone else is +1, +2, or +3. For example,
if you highly depended on "webtools" (which is +2) then you'd have to be
a +3.

If no one else depends on you, in release train, then +3 would be a good
choice. Everyone else is somewhere in between.

Of course, the lines are not always clear and pure ... such as part of
emf is required at +0 but part of it is later at +1. In such cases,
projects usually mark themselves as +1 and "work out the details",
project-to-project, with those that need things at +0. Another example,
part of a project such as WTP might depend on part of DTP and DTP might
depend on part of WTP, but both need to be +2 to "fit in". In cases
such, the projects might have to work out plans or agreements about
having the sensitive, overlapping parts to be stable and finished early
(in both API and version numbers) so neither has to build against the
literal final delivery of the other.

Keep in mind, the +N category means the **last** possible time to drop
(without notifying others). You are welcome and encouraged to have a
"warm-up drop" a week or so earlier, with your "near final" bits, just
to see if anything breaks or effects others, even though your final
delivery may not be until +N.

# When can projects join the release train ?

The period to join the simultaneous release is at the beginning of any
cycle, four times a year. The project needs to declare its intention to
join before the +0 (Friday) of the M1 release week. The "statement of
intent" is still exactly the same as today: projects must formally
announce their participation on the cross-projects-issues-dev mailing
list.

Once a year, EMO will take care of organizing the “opt-in” process as it
is today, so that all projects already in the train can declare their
intention to continue. Those not opting to continue will be removed, but
can be re-added should their intention change.

# When can projects leave the release train ?

A project can declare its intention to leave at any moment in the cycle.
If it does, it should inform depending projects in advance, so they can
adjust accordingly.

# What are the most important URLs

-   [SimRel](SimRel "wikilink"), the wiki category page for the current
    Simultaneous Release stream.

<!-- -->

-   [Repository Aggregation, status and control on SimRel Jenkins
    instance](https://ci.eclipse.org/simrel/)

# Where can the common repository be tested, before it is rolled out for a milestone or release?

The best place is the "staging area", by adding
<http://download.eclipse.org/staging/><release_name> to your "available
software sites" list, e.g.

[`http://download.eclipse.org/staging/2019-03`](http://download.eclipse.org/staging/2019-03)

Note: to get the best test, disable all other repositories in your list,
or you might end up pulling something from some other repository, not
staging. Be aware that moving a specific build to "staging" may happen
only every few days (if you need something promoted more urgently, just
ask on cross-project list).

# What is the staging repository?

Conceptually, it is simply a place to hold a repository temporarily ...
until the repository is promoted to a released location.

## What is staging, for the current, most forward looking, yet-to-be-released stream?

` http://download.eclipse.org/staging/<trainName>`

For example:

[`http://download.eclipse.org/staging/2019-03`](http://download.eclipse.org/staging/2019-03)

Before the actual release, a common milestone aggregation build is moved
from 'staging' to the 'releases' area. For example, once, for each final
milestone, staging is moved to

[`http://download.eclipse.org/releases/`](http://download.eclipse.org/releases/)<trainName>`/`

## What's the best way to test with the staging repository?

There are a couple of good tests to do, before a staging repository is
released:

### Test staging all by itself

Just add the staging repository to the available software sites, using
preferences, and ... very important ... make sure all other sites are
disabled. This then gives you the best view that everything in that one
repository is correct, and all dependencies can indeed be found, and
things show up in categories as expected.

After confirming the categories are as expected, usually the next test
is just to install things, fresh, but often it is a good idea to test
various update sceneries, to make sure things work as expected (for
example, if you already have M1 installed, then once M2 is ready, test
to be sure it updates to M2 as expected.

### Test staging as a pseudo composite

After confirming staging repository is correct, its often useful to then
also (re)enable the released repository. Then, on install dialog, you
can select "all available sites" and this effectively simulates what the
eventual, final composite repository will look like to end users. There
are cases, especially during initial development, where invalid features
will show up. For example, if a feature was removed, renamed, its
version reduced, or its category changed from one milestone to the next,
it might still show up in the composite, and that might interfere with
correct installation (see ), if not merely be confusing to end users. If
there is a serious problem due to the composite, please open a bug in
cross-project component and we'll decide if the composite should be
changed or reduced to allow for correct installation.

### Test EPP Package updates

For a release, EPP packages are added to the common repository via
composite, so its exact (final) location is transparent to end-users.

But before a release, similar to above, you can use a pseudo composite
to test if an EPP Package updates as expected. You'd need to follow (or
ask on) the epp-dev list to know details, but in addition to the above
staging repo, you would add (and enable) EPP's staging repo, which would
usually have a form similar to the following:

` `[`http://download.eclipse.org/technology/epp/packages/`](http://download.eclipse.org/technology/epp/packages/)<YYYY-MM>

### Why do we use composites anyway, if there are potential problems with them?

Three reasons:

First, we use composites in order to be able to test early to make sure
there are no bugs in p2, etc., that need to be fixed.

Secondly, someone may be using a previous milestone as a runtime target,
and once we remove it, it will invalidate that target, so we do not want
to force everyone to "move up" all at the the same time. Some developers
may need a few weeks to transition to the latest code. To save space, we
do not try and save all previous milestones, though. Our goal is to
maintain about 3 milestones in the composite. For example, if we had M1,
M2, and M3 in the composite, once RC1 came out, we'd only have M2, M3,
and RC1. But the number can not be guaranteed. If there are serious
problem with providing the composite we will reduce it to just two, or
even to just one, to make sure the repository is usable for testing and
continued development.

Finally, to allow users to rollback an install. If you updated e.g. from
M1 to M2 and noticed that something's broken, you can revert to M1
automatically (Via Installed Software -\> Installation History).
However, this feature only works if M1 is still available at the same
location, i.e. in the composite update site you used to update to M2 (Or
to initially install M1) [more
info](https://www.eclipse.org/lists/cross-project-issues-dev/msg17257.html).

# Once I update my *.aggrcon* file, how can I start a build?

You don't need to. The Gerrit validation job will start automatically,
once you submit a Gerrit review with your change. If the validation job
is successful, you can merge the change. The aggregation job polls the
Git repo every 10 minutes to see if there are any changes, and if so,
starts a build. It takes approximately 1 hour to run.

## But what if I really want to kick off the build myself?

If you can't wait 10 minutes, you can start the build yourself. Anyone
that has authorization to check in a build file, should have authority
to manually start a aggregation build.

Plus, there are some cases where someone may need to kick off a build
manually. For example, if a build fails due to network issues. Another
common case is that a build may fail, even though the contribution file
is correct, the repository it points to might have had an error. Once
the repository is corrected, there's no automatic mechanism to detect
that change, so after the repository is corrected, a new build has to be
manually started (that, or the contribution file is "touched" and then
checked in again). To manually start a build, just click the "Schedule a
Build" button at the [simrel.runaggregator.pipeline job
page](https://ci.eclipse.org/simrel/job/simrel.runaggregator.pipeline/).
You need to be logged in for this.

# A build failed message says it can not find xyz.feature.group, but I have nothing with "feature.group" in the name?

The suffix ".feature.group" is added to feature names, to refer to the
whole feature ... the feature files themselves, but also all its
included bundles and features ... to help distinguish it from the
literal feature files. So "xyz.feature.group" just means the "xyz
feature", conceptually. See [Eclipse Help for detailed information about
metadata](http://help.eclipse.org/galileo/index.jsp?topic=/org.eclipse.pde.doc.user/tasks/pde_p2_featuremetadata.htm).

# A build failed message says it can not find version 1.2.3.v9 but I can see 1.2.3.v9 on the file system?

The key file, the one that "drives" P2, is the content.jar/xml file. Be
sure to check the version numbers there. If, inside it, the installable
unit (often a feature) says version="1.2.3.v8", then P2 will look no
further and conclude that the 'v9' feature it is looking for is not
there. This is usually a sign your meta data needs to be re-generated to
match the contents on the file system.

# How is a final build made "invisible" until release?

## Web download pages?

You can put the zips in their download directory, so those large items
can replicate to mirrors, but don't use any HTML that would cause them
to be displayed as links to an end user. True, if someone knew the exact
URL they could still get it, but the idea is that the URL is not widely
announced or visible, so even if a few download it, it is not hit by
thousands of downloads. Then, on release day, you'd update the HTML
pages to make the downloads visible to browsers and click-able by users.

Tip : you can hide some particular builds from download pages using the
hidden.txt file in downloads directory ( see for example emft :
<http://dev.eclipse.org/viewcvs/viewvc.cgi/www/modeling/emft/downloads/hidden.txt?root=Eclipse_Website&view=log>
)

## P2 repositories?

There is a few ways to accomplish this, depending on if you have
composite or simple repositories, but they all involve promoting the
"main" parts of the repository (the artifacts, usually "plugins" and
"features" directory) to their final location so those meaty parts can
be replicating to mirrors, but do not put the metadata (usually
content.jar and artifacts.jar) to their final location until "release
day". p2 doesn't "see" the artifacts, until it can read the metadata.

# I see that xyz is being pulled into the repository, how can I see who is pulling it in?

There are times when someone may see an old, or inappropriate, bundle
being "pulled in" to the aggregation build, and they want to find out
how or why it is being included. While the full rules for how p2 decides
something is required, or satisfies a requirement, is beyond the scope
of this FAQ, there are two ways to get started narrowing it down. Just
to have a concrete example, I will use the use-case provided by to show
a specific case, where some old (unsigned) version of
org.eclipse.emf.teneo.hibernate.libraries was being included.

## The quick approximate check of where its coming from

Check the console log for a message about mirroring the problematic
bundle, and then look back "up" in the log, to see what repository is
being processed at that point.

For, our example, searching for
'org.eclipse.emf.teneo.hibernate.libraries' we find the following line:

`    [exec] - mirroring artifact osgi.bundle,org.eclipse.emf.teneo.hibernate.libraries,1.0.1.v200907090915 `

Then, looking back "up" in the log, we see the following repositories
were being used to pull things from:

`    [exec] Mirroring meta-data from from `[`file:///home/data/httpd/download.eclipse.org/modeling/emf/updates/interim`](file:///home/data/httpd/download.eclipse.org/modeling/emf/updates/interim)
`    [exec] - mirroring meta-data reference `[`http://download.eclipse.org/modeling/mdt/updates/`](http://download.eclipse.org/modeling/mdt/updates/)
`    [exec] - mirroring artifacts reference `[`http://download.eclipse.org/modeling/mdt/updates/`](http://download.eclipse.org/modeling/mdt/updates/)
`    [exec] - mirroring meta-data reference `[`http://download.eclipse.org/modeling/emf/updates/`](http://download.eclipse.org/modeling/emf/updates/)
`    [exec] - mirroring artifacts reference `[`http://download.eclipse.org/modeling/emf/updates/`](http://download.eclipse.org/modeling/emf/updates/)
`    [exec] - mirroring meta-data reference `[`http://download.eclipse.org/modeling/emft/updates/`](http://download.eclipse.org/modeling/emft/updates/)
`    [exec] - mirroring artifacts reference `[`http://download.eclipse.org/modeling/emft/updates/`](http://download.eclipse.org/modeling/emft/updates/)
`    [exec] Mirroring artifacts from from `[`file:///home/data/httpd/download.eclipse.org/modeling/emf/updates/interim`](file:///home/data/httpd/download.eclipse.org/modeling/emf/updates/interim)

In some cases, this might be sufficient to track down the problematic
contributor.

## The detailed, exact check on requirements

If the log doesn't help, the definitive source of "requirements" can be
seen in the content.jar/xml. It can be tricky to "find" the
content.jar/xml file, depending on composites repositories, if
compressed or not, etc., but for our example, from a temporary
maintenance repository, you can download it from

` `[`http://download.eclipse.org/releases/maintenance/content.jar`](http://download.eclipse.org/releases/maintenance/content.jar)

Once unzipped, you can search for your bundle, in our case. searching
for 'org.eclipse.emf.teneo.hibernate.libraries'.

You'll certainly find the IU that defines the bundle

` `<unit id='org.eclipse.emf.teneo.hibernate.libraries' version='1.0.1.v200907090915' singleton='false'>

That IU, by itself, doesn't help narrow down who is requiring it. But,
continue to search.

### The easy case of "Require-Bundle"

If you find a match in a "requires" element, you can see what bundle
"requires" your bundle. If found, those matches would start with
"\<required" element and include the name of the bundle. In these cases,
there is some bundle that uses "Require-Bundle" and should be easy to
resolve with who ever is doing that.

### The harder case of "Import-Package"

If you find no direct "\<required" match, then that means p2 is deciding
your bundle "fits" the requirements due to the packages it provides
(exports), and some other bundle (or bundles) "imports" those packages.
If there are just a few, uniquely named packages provided by your
mystery bundle, you can search the content.xml file for who "requires"
those packages and figure out what to do from there.

### The hardest case

But, our example does not have such a happy ending. The IU
'org.eclipse.emf.teneo.hibernate.libraries' provides 264 packages! Some
of those are fairly distinctly named, but some are very common, and very
commonly "imported" by other bundles. While I did not try, it would be
hard to narrow down to just a few other bundles that might be requiring
the many exported packages. I do not know the exact details, but p2 does
have some heuristics where it will give extra weight to include a bundle
that satisfies the most requirements -- so, any bundle that provides
(exports) a huge number of common packages is in danger of getting
included unintentionally by p2.

### Back to the quick approximate findings

Another approach is to go back to those repositories implied in the "The
quick approximate check" above.

Ideally, it would be possible to provide a more specific repository for
the CBI aggregator so it only looks in more currently correct
repositories. For example, (and, I emphasize 'example', since I am
unsure of Modeling project's policies and procedures) a repository for
"../emf/updates/indigo/" might be more appropriate for indigo
contributions than a high level "../emf/updates/" repository. Or, as
another example, perhaps "../emf/updates/interim" repository is actually
incorrect for Indigo contributions. In that case, you could search the
\*.aggrcon files to see who is using or providing that repository and
work out a better alternative.

### A caution on how not to solve

For cases such as this, where some old, inappropriate bundle is being
included, one solution, one might think, would be to surgically remove
it from its original repository. This is almost never a good idea, since
someone, somewhere, might be depending on it being there ... released
repositories are forever, or, at least, are supposed to be ... so great
care is needed in changing released repositories.

# What if we need a rebuild, past our deadline?

Everyone knows plans are just plans, and occasionally exceptions are
required. While we can't cover every exception (after all ... they are
exceptions) there are the some general principles of deciding if an
exception is required. The same ideas apply to milestones, release
candidates, and releases, but the impact levels are higher the further
along a cycle is. If possible, naturally, it is best to handle problems
within your own project, say, by providing a patch feature or update to
your own project's software repository, but in some cases, that's not
possible ... this FAQ entry is about those cases.

**Questions to ask yourself (and answer, in your request for an
exception or rebuild)**

Not necessarily an exhaustive list ... but, some common questions:

-   Is the bug something that effects IP or similar "legal requirements"
    from the Eclipse Foundation?

<!-- -->

-   Is the bug something that prevents other projects from working
    correctly?

<!-- -->

-   Is the bug something that causes install, or update, to fail, or
    otherwise leave an installation in a bad, unfixable state?

<!-- -->

-   Is the bug something that can not be solved by a patch feature,
    applied by users or adopters after the release?

<!-- -->

-   Is the bug a regression, from previous release?

<!-- -->

-   Do other projects have to recompile, once a bug is fixed? For
    example, are constants changed? APIs? version numbers?

<!-- -->

-   Do other projects need to retest, once a bug is fixed? That is, is
    it something that could potentially effect others ... such as a
    change in timing or synchronization of some "notification" to
    listeners? Or something clearly "internal" to your own code?

<!-- -->

-   Do you have the support, approval, or review of your Project Lead
    and PMC? (Or, otherwise follow what ever your project's rampdown
    process is?)

<!-- -->

-   Does it affect an EPP Package? Or just the common repository?

## Past our +n day, but before window closes?

If we are still within the "drop window" for a deadline, but you are
past your particular +n day, simply post a note to cross-project list,
with any relevant questions and answers from above list, the bug number,
and then just do it. (No need for further approval or coordination.)

Keep in mind that spinning new builds past your deadline can result in a
lot of work for downstream projects and consumers as they make last
minute adjustment to your change. Projects are generally willing to
accommodate these changes as much as they can, but please keep this in
mind and only do it when absolutely necessary.

## Past the drop window?

In this case, it is completely past the drop window, after EPP packages
have been built. In this case, you still need to post to cross-project
list, with bug number, and relevant questions and answers from above
list, but now explicit review/permission from Planning Council is also
required. Please follow the [Planning Council Exception
Process](http://eclipse.org/indigo/planning/EclipseSimultaneousRelease.php#pcExceptionProcess),
but in cases of "tight timing", the Planning Council has authorized the
Planning Council Chair (currently Mélanie Bats) to make the initial
decision and allow others to review later or in parallel.

# Common errors and what to do about them

There are some errors that occur during aggregation builds that are
pretty common and asked about frequently so will list some here in this
FAQ. Please add others, if you notice any missing, and/or improve the
answers if any of these are incomplete or not helpful enough.

## Aggregation model is inconsistent

The title is typically how the error message always begins, and then has
several lines of hard to read notations, which are probably easy to read
if you know EMF real well. :) There are two common reasons for this
error, both are related to the fact that in some cases, the \*.aggrcon
file and the simrel.aggr file must \*both\* be updated.

An interesting twist of this problem is that when it occurs there is no
"blame mail" sent out. The reasoning is that "since the model is bad it
is hard to trust the email data from the model". Another good reason to
use Gerrit, since then you know (pretty much) the error is yours, if
this error occurs after your contribution. Otherwise, the overall
Simultaneous Release Engineer must figure out the offending party --
which is pretty easy to do if they use the CBI Aggregator Editor.

**Solution:**



If the hard-to-read notations mention something about "missing proxy"
then it is likely a "contact email" (or a feature id) was added to the
projects aggrcon file, but was not added to the simrel.aggr file. It is
easiest to use the CBI Aggregation editor (on the simrel.aggr file) to
add/remove the feature or the contact and also add to a contribution or
category.

<!-- -->



If the hard-to-read notations mention something about custom categories
and features that "do not refer to each other" then similar to the
above, someone tried to add a feature to a category, but changed only
their aggrcon file and not the simrel.aggr file. The solution is the
same, use the Editor!

In both cases above, after the change is made, but the simrel.aggr file
and the project's aggrcon file should show "changed" and both should be
committed together.

## Invalid pack.gz file

The actual error message is not nearly so clear as the title of this
section, but more often says something like the following (from )


org.eclipse.core.runtime.CoreException: Unable to unpack artifact
osgi.bundle,org.apache.hadoop.zookeeper,3.3.3.v201105210832 in
repository
<file:/home/hudson/genie.simrel/.hudson/jobs/simrel.neon.runaggregator.BUILD__CLEAN/workspace/aggregation/final/aggregate>:
Invalid <content:org/apache/zookeeper/server/upgrade/UpgradeMain.class>

<!-- -->


Caused by: org.eclipse.osgi.signedcontent.InvalidContentException: The
file "org/apache/zookeeper/server/upgrade/UpgradeMain.class" in the jar
"/home/hudson/genie.simrel/.hudson/jobs/simrel.neon.runaggregator.BUILD__CLEAN/workspace/tmp/signatureFile6913692817837489877.jar"
has been tampered!

The problem is that the "pack.gz" file is invalid. For this example the
bundle is probably something like "org.apache.zookeeper.server", but
technically the error only mentions the package name, and the "temp
location" of the jar file.

An interesting twist to this problem is that p2 itself will not complain
if someone is simply "installing" the bundle, since if an error occurs
with the "pack.gz" version of a bundle, p2 automatically falls back and
uses the "jar" version of a bundle. The reason that it is considered a
blocking error during aggregation is that most large repositories should
be "perfectly correct". It is no big deal if one out of several thousand
was wrong, but imagine if 25% of those thousands were "invalid pack.gz
files". The end-user will end up wasting a lot of time doing updates,
and the infrastructure bandwidth would be increased for no good reason.

**Solution:**

There are 2 or 3 or 4 possible solutions.



The jar may may be being "re-signed" during the project's build.
Re-signing actually does work sometimes but seldom when "pack.gz" is
involved. Hence, one solution is for the project to stop re-signing the
bundle (which is difficult for some build system, but which is now
automatic for most cases at Eclipse.org).

<!-- -->



Pack200 (that produces the pack.gz file) does not work for each and
every possible piece of Java byte codes. It should, but it doesn't. So a
few solutions here:

<!-- -->



The best (or easiest) is for the project to specify at build-time not to
use pack200 with that particular bundle.

<!-- -->



Even better (but very difficult, and only worth if it is a very large
bundle), is that pack200 has options to specify to do the "packing"
slightly differently. For this example, as one use of the options, it
might work to tell pack200 not to pack the
"org/apache/zookeeper/server/upgrade/UpgradeMain.class". (BTW, I do not
even know if that is possible with Tycho. :)

<!-- -->



Another "quick fix" solution is to run a post build step to remove that
specific pack.gz file from the project's repository. This is not as
simple as deleting the pack.gz file, since it is specified in the
metadata files as "being available" but there are some simple p2 ant
tasks that can be used to remove it correctly (as an example, see the
[example mentioned in bug
492904](https://git.eclipse.org/c/platform/eclipse.platform.releng.aggregator.git/plain/production/miscToolsAndNotes/p2RemoveIU/p2RemoveIU.xml).

## Unable to load repository

The title is typically how the error message always begins and then the
error message names the repository. This is a frustrating error since
sometimes a contribution will make it through "validation" perhaps even
a "cached build" and then the "clean build" job will fail. This is
because, it most cases, someone really did remove the repository
specified in their aggrcon file before they updated their aggrcon file
(or, perhaps they removed it, thinking they would quickly replace it
with another repo at the same URL).

**Solution:**

Typically, you just need to start over and trigger the validation job
and let things run its course. It it happens twice in a row, best to
open a bug or contact the offending party since they may not know the
effect they are having or may not have a very good procedure for
creating and updating their repositories. Projects are supposed to leave
any old repositories around at least long enough for they themselves to
get a good aggregation build before removing the old one. There are ways
of doing this! And, yes, it usually does involve creating a new
repository **and then** updating your aggrcon file.

## Cannot complete the install because one or more required items could not be found

The title is typically how the error message always begins and then the
error message gets pretty cryptic. But, hidden in the cryptic part it
will be specific about what could not be found and what it is that
requires it.

**Solution:**

The solution typically involves several projects sorting out what
changed versions and how others should specify their requirements. A
typical "integration time" problem that is typically easy to solve once
the right projects sort it out.

I partially wanted to mention this problem, because very occasionally
someone will say, "but I can see bungle xyz with version l.m.n on the
file system, why can't the aggregator find it". There reason is that it
does not matter (too much) what is on the file system, what matters is
what is in the content metadata or artifacts metadata. It is pretty rare
these days, but occasionally something goes wrong and the content
metadata says the repository has version "1.0.0" so it does not matter
that version "2.0.0" is on the file system, the "contract" on the meta
data is only for "1.0.0". This is typically a build or mirroring problem
and the project that owns that repository must fix it.

## Cannot complete the install because of a conflicting dependency

As above, the title is typically how the error message begins and then
the error message gets pretty cryptic. And, again, hidden in the cryptic
part it will be the specifics about what is conflicting. It is likely
harder to read, though, just because it is longer and involves several
threads of dependencies. These errors typically all boil down a
"singleton" being required, and the installer (p2) knows that multiple
versions can not be satisfied at runtime.

**Solution:**

The solution typically involves several projects sorting out what
changed versions and how others should specify their requirements. In
other words, a fairly typical "integration time" problem that is
typically easy to solve once the right projects sort it out. One
caution, though. Occasionally this is solved by someone specifying
"extra wide" dependency ranges so that it is closer to "any version of
that singleton is required". This is often not ideal if one project
provides one version from their own repository but then "picks up"
another version from someone else's repository during the aggregation
run (or, when a user installs from the Sim. Release repository). It is
better, usually, if all "solutions" match, no matter where a feature or
project is installed from.

## A bundle comes from a different repository than what a project contributes

There is no consistent error message for this case. In fact, it is
normal and "working as designed" that bundles can come from other
repositories. Or, even, a more extreme case, "imported packages" can
come from other bundles than what one contribution may have been
expecting. The fundamental reason is that p2 (via the CBI aggregator)
solves "all the constraints" pulling from "all the repositories" as
though, conceptually, they were all one large request to "install
everything" so anything -- from any repository -- is "fair game" if it
meets the constraints. As said, most of the time this is normal and p2
(and the CBI aggregator) are working as designed. This is mentioned in
this "trouble shooting" section, though, because occasionally it will
cause an error of some sort and it is usually difficult to understand
why a different bundle or package was installed. The error might be
anything from the wrong version of the platform (or other Eclipse
project) being pulled in to functional error from having the wrong
version of a third-party package being pulled in.

**Solution:**

The exact solution will depend on the exact error, but in general the
solution takes two paths: one, for the producers of repositories, is to
make sure the repositories used in the aggrcon files point to a specific
set of bundles, intended only for the project contributing them, and
only for the release that is being created -- if projects have "overlap"
in including, say, parts of another Eclipse project, those contributing
must coordinate well so they each have the same versions in their
repositories; the second path is that the 'consumer' of the bundle or
package must specify their 'version range constraints' as narrow as
possible and still be appropriately wide. Most solutions will be fairly
straightforward, once it is remembered that when a contribution is
"pulled" for the Sim. Release repository, all the repositories from all
the other contributions are considered "fair game" from which to satisfy
the requirements of the contribution -- it is not only limited to that
one repository mentioned in the aggrcon. Obviously, if every project
contributed only bundles (and packages) from their own project's
namespace, then the problems mentioned in this bullet item would not
occur. Sometimes though, and for good reasons, several projects have the
same, or similar, packages in each of their repositories -- third party
packages being the most obvious case, but sometimes it makes sense for a
project (let's say, the Platform) to include in their repository some
core dependencies they have on other Eclipse projects (such as EMF and
ECF).

# Additional Information

-   [SimRel/Simultaneous_Release_Policy_FAQ](SimRel/Simultaneous_Release_Policy_FAQ "wikilink")
-   [CBI/p2repoAnalyzers/Repo_Reports](CBI/p2repoAnalyzers/Repo_Reports "wikilink")

[Category:Coordinated](Category:Coordinated "wikilink")