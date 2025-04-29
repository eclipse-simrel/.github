This document contains the boiler-plate information for every [Simultaneous Release](../Simultaneous_Release.md) after Photon.

### Requirements For Participation

Projects that are part of the [Simultaneous Release](../Simultaneous_Release.md) agree to abide by the 
[requirements of the Eclipse Simultaneous Release](Simultaneous_Release_Requirements.md "wikilink").

### Milestones and Release Candidates

The milestone dates are at roughly 2-3-week intervals.
Any end-of-cycle release candidate (RC) dates are typically one week apart.
Each project has their deliveries due at times offset from the end-date so that the project dependencies can come together in a reasonable order.
These delivery times are based on the dependencies between projects.
They are labeled +0, +1, +2, and +3, with +0 coming first (the Platform) and "+4" coming last (only EPP packages).
Projects themselves decide if they are +0, +1, +2, or +3.
The actual time-offset represented by these intervals is mostly one day.
The actual calendar can be seen on each release's via at [Simultaneous Release schedule](../Simultaneous_Release.md).
Projects are free to have their own schedules as long as they meet the deliverables for the corresponding release cycle.

Note that projects choose their own +n category based on major or primary dependencies.
There are many cases where a project might have to deliver pieces of their code a little earlier,
if some project depends on it, or a little later if they have a stray dependency.
These sorts of deviations are left to the projects to work out, pair-wise, among themselves.
Feel free to bring up complicated cases for discussion.

Given all these constraints, the exact dates for any particular release cycle are pretty predictable.
See the actual calendar for the important details.
That is, your stuff is due earlier than these table dates!
Projects need to deliver a week or two before these "end dates", depending on their chosen, committed offset category (+0, +1, etc).
Also, to emphasize, the dates represent the last possible date to contribute,
projects are encourage to provide "warm-up" builds a week or two earlier, when possible,
as this often helps expose issues that other teams need discussion or that other teams need to react to, before their final delivery.

After RC2 is quiet period.
There will be no further builds.
That time is reserved for final, in depth testing, and preparation for release.
Emergency rebuilds might be considered, by following the usual
[Planning Council Exception Process](Simultaneous_Release_Requirements.md#planning-council-exception-process),
but only for serious, blocking regressions that have a SimRel impact.

### Communication Channels

#### SimRel Milestone & RC Status Reporting

Only negative status needs to be reported.
It is essential for many aspect of the simultaneous release that communication be prompt and clear, on many topics.
One of the most important ones, is if someone is not meeting some date or delivery.
Put another way, we assume everyone is on target and has delivered their stuff unless a note is sent to simrel-dev list that you are delayed.
Its better to be up front about it,
so everyone knows what to expect,
rather than to hope things turn out OK at the very last minute,
since if you "miss" without saying anything you are more likely to impact other people,
and miss your chance to be part of the release.

#### Mailing Lists and Newsgroups

Eclipse projects have three communication channels: a mailing list for developers,
a discussions (formerly forums) for users,
and issues (formerly Bugzilla).
While each release is not a "project" per se, it will use the same structure.

##### Developer mailing list

-   [simrel-dev](https://accounts.eclipse.org/mailing-list/simrel-dev) -
    mailing list for developers and releng.
    This is the list to use to discuss build issues, announce changes in plans, slippage in deliverables, etc.

##### The Planning Council Mailing List

Because there has been confusion in the past, we'll be explicit here that the 
[planning council mailing list (eclipse.org-planning-council)](https://dev.eclipse.org/mailman/listinfo/eclipse.org-planning-council)
is for Planning Council business,
not the release activities per se.
While they sometimes overlap, there is no need to cross post.
While anyone can request a subscription to the planning council list
(for openness and transparency)
the expectation is that only Planning Council members post to it.

##### Conference Calls

The [Planning Council](../Planning_Council.md "wikilink") has regularly scheduled calls for Planning Council business.
See [conference calls](../Planning_Council.md#call-and-meeting-schedule "wikilink").

There are no planned calls for each release, or for larger audiences, but they can be arranged if required or desired
(for example, if needed for build coordination).

### Builds and p2 repository

#### Builds (Aggregation)

This section, about assembling the repositories, is subject to change, as improvements in the process are made.

A number of utilities have been written to automate the assembly of the different simultaneous releases.
These are available in their own SCM repository.

Since 11/2016 we are using the [CBI Aggregator](https://ci.eclipse.org/simrel "wikilink").

The [Contributing to Simultaneous Build](Contributing_to_Simrel_Aggregation_Build.md "wikilink") page
is where you go to learn how to add your project to the SimRel build (aggregation).

#### p2 Repository

To obtain the latest published bits, use this URL:

[`http://download.eclipse.org/releases/<release-name>`](http://download.eclipse.org/releases/) `(e.g. 2025-06)`

It contains the latest milestone, release candidate, eventually the release itself.

To obtain the latest working version, as we build up to a milestone or release, you can test the staging repository:

[`http://download.eclipse.org/staging/<release-name>`](http://download.eclipse.org/staging/) `(e.g. 2025-06)`

### Update Releases

After Photon.0, the simultaneous release cadence moved from a one-year release cycle to a 13-weeks cycle.
The releases will occur at the end of March, June, September, and December of each year.
Instead of a one year long ramp-up to a release, there will be rolling releases.

See also: [Simultaneous Release Cycle FAQ](Simultaneous_Release_Cycle_FAQ.md)

### Other considerations and rules

Individual projects may have their own update releases at any time if they need to,
but all participants in the Simultaneous Release are expected to participate fully in each release.
What new features are added or what bugs are fixed is up to each project to decide,
but each project must, at least, continue to "fit in"; build, install and avoid conflicts.
To be explicit, new projects may join releases,
and participating projects may add new features or APIs
(i.e. contribute Minor Releases) if they would like to.
Another important rule is that new projects and even new features must be essentially complete,
including release review records, by RC1. 
Anything later than that must also go through the Planning Council's formal 
[Planning Council Exception Process](Simultaneous_Release_Requirements.md#planning-council-exception-process).
