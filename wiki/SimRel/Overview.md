Here is a brief overview of how our Simultaneous Release works.

Individual projects opt to participate in our simultaneous release. i.e.
a subset of Eclipse projects choose to participate. Non-participating
projects just do their own thing.

Each participating project is responsible for doing their own local
build. They are free to use whatever technology makes sense to them.

Each project is required to have at least one representative on our
[cross-project mailing
list](https://dev.eclipse.org/mailman/listinfo/cross-project-issues-dev)
to monitor and participate in simultaneous-release-specific
communication. Communication is pretty key early on to avoid things like
dependency duplication (multiple versions of the same library) and such.
We've had great success with reducing other redundancy with this simple
step. The Web Tools project, for example, used to have its own database
tools; communication lead to them scrapping that development in favour
of adopting the work of the Data Tools project.

Each project is required to conform to the published release schedule.
The schedule includes a total of three (3) milestone, two (2) RCs, and
one GA. Projects decide on an offset. The
[Eclipse](http://www.eclipse.org/eclipse) project has, for example a
"+0" offset: they provide their bits on the first day of any given
milestone or RC date. A project like [EMF](http://www.eclipse.org/emf)
is "+1" meaning that they provide their bits one day after the milestone
or RC date. This basically indicates that EMF "depends on" Eclipse; they
use the extra time to pull down the milestone/RC bits from their
dependencies and run tests before they contribute their own bits to the
milestone/RC. There are "+2" and "+3" projects as well. i.e. BIRT is
"+2" because it depends on a number of "+1" projects.

Projects provide their bits as a p2 repository. They also provide some
metadata that describes their contribution (e.g. location of said p2
repository, contact information of the provider, categorization
information, etc.)

Projects are required to demonstrate conformance of a collection of
"[must dos](Simultaneous_Release_Requirements.md)"
(things that a project "must do" to participate).

Projects update the
[simrel.aggr](https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.build/+/refs/heads/master/simrel.aggr)
and their specific component .aggrcon file from the [simrel git
repo](https://git.eclipse.org/r/admin/repos/simrel/org.eclipse.simrel.build).
These edits can be made with the [build
aggregator](https://wiki.eclipse.org/CBI/aggregator).

To update a project's contribution short version (see [long version
here](Contributing_to_Simrel_Aggregation_Build)):

`- install the `[`aggregator`](https://download.eclipse.org/cbi/updates/p2-aggregator/tools/milestone/latest/index.html)` into a recent Eclipse IDE`
`- clone the `[`simrel`` ``git`` ``repo`](https://git.eclipse.org/r/admin/repos/simrel/org.eclipse.simrel.build)
`- open the `[`simrel.aggr`](https://git.eclipse.org/r/plugins/gitiles/simrel/org.eclipse.simrel.build/+/refs/heads/master/simrel.aggr)` file`
`- open the Properties view`
`- find the Contribution for your project and expand it - see `[`this`` ``screenshot`](Simrel_screenshot.png)` for an idea of how this looks`
`- select the Mapped Repository node`
`- in the Properties view, edit the Location field to the new p2 URL and press Enter`
`- select all the features in the contribution, right-click and choose Fix Versions`
`- commit and upload to gerrit`

We have a [build aggregator](https://wiki.eclipse.org/CBI/aggregator) that runs when
changes to contributions are detected. It picks up all the bits and
produces an über repository of everything that's currently available. So
on offset "+2", the über repository should contain all the bits from all
the projects that declared as "+1" (so the repository can be used by the
"+2" projects to test). During aggregation, dependency problems may be
discovered. If dependencies cannot be resolved, the offending project
bits are excluded and an email is sent to the cross-project list for
mitigation. While building up to a milestone or release, the aggregated
repository is moved to a ["staging"
repository](http://download.eclipse.org/staging/) for early testing by
committers, and once final, the staging area is moved to a ["releases"
repository](http://download.eclipse.org/releases/). To know when things
are "final", we do not have an "affirmation" check-off, but depend
simply on the planned date, and then rely on the projects to notify us
on cross-project list if they are late, need a little more time, or need
a re-build for some serious problem after their agreed offset.

On "+4" the [EPP](http://www.eclipse.org/epp/) build meister runs the
build for "all in one" distributions, and pushes the result to [a public
location](http://www.eclipse.org/downloads/). Typically, those files are
allowed to mirror for approximately 24 hours before being made "visible"
to the general public, so that once the general public start downloading
them, not all downloads have to go through one single network.

The release train end-game is carefully coordinated as the final release
date approaches. This end-game is outlined in the [Release
Checklist](Release_Checklist) document.
