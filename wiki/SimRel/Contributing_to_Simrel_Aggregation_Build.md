__TOC__

These instructions outline how to contribute to the aggregation build
for the common repository.

These instructions were substantially changed in August of 2012, to
accommodate migration to new source repository, and at the same time a
rename of the main project needed from that repository. The instructions
and process for Juno (SR1 and SR2) are very similar to those for Kepler
(SR0, in June 2013) except for the branch to use to for
modifications/updates; Juno_maintenance for the former, master for the
latter. For history of migration and change of project names, see .
These instructions were also updated when moving to Gerrit, as discussed
in . However, those change are backward-compatible so there are also
relevant maintenance branches of the aggregator.

If at anytime, there are questions, issues or problems, don't hesitate
to ask on [cross-project
list](mailto://cross-project-issues-dev@eclipse.org), or [open a
cross-project
bug](https://bugs.eclipse.org/bugs/enter_bug.cgi?product=Community&component=Cross-Project).

## Get the simrel.build project

The easiest way to setup and configure a specialized environment for
contributing to Simrel is to use Oomph's automated approach to create
it. Open [this
link](https://www.eclipse.org/setups/installer/?url=https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/plain/setups/interim/SimultaneousReleaseTrainConfiguration.setup&show=true)
in a new tab, follow the instructions, and then proceed to the [Edit the
aggregation description and
models](#edit-the-aggregation-description-and-models)
section.

Otherwise, if you don't have it already, you'll need to install Eclipse
EGit, from common repository or their own repository at

` http://download.eclipse.org/egit/updates/`

You'll also need to have valid Gerrit settings (accept CLA, upload SSH
key...), as described in [Gerrit](Gerrit "wikilink") (so read
carefully).

Then, clone the repository named `org.eclipse.simrel.build.git` and
import the project of similar name, `org.eclipse.simrel.build`. There is
only the one project in that repository. An appropriate URL would be
similar to

` ssh://username@git.eclipse.org:29418/simrel/org.eclipse.simrel.build.git`

For for casual browsing, see

It is recommended that your remote branch specifies **rebase=true** to
avoid "Merge" commits. In the end, your config file for the repository
would have something similar to the following:

    branch.master.remote=origin
    branch.master.merge=refs/heads/master
    branch.master.rebase=true

See the [Configuration](#Configuration "wikilink") section for more
details on the best way to set up your workspace and cloned repository.

The 'master' branch of that repo is used for the most forward looking
release (namely Oxygen, as of this writing) and input for update
releases will be in a branch named '<Release>_maintenance' (so, for
example, Neon_maintenance is for Neon.1, Neon.2 and Neon.3).
\[Eventually this should change so "updates" is used instead of
"maintenance", such as "Oxygen_updates".\]

## Configuration

### Install the CBI p2Repo Aggregator

-   To be most current, it is best to use the latests Eclipse SDK
    2020-09 and use the latest 1.0.x version of the CBI Aggregator
    Editor, installed from CBI's Aggregator repository, at following
    URL:

` https://download.eclipse.org/cbi/updates/aggregator/ide/4.13/`


\- Note: As far as is known, any EPP Package (or, plain Eclipse
Platform) should work, but, you will (naturally) also need EGit
installed to work with \*.aggrcon files -- so the Eclipse "Standard" EPP
package it a good choice to start with.

-   For more detail, see the instructions to install the [CBI Aggregator
    Editor](CBI/aggregator/manual "wikilink") (and get the above
    mentioned project in your workspace).

-   Open the file `simrel.aggr` using the **Aggregator Model Editor**

### Configure the workspace

\[This section originally copied from
[Platform-releng/Git_Workflows#Configure_the_workspace](Platform-releng/Git_Workflows#Configure_the_workspace "wikilink")
and then modified.

Open the **Team \> Git \> Configuration** preference page and select the
**User Settings** tab.

-   Add entries for **user.name** and **user.email**. If you don't want
    to share your e-mail you can also use your committer account ID.
    Note that you will not be able to push changes to the repository if
    the latter property is not matching with your records at the Eclipse
    Foundation.
-   Add entry **branch.autosetuprebase = always**

On the **General \> Workspace** preference page, set **New text file
line delimiter** to **Unix**.

### Configuring the repo

This section originally copied from
[Platform-releng/Git_Workflows#Configuring_the_repo](Platform-releng/Git_Workflows#Configuring_the_repo "wikilink")
and then modified.

To handle line-endings in the best possible way in our diverse (i.e.
multi-platform development), we recommend the same thing that [Github
recommends](https://help.github.com/articles/dealing-with-line-endings/)
as well as several [references on
Git](https://git-scm.com/book/en/v2/Customizing-Git-Git-Configuration#Formatting-and-Whitespace).
Namely, either globally or at least for the 'simrel.build' repository
set 'core.autocrlf' according to the platform you are working on: "On OS
X and Linux, you usually want to pass input for this setting. On
Windows, you usually want to use true."

These settings should provide CRLF endings in Windows checkouts, but LF
endings on Mac and Linux systems and in the repository. (Note, for
"builds" we set it to "input". While we never check in changes from the
build machine, we do not want line endings changed on check-out, or else
on the next checkout or pull it may appear to Git that the "files have
changed" and it will refuse to overwrite the changes.)

Unless you are working on topic branches, we work in a fairly linear
history. Please make sure branch.**branchname**.rebase = true is set. If
you've set **branch.autosetuprebase = always** as explained in
[\#Configure_the_workspace](#Configure_the_workspace "wikilink"), then
this is done automatically.

Otherwise, once you've cloned a repository, you can go to the
**Preferences \> Team \> Git \> Configuration** page. Select your
repository, select the branch you picked when you cloned the repository,
and click **New Entry...**. Append "rebase" to the text in the 'Key'
field and enter "true" as value.

![Image:RepositoryConfigurationSettings.png](RepositoryConfigurationSettings.png "Image:RepositoryConfigurationSettings.png")

### Configuring the workspace content types

By default, the aggr file and aggrcon file types will not be recognized
by Eclipse and thus treated as "binary" files. This, for example, will
prevent you from using the "Convert Line Endings" function on these
files. Because of several issues with Git, EGit, and mixed line endings,
we follow the convention of trying to always have only "LF" in the
repository version of the files. It is strongly recommended to have only
the "LF" version of the file in your workspace too. But, in some cases
(due to mistakes or your own settings) you may have to "manually" change
the CRLF back to LF and then commit and push those changes.

One way to enable these file types to be seen as "text files" is to go
into content type preferences, and associate \*.aggr and \*.aggrcon
files with the content type of "XML". After doing this you may have to
go back into "associated editors" and reset CBI Aggregator Editor to be
the default editor for \*.aggr files (or, else, the XML editor will be
the default, and you really should not edit that file with XML editor,
except in very specialized circumstances).

## Edit the aggregation description and models

### For new project contributions

-   Create the following elements (**New Child**) under top
    **Aggregation:** node or **Validation set:**.
    -   One or more **Contacts** (show Property View to specify both
        **Email** and **Name**). \[It must be a real email, not dev
        list\].
    -   A **Contribution** (specify **Label** and link to **Contact**)
        -   A **Mapped Repository** (specify **Location**: URL of your
            p2 repository)
            -   Your **Feature**s (select name from features found in
                your repository, select **Categories** from pre-defined
                set, specify exact version to be included in aggregation
                under **Version Range**)
-   To create your aggrcon file, select your specific **Contribution**
    and invoke **Detach Resource** from the context menu. Choose a
    filename like *`projectname`*`.aggrcon` (renaming this file at a
    later stage is not supported). For ease of bookkeeping, it is
    advisable to use the exact name of your project as it appears in the
    Eclipse Foundation databases, including top level and subproject
    names, as appropriate, for example, `emf-validation.aggrcon` is
    preferable to `validation.aggrcon` or `webtools.aggrcon` preferable
    to `wtp.aggrcon`.

<!-- -->

-   Verify. Be sure to "pull" to be sure you have current contents of
    every thing (with no conflicts). To ensure that your contribution
    will not break the build, right-click on top-most Aggregation: node
    and

1.  **Validate** checks the general XML and EMF Model validity (short
    running), then
2.  **Validate Aggregation** checks the whole model specifies correct
    and valid repo locations and compatibility dependencies (long
    running).

-   Commit and Push. At this point, you are ready to commit and push
    your contribution. You will need to check in changes to the
    `simrel.aggr` file, as well as your *<projectname>*`.aggrcon` file.

### Updating contributions

-   To change things like Contributors (contacts), Categories, Features
    (adding or removing), you should use the Aggregator Editor with the
    top level `simrel.aggr` file ... as these things often have
    relationships that span multiple files and you need to update,
    synchronize and check-in all effected files. Note: the Categories
    are normally only added or edited by Planning Council, so be sure
    large changes there have been discussed via bugzilla, etc. (You can
    do this via a bugzilla entry in cross-project category).
    -   To add a feature to an existing category, for example: Using the
        *Aggregator Model Editor* with the top level `simrel.aggr` file
        -- Open your Contribution, And ...
        -   On an existing Feature, contextMenu\>New Sibling\>Feature.
        -   To edit the new Feature, select it and open the Properties
            view. contextMenu\>Show Properties.
            -   Select the Categories property, and use the "..." button
                on the right to select from possible values for
                Category, and Add them to your feature.
            -   Select the Name property, and the "down arrow" button on
                the far right lets you choose from feature names.
        -   Save the `simrel.aggr` file which will modify your project's
            `aggr` file as well.
        -   Now use the contextMenu\>**Validate** on your Contribution
            and make sure the validation completes successfully, with no
            errors flagged with red X's.
    -   When done, commit the `simrel.aggr` file as well as your
        `project.aggr` file. (Note that other `.aggr` files may have
        been re-generated, possibly simply re-ordering attributes or
        changing whitespace. You can ignore these.)

<!-- -->

-   To change values of feature versions, or repository URLs, you can
    directly change your *`projectname`*`.aggrcon` file with text editor
    (or build scripts) and check those in, in isolation. Of course, you
    can and should still use the Aggregator Model Editor, and it is
    often desirable to do so, as it will do a "validate aggregation" and
    will tell you if something is wrong. For example, if there is a
    typo, and the repository URL does not point to a valid repository,
    you'll know about it right away, if you use the Aggregator Model
    Editor.

<!-- -->

-   Note that contributions, features, and repositories can be enabled
    or disabled, via property page. This allows temporary changes with
    minimal disruption. For example, if you disable a contribution or
    feature, it will be left out of a category, without having to also
    edit the category). This is especially useful if there is a leaf
    component that is "broken" and should temporarily be omitted from
    the build. **Important:** One implication of this is you will need
    to sometimes re-enable your contribution or feature, even if you did
    not disable it. These are sometimes disabled by others -- without
    notice -- especially if a contribution or feature is causing build
    breaks for an extended period of time especially if there's been no
    communication explaining it or describing status or outlook on
    cross-project list. Of course, fixing the issue is the desired first
    choice, as disabling one contribution or feature will often require
    other contributions or features to be disabled simply because they
    depend on the broken one.

### Categories

The overall categories used in the common repository are the
responsibility of the Planning Council (in that they have the final say
about any new ones, removals, etc.). So ... please open a cross-project
bug if you'd like to propose new categories or some reorganization. But
otherwise, feel free to add or remove your features to what ever
categories you think are appropriate (using the full aggregator editor,
since two files are changed when doing so) and others will open bugs if
something seems wrong, or in the wrong category.

### Runtime Target Platform Category

Some features (or bundles) are not intended to be installed into an IDE
... they do not contribute to the IDE (such as menu items, etc.). By
convention, such features should be placed in the "EclipseRt Target
Platform Category". This would be the case for, say, a "server" that
someone was coding and testing for. In some cases, a runtime feature
might "cause harm" (or, change behavior) if a user mistakenly installed
it into their IDE. To prevent a feature (or bundle) from being installed
into an IDE, the current "process" is for that feature or bundle to
specify a negative requirement on a "magic IU". This is usually done in
a p2.inf file, with contents of

`# this bundle should not be installed into IDE`
`requires.0.namespace = A.PDE.Target.Platform`
`requires.0.name = Cannot be installed into the IDE`
`requires.0.range = 0.0.0`

The details of the "magic" solution may change in Juno, as a cleaner
solution is being discussed in ... it would be a similar "negative
requirement" but just may be on a different (non magic) IU.

## The best format and process for contributing to Sim. Release

### Process

It is best to use a composite site. Users or developers installing from
the composite site, can use it's URL to install updates. But, for
building, it is recommend to use the more specific child URL, which
should have "just one" version of your features and most bundles. Less
ambiguous and faster that way. The Aggregator Model Editor works similar
to installing software, with p2, when you specify "Contact all update
sites during install" so if you have a "wide open" repository, with lots
of children, that can, in principle, cause the aggregation to look at a
lot of repositories, trying to find the "optimal solution".

Plus, you should put the child "in place" and confirm it is correct, and
then, update your composite's content and artifacts files to add it to
the list of child projects, and then, as the last step, add the specific
URL to your aggrcon file.

When you add the new child to aggrcon file, be sure to leave the old
child or children in place at least for a day or two, maybe much longer,
depending on your project's retention policy. This is important, since
if an aggregation build is "in progress" (or, if a user is installing)
it can go ahead and finish. And then on its next build, will pick up
your new new contribution. This is better than breaking the current
build, and having it start all over again. Similarly, you should not
just "replace" what ever repo you had before, since this can break
anyone currently downloading your files.

### Format

In order to provide some level of predictability and reproducibility for
the Simultaneous Release build, we need to enforce some practice to make
sure the dependency resolution is deterministic from a given state of
the aggregation model. Please use any of the following approaches, at
your own convenience.

#### Simple repo, and specify, exact versions

The best format to use, in aggrcon file, is to use a URL that points to
a "simple repository" presumably a child of a composite repo, but
strictly speaking, that makes no difference to b3 aggregation process.
Be sure to leave "old repo" around, for a few days in case a build is in
progress, and be sure new repo is in place and "ready" before changing
aggrcon file. That is, aggrcon file should be last step in the process.

Along with that, your aggrcon file should name exact versions of your
features that you desire to contribute. This looks like the following:

`versionRange="[4.0.0.201503231230-m1]"`

Notice the use of square brackets. That means to use exactly that
version. It is a common error for some to use something like
versionRange="4.0.0.201503231230-m1" which means you want to contribute
that version, or higher So, strictly speaking, if there is a higher
version available, either in your repo, or someone else's repo, then
that higher version might be used instead of the one you intend.

As of this writing, EGit follows this format in their [egit.aggrcon
file](http://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/tree/egit.aggrcon).

#### Composite repo, and exact versions.

A good format to use, is to use a composite repo, but still use exact
version range as above (with square brackets).

Why is this one not as good as first option? The reason is simply that
it provides more "automatic self checking" that all is as intended. In
this format, there is some risk you might accidentally update some
features to latest milestone, but accidentally leave some pointing back
to previous milestone. They might all be "resolvable" from a composite
repo, and lead to subtle errors that are hard to track down.

As of this writing, EMF follows this format in their [emf-emf.aggrcon
file](http://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/tree/emf-emf.aggrcon).

#### Simple repo, no version range

In this case, the URL would point to a simrel repository, that was
assured to have just one version in it. This often works ok, but is not
as good as the first option, since you are basically saying "any version
will do" so if someone has a higher version in another repo, it might be
pulled instead. Even more extreme, someone may have a lower version, and
-- you did, after all, say any version would be ok -- then that lower
version might be used, if p2 decides that is an optimal solution. (An
optimal solution, to p2, does have some ability to provide a less than
perfect solution, since in some cases it will "stop trying" some
branches of the solution tree, if they happen to be taking a very long
time to compute, and some other branch "works").

As of this writing, the Eclipse Platform follows this format in their
[ep.aggrcon
file](http://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/tree/ep.aggrcon).

## Test and Build locally

From the local state of the aggregation model, there are various ways to
test your change and reproduce the Simultaneous Release (or parts of it)
locally

### Aggregation (only) from Eclipse IDE and CBI aggregator

From the aggregation editor, right-click on the aggregation model and
run `Clean then Build Aggregation`. See
[CBI/aggregator/manual#Global_actions](CBI/aggregator/manual#Global_actions "wikilink")

### Aggregation and reports from CLI with Ant and Eclipse headless

TODO

### \`mvn clean verify\`: Aggregation and reports with Maven (Experimental)

With a version of aggregator post Dec 14th 2017, simply run **mvn clean
verify**. The Maven-based orchestrator takes care of downloading the
necessary CBI aggregator features and of invoking them.

## Pushing your changes

~~There are 2 different ways of pushing content to the simrel
repository.~~

### Contribute via a Gerrit review (recommended)

Anyone who has correctly configured Gerrit (as explained in
[Gerrit](Gerrit "wikilink")) can suggest an update in the form of a
Gerrit review. A committer will have to review the suggested change, and
if it conforms to the requirements, the committers can merge the change
from Gerrit.

In order to suggest a change, a contributor only has to push it to the
repository's master branch, using the following pattern:
`refs/for/master`. After successfully pushing (either with EGit or Git
CLI), the remote Gerrit server reports an URL where to follow the
review.

When submitting a change to Simrel, [validation will run on Simrel
Jenkins](https://ci.eclipse.org/simrel/job/simrel.runaggregator.VALIDATE.gerrit/)
and the Jenkins CI user will vote
<span style="color:green;font-weight:bold">+1</span> if the validation
succeeds and <span style="color:red;font-weight:bold">-1</span> if it
doesn't. Getting a <span style="color:green;font-weight:bold">+1</span>
from automatic validation is a requirement before merging the patch. In
case you have some doubt about the results of this validation step, get
in touch with a Simrel committer to find out what's wrong in your
submission (or in the validation job).

Currently, no-one is assigned to review and/or merge the suggested
changes, so the contributor *must notify a simrel committer* of the
suggested change. In general, it's recommended to ask the release
engineer for the project you're willing to update. Then the simrel
committer will be able to review and merge the change (by voting a
<span style="color:green;font-weight:bold">+2</span> for code-review
field and then hitting *submit* button)

### As a SimRel committer, push directly to the target branch (to bypass Gerrit review)

~~Some contributors are considered as simrel **committers** and are
allowed to push directly to this repo. Each project in the Release Train
generally has a "release engineer" who has the permission to update the
SimRel repo directly. If you plan to do frequent updates, and agree to
do them as suggested about, and need write access to this repository
location, then [open a bugzilla
entry](https://bugs.eclipse.org/bugs/enter_bug.cgi?product=Community&component=Cross-Project).~~

~~Then you can push directly your commit to the master branch on the
remote repo.~~

[Juno](Category:Juno "wikilink") [Kepler](Category:Kepler "wikilink")
[Luna](Category:Luna "wikilink") [Mars](Category:Mars "wikilink")
[Neon](Category:Neon "wikilink") [Oxygen](Category:Oxygen "wikilink")
[Photon](Category:Photon "wikilink")