# The Eclipse Simultaneous Release Requirements

Updated January 14, 2019

Authored and maintained by the [Eclipse Planning
Council](Planning_Council "wikilink")

Contact: [Mélanie Bats](mailto:melanie.bats@obeo.fr)

This document defines the rules and criteria for participating in the
Simultaneous Release. The simultaneous release occurs each year in June,
September, December and March. There are more criteria than when
releasing at other times. There are more requirements partially because
there are more projects releasing at once, so the workload needs to
streamlined and made uniform. But also, the extra criteria are included
by mutual agreement between projects (via their representatives to
Planning Council) so that as a whole, the release will be of better
quality, maintainability, and improved consumability.

The spirit of this document is not be so much as a "contract" of what
has to be done to release, but instead a statement of what minimally is
necessary to make the release good, if not great! While each Project
does their individual things to make the release great, this document
describes how we, as a group, do that by our voluntary agreement to
participate and provide these minimum requirements. We are always open
to better documentation and more meaningful agreements, so please feel
free to make suggestions on how to make our release better from year to
year (preferably through your Planning Council representative). Changes
may be made to this document throughout the development cycle for
clarity or to improve reference links.

To allow for some flexibility for special cases, exceptions to these
requirements are allowed, but to provide balance and foster good
communication, any exceptions to the items or deadlines must follow the
[Planning Council Exception
Process](SimRel/Simultaneous_Release_Requirements/Appendix#Planning_Council_Exception_Process "wikilink").

The requirements are divided into three categories:

1.  Mandatory requirements in order to participate in the simultaneous
    release. Some of those are required to be completed **early in the
    release cycle**.
2.  Mandatory requirements to be part of the common software repository
    and, consequently, the minimum requirements to be part of an EPP
    package.
3.  Optional requirements that improve adoption and demonstrate good
    Eclipse Citizenship, following "the Eclipse Way". These are
    requirements you do not have to fulfill, but are recommended,
    encouraged, and the thing that you do have to do is to document if
    and how you do them.

## Mandatory Requirements for Participation

The requirements and conditions stated in this section are the basic
minimum required for a project to claim they are part of the
Simultaneous Release. Some of those are required to be completed **early
in the release cycle**.

### State intent early

A project can join the Simultaneous Release at any release cycle during
the year.

> Note that the list of projects that participate in the simultaneous
> release is determined by aggregation files in the [*aggregation*
> repository](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/).
> Participating projects must keep their `aggrcon` files up-to-date.

Every project team must designate one or more committers to represent
the interests of the project in matters related to the simultaneous
release. These representatives must subscribe to the
[cross-projects-issues-dev mailing
list](https://dev.eclipse.org/mailman/listinfo/cross-project-issues-dev).

#### How to announce your participation

For projects that **did not** participate in the previous simultaneous
release, the project team's representative must state the project's
intent to do so via the [cross-projects-issues-dev mailing
list](https://dev.eclipse.org/mailman/listinfo/cross-project-issues-dev)
before the **milestone 1 (M1)** date of the release.

For projects that **did** participate in the previous simultaneous
release, the project team's representative must `touch` the project's
`aggrcon` file by the **milestone 2 (M2)** date of the release to
indicate that the project wishes to continue participating and that they
project team is paying attention.

A [release
record](https://www.eclipse.org/projects/handbook/#pmi-releases) for the
release that is to be contributed must exist before the **milestone 1
(M1)** date. If a project team intends to contribute the same content as
was contributed in the previous release, then no new release record is
required. If new content (and, by extension, a new release) is to be
contributed, then a new release record must be created. The regular
[release review
process](https://www.eclipse.org/projects/handbook/#release-review) must
be followed.

> Note that the 2018 edition of the Eclipse Development Process
> introduces a new notion of a [Progress
> Review](https://www.eclipse.org/projects/dev_process/#6_3_5_Progress_Review).
> Projects may push out releases for a full calendar year following a
> successful Release Review or a Progress Review. Note also that this
> does not excuse the project team from the obligations of the Eclipse
> IP Policy: all intellectual property must be fully vetted before it
> may be included in any release.

#### Dropping off

A project representative can declare the project team's intent to
drop-off the simultaneous release at any time by sending a note to the
[cross-projects-issues-dev mailing
list](https://dev.eclipse.org/mailman/listinfo/cross-project-issues-dev).

> Note that marking an `aggrcon` file as disabled is considered a
> temporary state. The `aggrcon` must be removed from the repository for
> any project that has decided to leave the simultaneous release.

If you have any questions, please contact your PMC's Planning Council
Representative, or the [EMO](mailto:emo@eclipse.org).

### Formal (standard format) plans, early (M1)

All projects must have their project plan in the Eclipse Foundation
standard format (i.e. create a [release
record](https://www.eclipse.org/projects/handbook/#pmi-releases) in the
PMI for your project and add corresponding milestones in Bugzilla).
Committing to be in the Simultaneous Release means you commit to having
these plans available early: by M1 at the latest. Naturally, plans will
change as development continues, and we encourage teams to update them
periodically, such as every milestone, to reflect reality and progress,
but an initial version is required by at least M1 should be a clear
statement of what was planned, what was achieved, and what was deferred.
Every plan, for any release, should have some specific items covered,
such as *Target Environments* and *Compatibility with Previous Releases*
but we give some specific guidance here since these are so important to
adoption. In addition, we do ask for one extra "theme" item, that is
technically required only for the Simultaneous Release. What you plan,
is up to each project, we just want to be sure its clear for adopters
and downstream projects.

#### Target Environments

Exactly what platforms and runtimes a project supports is up to them and
their community, but it is required all projects document what platforms
they support, especially if they have native (non-Java) code and
especially if it is different than the [set of platforms supported by
the Eclipse Platform
itself](http://www.eclipse.org/projects/project-plan.php?projectid=eclipse#target_environments).

For additional information see - [Appendix: Target
Environments](SimRel/Simultaneous_Release_Requirements/Appendix#Target_Environments "wikilink")

#### Compatibility with Previous Releases

It should be part of every project's plan to have a section detailing
compatibility with previous releases. This should not only include
commitments to API and binary compatibility, but ideally would also
include plans for source compatibility, workspace compatibility, and
project "coexistence" compatibility. See the template in [standard plan
reference](Development_Resources/Project_Plan "wikilink") and for
examples, see the plans for the
\[<http://www.eclipse.org/projects/project-plan.php?projectid=eclipse#compatibility>\|
Eclipse Platform\] and the
\[<http://www.eclipse.org/projects/project-plan.php?projectid=webtools#compatibility>\|
Web Tools Platform project\].

For additional information see - [Appendix:
Compatibility](SimRel/Simultaneous_Release_Requirements/Appendix#Compatibility_with_Previous_Releases "wikilink")

### IP Documentation and Logs (RC1)

Projects must have their IP logs approved (a normal Eclipse requirement)
but follow the earlier deadlines set by EMO and IP staff. The IP log
deadline is typically mid-week RC1.

For additional information see - [Appendix: IP
Logs](SimRel/Simultaneous_Release_Requirements/Appendix#IP_Documentation_and_Logs_.28RC1.29 "wikilink")

### Release Review and compliance to requirements documentation (RC2)

The release review documentation must be complete by the date specified
by the EMO, which is earlier than it would be for other releases.
(Typically mid-week during RC2.) In addition to normal release plan
requirements, for a Simultaneous Release, Project Leads must document
their verification that the project complies with all extra requirements
of this Simultaneous Release document, as they apply to their project,
and document any exceptions, there in the release review documentation.
This is intended to be a few short sentences or paragraphs, not a
detailed checklist.

For additional information see - [Appendix: Release
Review](SimRel/Simultaneous_Release_Requirements/Appendix#Release_Review_and_compliance_to_requirements_documentation_.28RC3.29 "wikilink")

## Mandatory Requirements for the Simultaneous Repository and EPP

The requirements in this section were historically called "the must do"
items -- they are a "must" not for the release, but must be met for a
project to be on the common, central repository (e.g. /releases/oxygen).
The common repo is for end users to discover easily and therefore (per
EPP Policy) are the minimum requirements to be included in EPP Packages.
The criteria in this section are designed to make sure projects work
relatively well, and work well together and can be installed together.
This is especially required for adopters who may be using these projects
in complicated, interwoven ways so each piece of the puzzle must fit
together well and be dependable and be maintainable, as well as being on
time and IP clean.

### Integrate Early and Often

First-time participants are expected to be in an aggregation build by
M1, at the latest. Then, once in, always in. This firstly means by
agreeing to be in the simultaneous release. But, even more than that, it
is assumed that once you are in one Simultaneous Release, you will
continue to be, so the following year, it is assumed you will be in M1.

**Note:** There is an implicit "opt-in" assumed when we start a new
development stream. That is, projects will be left enabled when we start
a new release cycle. But if projects appear to not be active, the
Planning Council will first try to contact the Project and their PMC. If
no response and no release record in place by M2, then they will be
disabled or removed.

Put another way, being part of the Simultaneous Release is not a "one
time" activity, covering only the release part of the development cycle.
Instead, it is a commitment to stay "simultaneous" on an on-going basis.
Once in, if a project decides to not be part of future simultaneous
releases, they need to communicate that widely, and as early as
possible, since it could affect adopters or downstream projects.

While part of the mechanics of [contributing to the
build](Simrel/Contributing_to_Simrel_Aggregation_Build#The_best_format_and_process_for_contributing_to_Sim._Release "wikilink"),
it is required that any contribution to the Simultaneous Release
repository be done by a unique change to the aggrcon file. There are two
ways to do this. First, your contribution repository can point to a
simple repository where you know for sure there is only one version of
your contribution available. Second, your contribution repository can be
a composite repository but then you name exactly which versions to
include. That is you need to specify all 4 version fields. You can, of
course, do both methods, simple repository and name exact versions if
you want the safety of that redundancy.

### Communication

At least one person from each project in a Simultaneous Release must
subscribe to [cross-project mailing
list](https://dev.eclipse.org/mailman/listinfo/cross-project-issues-dev),
since that is the primary communication channel for issues related to
the Simultaneous Release. Also, at least one person from each project
must subscribe to cross-project Bugzilla inbox (add
cross-project.inbox@eclipse.org to the "Add users to my watch list" box
at the bottom of your [Bugzilla email
preferences](https://bugs.eclipse.org/bugs/userprefs.cgi?tab=email)
page), as that is the primary Bugzilla components for bugs that are
truly cross-project, or bugs which are not known to be in one particular
component.

Your representative to the Planning Council, either from PMC or
Strategic Member, must attend Planning Council meetings and represent
you there. Presumably, of course, after meeting or communicating with
you and the other projects they represent, so they can fairly bring
forward concerns and vote on issues that affect all projects, if
required. Put another way, by committing to be in the Simultaneous
Release, you agree to abide by all the Planning Council decisions and
rules, so be sure your representative understands your project and your
situation.

A build-team member or release engineer from each project must be "on
call" during the aggregation or integration periods to make sure any
issues can be addressed quickly.

### Required Bundle forms and formats

#### Version Numbering ([tested](#Testing_of_Simultaneous_Release_Repository "wikilink"))

Projects must use 4-part version numbers following the common semantics
described in the [Eclipse version
numbering](Version_Numbering "wikilink") document.

#### OSGi bundle format

All plug-ins (bundles) must use the true bundle form. That is, provide a
manifest.mf file, and not rely on the plugin.xml file being 'translated'
into a manifest.mf file at initial startup. With that, empty plugin.xml
files in the presence of a manifest.mf file should not be included in a
bundle. (For some old history, see .)

#### Execution Environment

All plug-ins (that contain Java code) must correctly specify their
[Bundle Required Execution Environment
(BREE)](https://wiki.eclipse.org/Execution_Environments). Resource-only bundles do not
need a BREE since it doesn't matter which version of Java they are used
with.

-   The maximum BREE up to and including the 2022-06 release is Java 11.
-   Starting in 2022-09, BREE up to and including Java 17
-   Starting in 2024-06, BREE up to and including Java 21
-   and going forward the first Eclipse SimRel release to allow an LTS
    will be 6-9 months later.

#### Signing ([tested](#Testing_of_Simultaneous_Release_Repository "wikilink"))

Projects must use [signed plugins and features using the Eclipse
certificate](JAR_Signing "wikilink").

\[added 12/2015, for Neon\]. Note: If a jar is already signed by the
Eclipse certificate, then it must not be re-signed by projects for the
release train.

#### Jarred Bundles

Projects must use jarred plug-ins (with unpack=false) unless there are
technical reasons not to (i.e. require the directory form).

#### License text consistency ([tested](#Testing_of_Simultaneous_Release_Repository "wikilink"))

Use standard forms of license documents so they are displayed in the
most usable, and concise way during install and update. It is a normal
requirement to use a standard [Eclipse Foundation "about"
template](http://www.eclipse.org/legal/epl/about.php), but where those
templates are edited by each project, care must be taken to be sure they
are edited in similar ways. That is, substantial differences are fine,
if required, but we need to avoid minor differences based on case,
dates, and formatting. Note that the Eclipse Foundation's license or
user agreement files may change from year to year (such as, see ). Since
Indigo, it is easier to point to a "symbolic" representation of the
license, that is inserted at build time, so it will be accurate with
less manual updates from each project (see ).

### Re-use and share common third party code (partially [tested](#Testing_of_Simultaneous_Release_Repository "wikilink"))

Any third-party plug-ins that are common between projects must be
consumed via [Orbit](http://www.eclipse.org/orbit/). The Simultaneous
Release must not have duplicate third-party libraries (note that this
only applies to versions of the libraries; thus if project A requires
foo.jar 1.6 and project B uses foo.jar 1.7, that's normally ok,
different service versions a little less ok, such as 1.7.1 vs 1.7.2
(those should be explained, if required), and a qualifier-only
difference is definitely not ok).

Note: the "partially tested", for this case, means there is a report of
"Non Unique Versions used in repository" which can catch issues of not
using common bundles. See [current
report](http://build.eclipse.org/simrel/kepler/reporeports/reports/nonUniqueVersions.txt)
for an example.

### Provide optimized p2 repository ([partially tested](#Testing_of_Simultaneous_Release_Repository "wikilink"))

Projects must provide their own project p2 repository for their own
project and updates. Projects must [optimize their p2
repositories](http://help.eclipse.org/2021-03/topic/org.eclipse.platform.doc.isv/guide/p2_repositorytasks.htm)
to reduce bandwidth utilization and provide a better install and update
experience for users.

In addition, they must provide their artifacts and metadata in a
specified format and method to allow at least parts of their repository
to be aggregated and mirrored to a common repository. The [current
process](Simrel/Contributing_to_Simrel_Aggregation_Build "wikilink") may
be modified throughout the year, if improvements can be made.

Feature "includes" must be strict, that is "include" an exact version of
that other feature. This is required so installs and builds can be
repeatable independent of the exact day of the install or the exact
repos enabled. This is the way things are, and have been for years, and
this statement is just making it explicit since technically it is
possible for people to use some p2 publishers that don't have this
predictability or repeatability (which can certainly be appropriate in
some contexts, just not the Simultaneous Release repository). While
there may, in the future, be new mechanisms that allow some "line up
collection" to be specified, it will be something new, not changing the
meaning of feature "includes" element via p2 metadata.

For similar reasons, the repositories produced and contributed must use
p2 publishers that produce greedy='false' in the content metadata for
runtime-optional dependencies. See and the [p2 Publisher
wiki](http://wiki.eclipse.org/Equinox/p2/Publisher) for some history and
details on this issue of greedy vs. non-greedy requirements. But in
brief, to have a runtime-optional dependency be non-greedy is important
for several reasons, especially in an IDE environment. First it gives
ultimate control over what is installed to the user, based on their
feature selection, instead of depending on what happens to be available
from the repositories they are pointing to at that moment it time. It
also makes it much easier for adopters to be able to predict (and
maintain) what their users have installed. In fact, if something is
runtime-optional, but pulled into an install because someone did not
specify greedy='false' meta-data, there is no way an adopter can provide
a patch feature to one of their customers if that optional bundle causes
a bug.

Everyone's p2 repositories must make use the of p2.mirrorsURL property.
For "how to" information, see [p2.mirrorsURL
wiki](Equinox/p2/p2.mirrorsURL "wikilink"). Note: this is not really a
"Simultaneous Release Requirement" but is required of any p2 repository
on Eclipse Foundation infrastructure, and is just documented here to
help spread the word and educate newcomers.

Similar to p2.mirrorsURL attribute, a well behaved, well optimized p2
repository should contain a p2.index file. This is especially important
for "composite repos" and prevents unnecessary "round trips" to server
looking for files. See for history and for how-to instructions, see the
[p2 wiki](Equinox/p2/p2_index "wikilink"). Again, this is not so much a
"Simultaneous Release Requirement" but is recommended of any p2
repository on Eclipse Foundation infrastructure, and is just documented
here to help spread the word and educate newcomers.

### Branding

Each major project (as determined by participating PMCs) must have an
'About' dialog icon with hover text that displays the provider name.
Every plug-in and feature must specify a descriptive provider-name (for
features), or Bundle-Vendor header (for plug-ins), as determined by the
project's PMC (e.g. "Eclipse Modeling Project" rather than
"Eclipse.org"). Also, Projects should contribute to the welcome page
when appropriate.

### Do No Harm

Projects must work together in any combination of any install. Put
another way, this means that users can install any subset of the
projects participating in Simultaneous Release, and each of the
installed projects will work as well as if it had been installed
independently. If such a problem is identified, the affected projects
must track down and fix the problem, to be in the simultaneous release
repository.

### Document Update Policy

It is required that participating projects document whether or not they
support updating from one release to the next. For example, from Neon
(2016) to Oxygen (2017). \[The current implementation plan for tracking,
details TBD (see ), is for there to be a field in the PMI Release Record
that must be checked "Yes" or "No".\] To meet this requirement in the
affirmative:


\- The project will accept bugs as valid if an update does not work, or
there is a functional problem after updating.

\- The project will test such updates.

\- The project will document, such as in a "Migration Guide" or "Release
Notes", any details about what does or does not work across yearly
updates. For example, a user's workspace may be "migrated" to the new
release and not be usable by the old release after the update (but
projects freshly checked out or imported would continue to work with
either). Or, perhaps there are some known cases where some preference
setting would be lost and have to be set again by the user.

Please note, this requirement is about *documenting* a project's policy.
As of this writing (for Oxygen) it is possible for a project to simply
document "No, updates from previous releases are not supported". In the
future, after more experience is gained, it is anticipated that it will
be required to support "continuous updates" even across each boundaries.
The only reason we do not make it required at this point in time is that
we are not sure we understand all the implications. Accordingly, has
been opened to document "requirements or issues" that participating
projects are aware of or find in support of this effort.

## Optional Requirements

The items in this category are, in a sense, optional. That is, what,
exactly, is done by a project is optional, but it is required for
projects to **document** what they do. These are often "best practices"
that many projects have found essential at driving good adoption, plus
the items sometimes speak to the quality of the project (quality as an
Eclipse "good citizen", as opposed to their code quality or
architecture). But, their importance is not as universally relevant to
all projects and their adopters, hence it is only required that each
project document what they do for these items, but exactly what they do
is up to the best judgment of the project and their community.

Please see the appendix for a detailed list of these items: [Appendix:
Required for good
adoption](SimRel/Simultaneous_Release_Requirements/Appendix#Required_for_good_adoption "wikilink")

# Additional Information

-   [Planning Council Exception
    Process](SimRel/Simultaneous_Release_Requirements/Appendix#Planning_Council_Exception_Process "wikilink")
-   [Simultaneous Release Policy
    FAQ](SimRel/Simultaneous_Release_Policy_FAQ "wikilink")
-   [Testing of Simultaneous Release
    Repository](SimRel/Simultaneous_Release_Requirements/Appendix#Testing_of_Simultaneous_Release_Repository "wikilink")




[Category:Coordinated](Category:Coordinated "wikilink")
[Category:SimRel](Category:SimRel "wikilink")
[Juno](Category:Juno "wikilink") [Kepler](Category:Kepler "wikilink")
[Luna](Category:Luna "wikilink") [Mars](Category:Mars "wikilink")
[Neon](Category:Neon "wikilink") [Oxygen](Category:Oxygen "wikilink")
[Photon](Category:Photon "wikilink")
[SimRel-2018-09](Category:SimRel-2018-09 "wikilink")
[SimRel-2018-12](Category:SimRel-2018-12 "wikilink")
[SimRel-2019-03](Category:SimRel-2019-03 "wikilink")
[SimRel-2019-06](Category:SimRel-2019-06 "wikilink")
