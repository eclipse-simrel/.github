# SimRel Overview

Here is a brief overview of how our Simultaneous Release works.

### Participation

Individual projects opt to participate in the simultaneous release,
i.e., a subset of Eclipse projects choose to participate.

Each participating project is responsible for doing their own local build
and are generally using [Tycho](https://tycho.eclipseprojects.io/doc/latest/) for that purpose.

Projects are required to conform to collection of "[must dos](Simultaneous_Release_Requirements.md)",
i.e., things that a project "must do" to participate.
We try to keep this minimal.

### Communication

Each project is required to have at least one representative on the [simrel-dev mailing list](https://accounts.eclipse.org/mailing-list/simrel-dev)
to monitor and participate in simultaneous-release-specific communication.
Communication is key to avoid things like dependency duplication, i.e., multiple versions of the same library.
We've had great success with reducing other redundancy with effective communication
and the use of [Eclipse Orbit](https://github.com/eclipse-orbit/.github/blob/main/profile/README.md) to manage third-party dependencies.

### Schedules

Each project is required to conform to the published release schedule.
The schedule includes a total of three (3) milestone, two (2) Release Candidates (RCs), and one GA.
Projects decide on an offset.
The [Eclipse](https://eclipse.dev/eclipse) project has, for example a "+0" offset:
they provide their bits on the first day of any given milestone or RC date.
A project like [GEF](https://eclipse.dev/gef) is "+1" meaning that they provide their bits one day after the milestone or RC date.
This basically indicates that GEF "depends on" Eclipse;
they use the extra time to pull down the milestone/RC bits from their dependencies
and run tests before they contribute their own bits to the milestone/RC.
There are "+2" and "+3" projects as well.

### Contributing

Projects provide their bits as a p2 repository.
They also provide some metadata that describes their contribution, e.g., 
location of said p2 repository,
contact information of the provider,
categorization information,
etc.
Project's update their contribution following steps describe in [Contributing To SimRel Aggregation](Contributing_to_Simrel_Aggregation_Build.md).


### Aggregation

We have a [build aggregator](https://ci.eclipse.org/simrel) that runs when changes to contributions are detected.
It picks up all the bits and produces an über repository of everything that's currently available.
So on offset "+2", the über repository should contain all the bits from all the projects that declared as "+1",
so the repository can be used by the "+2" projects to test.
During aggregation, dependency problems may be discovered.
If dependencies cannot be resolved,
the offending project bits are excluded and an email is sent to [mailto:simrel-dev](mailto:simrel-dev@eclipse.org) for mitigation.
While building up to a milestone or release,
the aggregated repository is moved to a ["staging" repository](https://download.eclipse.org/staging/)
for early testing.
Once final, the staging area is moved to a ["releases" repository](https://download.eclipse.org/releases/).
To know when things are "final", we do not have an "affirmation" check-off, but depend simply on the planned date.
We rely on the projects to notify us on [mailto:simrel-dev](mailto:simrel-dev@eclipse.org) if they are late,
need a little more time,
or need a re-build for some serious problem after their agreed offset.

On "+4" the [Eclipse Packaging Project's (EPP's)](https://github.com/eclipse-packaging/packages/blob/master/README.md)
[build meister](https://ci.eclipse.org/packaging/) runs the build for the Eclipse IDE distributions,
and pushes the result to the [Eclipse IDE Downloads](https://www.eclipse.org/downloads/packages).
Typically, those files are allowed to mirror for approximately 24 hours before being made "visible" to the general public,
so that once the general public start downloading them, not all downloads have to go through one single network.

The release train end-game is carefully coordinated as the final release date approaches.
This end-game is outlined in the [Release Checklist](Release_Checklist.md) document.
