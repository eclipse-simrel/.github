# Contributing to SimRel Aggregation

These instructions outline how to contribute to the aggregation build for the common repository.

If at any time, there are questions, issues or problems,
don't hesitate to use GitHub [discussions](https://github.com/eclipse-simrel/simrel.build/discussions) or [issues](https://github.com/eclipse-simrel/simrel.build/issues).

## Get the `simrel.build` project

The best way to setup and configure a specialized environment for contributing to Simrel is to use Oomph's automated approach to create it.
Open the follow link in a new tab:

[![Create Eclipse Development Environment for the Eclipse SDK](https://download.eclipse.org/oomph/www/setups/svg/simrel.svg)](https://www.eclipse.org/setups/installer/?url=https://raw.githubusercontent.com/eclipse-simrel/simrel.build/main/SimRelConfiguration.setup&show=true "Click to open Eclipse-Installer Auto Launch or drag onto your running installer's title area") 

Then follow the instructions, and proceed to the [Edit the aggregation description and models](#edit-the-aggregation-description-and-models) section.

The SimRel project provides [detail step-by-step instructions](https://github.com/orgs/eclipse-simrel/discussions/3) for how to contribute.


## Edit the aggregation description and models

### For new project contributions

-   Create the following elements (**New Child**) under top
    **Aggregation:** node or **Validation set:**.
    -   One or more **Contacts** (show Property View to specify both **Email** and **Name**).
        \[It must be a real email, not dev list\].
    -   A **Contribution** (specify **Label** and link to **Contact**)
        -   A **Mapped Repository** (specify **Location**: URL of your p2 repository)
            -   Your **Feature**s (select name from features found in your repository,
                select **Categories** from pre-defined set,
                specify exact version to be included in aggregation under **Version Range**)
-   To create your aggrcon file,
    select your specific **Contribution** and invoke **Detach Resource** from the context menu.
    Choose a filename like *`projectname`*`.aggrcon` (renaming this file at a later stage is not supported).
    For ease of bookkeeping, it is advisable to use the exact name of your project as it appears in the Eclipse Foundation databases,
    including top level and subproject names, as appropriate, for example, `emf-validation.aggrcon` is preferable to `validation.aggrcon`
    or `webtools.aggrcon` preferable to `wtp.aggrcon`.

-   Verify.
    Be sure to "pull" to be sure you have current contents of every thing (with no conflicts).
    To ensure that your contribution will not break the build, right-click on top-most Aggregation: node and

1.  **Validate** checks the general XML and EMF Model validity (short running), then
2.  **Validate Aggregation** checks the whole model specifies correct and valid repo locations and compatibility dependencies (long running).

-   Commit and Push.
    At this point, you are ready to commit and push your contribution.
    You will need to check in changes to the `simrel.aggr` file, as well as your *<projectname>*`.aggrcon` file.

### Updating contributions

-   To change things like Contributors (contacts), Categories, Features (adding or removing),
    you should use the Aggregator Editor with the top level `simrel.aggr` file.
    These things often have bidirectional relationships that span multiple files and you need to update,
    synchronize and check-in all effected files.
    Note: the Categories are normally only added or edited by Planning Council,
    so be sure large changes there have been discussed via [issues](https://github.com/eclipse-simrel/simrel.build/issues).
    -   To add a feature to an existing category, for example: Using the *Aggregator Model Editor* with the top level `simrel.aggr` file
        -- Open your Contribution, And ...
        -   On an existing Feature, contextMenu\>New Sibling\>Feature.
        -   To edit the new Feature, select it and open the Properties view. contextMenu\>Show Properties.
            -   Select the Categories property,
                use the "..." button on the right to select from possible values for Category,
                and Add them to your feature.
            -   Select the Name property,
                and the "down arrow" button on the far right lets you choose from feature names.
        -   Save the `simrel.aggr` file which will modify your project's `aggr` file as well.
        -   Now use the contextMenu\>**Validate** on your Contribution and make sure the validation completes successfully, with no errors flagged with red X's.
    -   When done, commit the `simrel.aggr` file as well as your `project.aggr` file.
        (Note that other `.aggr` files may have been re-generated, possibly simply re-ordering attributes or changing whitespace. You can ignore these.)

<!-- -->

-   To change values of feature versions, or repository URLs,
    you can directly change your *`projectname`*`.aggrcon` file with text editor (or build scripts) and check those in, in isolation.
    Of course, you can and should still use the Aggregator Model Editor,
    and it is often desirable to do so, as it will do a "validate aggregation" and will tell you if something is wrong.
    For example, if there is a typo, and the repository URL does not point to a valid repository,
    you'll know about it right away, if you use the Aggregator Model Editor.

<!-- -->

-   Note that contributions, features, and repositories can be enabled or disabled, via property page.
    This allows temporary changes with minimal disruption.
    For example, if you disable a contribution or feature, it will be left out of a category, without having to also edit the category).
    This is especially useful if there is a leaf component that is "broken" and should temporarily be omitted from the build.
    **Important:** One implication of this is you will need to sometimes re-enable your contribution or feature, even if you did not disable it.
    These are sometimes disabled by others---without notice---especially if a contribution or feature is causing build breaks for an extended period of time,
    and especially if there's been no communication explaining it or describing status or outlook on simrel-dev list.
    Of course, fixing the issue is the desired first choice,
    as disabling one contribution or feature will often require other contributions or features to be disabled simply because they depend on the broken one.

### Categories

The overall categories used in the common repository are the responsibility of the Planning Council
(in that they have the final say about any new ones, removals, etc.).
So please open an [issue](https://github.com/eclipse-simrel/simrel.build/issues)
if you'd like to propose new categories or some reorganization.
But otherwise, feel free to add or remove your features to what ever categories you think are appropriate.
Please use the full aggregator editor, because two files are changed when doing so and is very easy to end up with an inconsistency.

### Runtime Target Platform Category

Some features (or bundles) are not intended to be installed into an IDE.
They do not contribute to the IDE (such as menu items, etc.).
By convention, such features should be placed in the "EclipseRt Target Platform Category".
This would be the case for, say, a "server" that someone was coding and testing for.
In some cases, a runtime feature might "cause harm" (or, change behavior) if a user mistakenly installed it into their IDE.
To prevent a feature (or bundle) from being installed into an IDE, the current "process" is for that feature or bundle to specify a negative requirement on a "magic IU".
This is usually done in a p2.inf file, with contents of
```
# this bundle should not be installed into IDE
requires.0.namespace = A.PDE.Target.Platform
requires.0.name = Cannot be installed into the IDE
requires.0.range = 0.0.0
```

The details of the "magic" solution may change in Juno,
as a cleaner solution is being discussed.
It would be a similar "negative requirement" but just may be on a different (non magic) IU

## The best format and process for contributing to SimRel

### Process

It is best to use a composite site.
Users or developers installing from the composite site, can use its URL to install updates.
But, for building, it is recommended to use the more specific child URL,
which should have "just one" version of your features and most bundles.
Less ambiguous and faster that way.
The Aggregator Model Editor works similar to installing software with p2 when you specify "Contact all update sites during install",
so if you have a "wide open" repository, with lots of children, that can, in principle, cause the aggregation to look at a lot of repositories, trying to find the "optimal solution".

Plus, you should put the child "in place" and confirm it is correct, and then update your composite's content and artifacts files to add it to the list of child projects,
and then, as the last step, add the specific URL to your aggrcon file.

When you add the new child to aggrcon file,
be sure to leave the old child or children in place at least for a day or two, maybe much longer,
depending on your project's retention policy.
This is important, since if an aggregation build is "in progress" (or, if a user is installing),
it can go ahead and finish.
And then on its next build, will pick up your new new contribution.
This is better than breaking the current build, and having it start all over again.
Similarly, you should not just "replace" whatever repo you had before, since this can break anyone currently downloading your files.

### Format

In order to provide some level of predictability and reproducibility for the Simultaneous Release build,
we need to enforce some practice to make sure the dependency resolution is deterministic from a given state of the aggregation model.
Please use any of the following approaches, at your own convenience.

#### Simple repo, and specify, exact versions

The best format to use, in aggrcon file, is to use a URL that points to a "simple repository" presumably a child of a composite repo, but strictly speaking, that makes no difference to aggregation process.
Be sure to leave "old repo" around, for a few days in case a build is in progress, and be sure new repo is in place and "ready" before changing aggrcon file.
That is, aggrcon file should be last step in the process.

Along with that, your aggrcon file should name exact versions of your features that you desire to contribute.
This looks like the following:

`versionRange="[4.0.0.201503231230-m1]"`

Notice the use of square brackets.
That means to use exactly that version.
It is a common error for some to use something like versionRange="4.0.0.201503231230-m1" which means you want to contribute that version, or higher.
So, strictly speaking, if there is a higher version available, either in your repo, or someone else's repo, then that higher version might be used instead of the one you intend.


#### Composite repo, and exact versions.

A good format to use, is to use a composite repo, but still use exact version range as above (with square brackets).

Why is this one not as good as first option?
The reason is simply that it provides more "automatic self checking" that all is as intended.
In this format, there is some risk you might accidentally update some features to latest milestone, but accidentally leave some pointing back to previous milestone.
They might all be "resolvable" from a composite repo, and lead to subtle errors that are hard to track down.


#### Simple repo, no version range

In this case, the URL would point to a simrel repository, that was assured to have just one version in it.
This often works OK, but is not as good as the first option, since you are basically saying "any version will do" so if someone has a higher version in another repo, 
it might be pulled instead.
Even more extreme, someone may have a lower version, and---you did, after all, say any version would be ok---then that lower version might be used, if p2 decides that is an optimal solution.
(An optimal solution, to p2, does have some ability to provide a less than perfect solution,
since in some cases it will "stop trying" some branches of the solution tree,
if they happen to be taking a very long time to compute, and some other branch "works").


## Test and Build locally

From the local state of the aggregation model,
there are various ways to test your change and reproduce the Simultaneous Release (or parts of it) locally

### Aggregation (only) from Eclipse IDE and CBI aggregator

From the aggregation editor, right-click on the aggregation model and run `Clean then Build Aggregation`.

