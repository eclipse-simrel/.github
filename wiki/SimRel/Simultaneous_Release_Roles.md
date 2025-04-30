## SimRel Roles

Many tasks and activities must take place to produce our [Simultaneous Release](../Simultaneous_Release.md),
and the [Planning Council](../Planning_Council.md) is responsible for many of those tasks and activities.

This document is to list some of those tasks and activities and group them according to "roles" that various people play.
Of course, the same person may fill more than one role and sometimes a role can be shared by more than one person.
The important thing about this listing of roles is to make sure that all areas are covered, i.e., assigned to someone,
and if someone is no longer able to perform a role, then someone else must be found that can pickup their "job" with a clear understanding of what's expected.

This document will (likely) be be updated frequently, as we learn or think of things we have to do but that have never been written down.
Also it will be updated as conditions change both within a release and across releases.

This document may contain many errors and omissions.
Greatest appreciation to you who find them.
The goal of this document is not to invent something new, of what we would wish to have, but just to document what tasks we do or have done before.

### Planning Council

-   Creates a schedule for the releases.
    Projects of course can have additional releases, but all participants are expected to deliver and test the quaterly releases.

-   Establish, by consensual agreement, the criteria required to be part of the release.
    For example, see [Requirements for Participation](Simultaneous_Release_Requirements.md).

-   Releases are no longer named but rather use the scheme `20YY-(03|06|09|12)`.

<!-- -->

-   In addition to participating in meetings,
    the Planning Council must also find people from the PMCs or Strategic members they represent to carry out the tasks of the Simultaneous Release.

<!-- -->

-   Delegation : Planning Council representatives are expected to participate in each Planning Council meeting,
    but may send a delegate if they can not attend a meeting.
    The delegate should be able to participate in discussions and decisions on behalf of the representative,
    that is, not just take notes for the representative.
    If a PC member finds they need to delegate 3 consecutive meetings,
    they should strongly consider finding a new representative
    If a member does not attend and does not designate a delegate for 3
    consecutive meetings, they will be moved to the "inactive list".
    Note: from an Eclipse Foundation process point of view, participating on the Planning Council is a privilege of membership,
    not an obligation, but, naturally, to not exercise that privilege leaves your project or member company
    unrepresented in decisions about the Simultaneous Release.


-   Also see [Planning Council](../Planning_Council.md).

### Planning Council Chair

-   Schedule and Lead meetings as required.
-   Ensure that the council operates fairly, according dev. process,
    and at the same time making sure that the releases stay relevant to users, and adopters,
    and are of the expected quality, etc.
-   Ensure that the schedule stays on track, and if not take corrective action.
-   Finds people to solve specific problems, or to fill required roles.
-   Leads the planning council to consensus on the release criteria, name, etc.

### Build Producer

-   Historically there's always been an innovator in Eclipse who produces a "build system" that Projects can input to,
    and when run produces an update site, basically, that allows a common place for all Eclipse Users to find the functionality they are looking for,
    instead of having to search all over eclipse and find all the bits and pieces that they require.

-   The Build Producer creates and maintains that system, not only for the release but also for the subsequent simultaneous releases.
    So this is a fairly long term commitment.

-   The Build Producer must also document the system, both in terms of what projects need to do (and not do)
    but also document well enough that someone could "reproduce" the build on their own hardware,
    especially for testing purposes.

### Build Meister

-   Helps people "get in to" the build, if there are questions or issues.
-   Helps diagnosis problems if people have trouble, or at least, be the first point of contact.
-   Keeps the builds running smoothly day to day.
-   Ensures that if someone breaks the build, that they attend to it relatively quickly, or else communicates with them directly.
-   Runs scripts to "move" the build from one location to another,
    such as from build machine to staging area,
    and then later from staging to releases area.
-   Runs scripts to do any "final" preparation work that's required.
    such perhaps to run pack200 on all the jars.

### Build Testers

-   Creates scripts to run on a build to be sure various criteria are met,
    for example, that all jars are signed (and if not, open bugs against those who have not signed their jars).
-   And many more tests that can be automated,
    e.g., check if execution environment specified,
    check if different versions of third party bundles used, etc.
-   Run scripts to collect interesting statistics and reports about the release.

### Webmasters

-   Webmasters help by telling how and when to update and how to cause least impact to Eclipse mirroring system.

### Related Activity

There are some related activities which, while related, are independent of the roles of the [Planning Council](Planning_Council .md)
and the [Simultaneous Release](../Simultaneous_Release.md).

#### Eclipse Management Office

The EMO has scaled back direct partipation and generally only produces a list of participaing projects.

#### Eclipse Packaging Projects Packages

EPP produces packages of all-in-one downloads to make it easier for users in the community to get started.

While EPP of course uses the contents of the Simultaneous release, their processes, criteria, and packages are their own to manage.

#### Eclipse Foundation Download pages

The Eclipse Foundation  provides download pages meant to feature the contents of the simultaneous release,
Again, while this uses the content of the Simultaneous Release,
their process, efforts, goals, etc., are their own
and not strictly related to the Planning Council or Simultaneous Release.
