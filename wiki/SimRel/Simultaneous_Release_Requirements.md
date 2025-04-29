# The Eclipse Simultaneous Release Requirements

Updated April 28, 2025

Authored and maintained by the [Eclipse Planning Council](../Planning_Council.md).
For errors or omissions please [open an issue](https://github.com/eclipse-simrel/.github/issues).

This document defines the rules and criteria for participating in the Simultaneous Release.
The simultaneous release occurs each year in March, June, September, and December .
There are more criteria than when releasing at other times.
There are more requirements partially because there are more projects releasing at once,
so the workload needs to streamlined and made uniform.
But also, the extra criteria are included by mutual agreement between projects
(via their representatives to Planning Council)
so that as a whole,
the release will be of better quality, maintainability, and improved consumability.

The spirit of this document is not be so much as a "contract" of what has to be done to release,
but instead a statement of what minimally is necessary to make the release good,
if not great!
While each Project does their individual things to make the release great,
this document describes how we,
as a group,
do that by our voluntary agreement to participate and provide these minimum requirements.
We are always open to better documentation and more meaningful agreements,
so please feel free to make suggestions on how to make our release better from year to year
(preferably through your Planning Council representative).
Changes may be made to this document throughout the development cycle for clarity or to improve reference links.

To allow for some flexibility for special cases,
exceptions to these requirements are allowed,
but to provide balance and foster good communication,
any exceptions to the items or deadlines must follow the [Planning Council Exception Process](#planning-council-exception-process).

The requirements are divided into three categories:

1.  Mandatory requirements in order to participate in the simultaneous release.
    Some of those are required to be completed **early in the release cycle**.
2.  Mandatory requirements to be part of the common software repository and,
    consequently, the minimum requirements to be part of an [EPP](https://github.com/eclipse-packaging/packages/blob/master/README.md) package.
3.  Optional requirements that improve adoption and demonstrate good Eclipse Citizenship, following "the Eclipse Way".
    These are requirements you do not have to fulfill,
    but are recommended,
    encouraged,
    and the thing that you do have to do is to document if and how you do them.

## Mandatory Requirements for Participation

The requirements and conditions stated in this section are the basic minimum required for a project to claim they are part of the Simultaneous Release.
Some of those are required to be completed **early in the release cycle**.

### State intent early

A project can join the Simultaneous Release at any release cycle during the year.

> Note that the list of projects that participate in the simultaneous release is determined by aggregation files in the 
> [*aggregation* repository](https://github.com/eclipse-simrel/simrel.build).
> Participating projects must keep their `aggrcon` files up-to-date.

Every project team must designate one or more committers to represent the interests of the project in matters related to the simultaneous release.
These representatives must subscribe to the
[simrel-devlist](https://accounts.eclipse.org/mailing-list/simrel-dev) mailing list0.

#### How to announce your participation

For projects that **did not** participate in the previous simultaneous release,
the project team's representative must state the project's intent to do so via the
[simrel-dev](https://accounts.eclipse.org/mailing-list/simrel-dev) mailing list
before the **milestone 1 (M1)** date of the release.

For projects that **did** participate in the previous simultaneous release,
the project team's representative must `touch` the project's `aggrcon` file by the **milestone 2 (M2)** date of the release to indicate that the project wishes to continue participating
and that the project team is paying attention.

A [release record](https://www.eclipse.org/projects/handbook/#pmi-releases) for the release that is to be contributed must exist before the **milestone 1 (M1)** date.
If a project team intends to contribute the same content as was contributed in the previous release,
then no new release record is required.
If new content (and, by extension, a new release) is to be contributed,
then a new release record must be created.
The regular [release review process](https://www.eclipse.org/projects/handbook/#release-review) must be followed.

> Note that the 2018 edition of the Eclipse Development Process introduces a new notion of a [Progress Review](https://www.eclipse.org/projects/dev_process/#6_3_5_Progress_Review).
> Projects may push out releases for a full calendar year following a successful Release Review or a Progress Review.
> Note also that this does not excuse the project team from the obligations of the Eclipse IP Policy
> all intellectual property must be fully vetted before it may be included in any release.

#### Dropping off

A project representative can declare the project team's intent to drop-off the simultaneous release at any time by sending a note to the
[simrel-dev ](https://accounts.eclipse.org/mailing-list/simrel-dev) mailing list.

> Note that marking an `aggrcon` file as disabled is considered a temporary state.
> The `aggrcon` must be removed from the repository for any project that has decided to leave the simultaneous release.

If you have any questions,
please contact your PMC's Planning Council Representative,
or the [EMO](mailto:emo@eclipse.org).

### Formal (standard format) plans, early (M1)

All projects must have their project plan in the Eclipse Foundation standard format,
i.e., create a [release record](https://www.eclipse.org/projects/handbook/#pmi-releases) in the PMI for your project.
Committing to be in the Simultaneous Release means you commit to having these plans available early: by M1 at the latest.
Naturally, plans will change as development continues,
and we encourage teams to update them periodically,
such as every milestone,
to reflect reality and progress,
but an initial version is required by at least M1 should be a clear statement of what was planned,
what was achieved,
and what was deferred.
Every plan,
for any release,
should have some specific items covered,
such as *Target Environments* and *Compatibility with Previous Releases*
but we give some specific guidance here since these are so important to adoption.
In addition, we do ask for one extra "theme" item,
that is technically required only for the Simultaneous Release.
What you plan,
is up to each project,
we just want to be sure its clear for adopters and downstream projects.

#### Target Environments

Exactly what platforms and runtimes a project supports is up to them and their community,
but it is required that all projects document what platforms they support,
especially if they have native (non-Java) code
and especially if it is different than the [et of platforms supported by the Eclipse Platform.

#### Compatibility with Previous Releases

It should be part of every project's plan to have a section detailing compatibility with previous releases.
This should not only include commitments to API and binary compatibility,
but ideally would also include plans for source compatibility, workspace compatibility,
and project "coexistence" compatibility.

### IP Documentation and Logs (RC1)

Projects must have their IP logs approved (a normal Eclipse requirement) but follow the earlier deadlines set by EMO and IP staff.
The IP log deadline is typically mid-week RC1.

### Release Review and compliance to requirements documentation (RC2)

The release review documentation must be complete by the date specified by the EMO,
which is earlier than it would be for other releases.
(Typically mid-week during RC2.)
In addition to normal release plan requirements,
for a Simultaneous Release,
Project Leads must document their verification that the project complies with all extra requirements of this Simultaneous Release document,
as they apply to their project,
 and document any exceptions,
 there in the release review documentation.
This is intended to be a few short sentences or paragraphs, not a detailed checklist.

## Mandatory Requirements for the Simultaneous Repository and EPP

The requirements in this section were historically called "the must do" items;
they are a "must" not for the release,
but must be met for a project to be in the common, central repository.
The common repo is for end users to discover easily and therefore (per EPP Policy) are the minimum requirements to be included in EPP Packages.
The criteria in this section are designed to make sure projects work relatively well,
work well together,
and can be installed together.
This is especially required for adopters who may be using these projects in complicated, interwoven ways so each piece of the puzzle must fit together well
and be dependable and be maintainable,
as well as being on time and IP clean.

### Integrate Early and Often

First-time participants are expected to be in an aggregation build by M1, at the latest.
Then, once in, always in.
This firstly means by agreeing to be in the simultaneous release.
But, even more than that it is assumed that once you are in one Simultaneous Release,
you will continue to be,
so the following cycle,
it is assumed you will be in M1.

**Note:** There is an implicit "opt-in" assumed when we start a new development stream.
That is, projects will be left enabled when we start a new release cycle.
But if projects appear to not be active,
the Planning Council will first try to contact the Project and their PMC.
If no response and no release record in place by M2, then they will be disabled or removed.

Put another way,
being part of the Simultaneous Release is not a "one time" activity,
covering only the release part of the development cycle.
Instead, it is a commitment to stay "simultaneous" on an on-going basis.
Once in, if a project decides to not be part of future simultaneous releases,
they need to communicate that widely,
and as early as possible,
since it could affect adopters or downstream projects.

While part of the mechanics of
[contributing to the build](Contributing_to_Simrel_Aggregation_Build.md#the-best-format-and-process-for-contributing-to-simrel),
it is required that any contribution to the Simultaneous Release repository be done by a unique change to the aggrcon file.
There are two ways to do this.
First, your contribution repository can point to a simple repository where you know for sure there is only one version of your contribution available.
Second, your contribution repository can be a composite repository but then you name exactly which versions to include.
That is you need to specify all 4 version fields.
You can, of course, do both methods,
simple repository and name exact versions,
if you want the safety of that redundancy.

### Communication

At least one person from each project in a Simultaneous Release must subscribe to
[simrel-dev](https://accounts.eclipse.org/mailing-list/simrel-dev) mailing list,
since that is the primary communication channel for issues related to the Simultaneous Release 

Your representative to the Planning Council,
either from PMC or Strategic Member,
must attend Planning Council meetings and represent you there.
Presumably, of course, after meeting or communicating with you and the other projects they represent,
so they can fairly bring forward concerns and vote on issues that affect all projects,
if required.
Put another way,
by committing to be in the Simultaneous Release,
you agree to abide by all the Planning Council decisions and rules,
so be sure your representative understands your project and your situation.

A build-team member or release engineer from each project must be "on call" during the aggregation or integration periods to make sure any issues can be addressed quickly.

### Required Bundle forms and formats

#### Version Numbering 

Projects must use 4-part version numbers following the common semantics described in the [Eclipse version numbering](https://github.com/eclipse-platform/eclipse.platform/blob/master/docs/VersionNumbering.md) document.

#### OSGi bundle format

All plug-ins (bundles) must use the true bundle form.
That is, provide a manifest.mf file, and not rely on the plugin.xml file being 'translated' into a manifest.mf file at initial startup.
With that, empty plugin.xml files in the presence of a manifest.mf file should not be included in a bundle.

#### Execution Environment

All plug-ins (that contain Java code) must correctly specify their 
[Bundle Required Execution Environment (BREE)](https://github.com/eclipse-pde/eclipse.pde/blob/master/docs/Execution_Environments.md).
Resource-only bundles do not need a BREE since it doesn't matter which version of Java they are used with.

-   The maximum BREE up to and including the 2022-06 release is Java 11..
-   Starting in 2022-09, BREE up to and including Java 17.
-   Starting in 2024-06, BREE up to and including Java 21.
-   And, going forward, the first Eclipse SimRel release to allow an LTS will be 6-9 months later.

#### Signing

All plug-ins contributed to SimRel must be signed with Eclipse Foundation provided keys.
The signing can be completed with Jar Signing, or PGP signing, or both if desired.

##### Jar Signing

The Eclipse Foundation makes a centralized Eclipse Certificate available to all projects that can be used for Jar signing.
The Jar signing can be done using the centralized Eclipse Certificate which is accessible using the [Eclipse CBI Maven plug-in](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/wikis/IT_Infrastructure_Doc#jar-signing).

Jars should generally Jar signed only by their original creator and should not be re-signed by other projects.

##### PGP Signing

The Eclipse Foundation provides individual PGP keys for each project that allows projects to sign their deliverables, including Eclipse Plug-ins.

The signing can be done with the [Tycho GPG plug-in](https://tycho.eclipseprojects.io/doc/latest/tycho-gpg-plugin/sign-p2-artifacts-mojo.html).
For details on obtaining PGP keys for your project see the [IT Infrastructure section on PGP signing](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/wikis/IT_Infrastructure_Doc#what-about-gpg-signing).

This is the main methodology to sign third-party content contributed to SimRel,
but can be used for Eclipse content too.
See the [Eclipse Orbit](https://github.com/eclipse-orbit/.github/blob/main/profile/README.md) project for more information about consuming third-party content in SimRel.

#### Jarred Bundles

Projects must use jarred plug-ins (with unpack=false) unless there are technical reasons not to, i.e., require the directory form.

#### License text consistency 

Use standard forms of license documents so they are displayed in the most usable,
and concise way during install and update.
It is a normal requirement to use a standard
[Eclipse Foundation "about" template](https://www.eclipse.org/legal/epl/about.php),
but where those templates are edited by each project,
care must be taken to be sure they are edited in similar ways.
That is, substantial differences are fine,
if required,
but we need to avoid minor differences based on case, dates, and formatting.
Note that the Eclipse Foundation's license or user agreement files may change from year to year.
It is easier to point to a "symbolic" representation of the license, that is inserted at build time,
so it will be accurate with less manual updates from each project,
see [EPL License Feature](https://github.com/eclipse-cbi/epl-license-feature/blob/main/README.md) for details.

### Re-use and share common third party code

Any third-party plug-ins that are common between projects must be consumed via [Eclipse Orbit](https://github.com/eclipse-orbit/.github/blob/main/profile/README.md).
The Simultaneous Release must not have duplicate third-party libraries.
Note that this only applies to versions of the libraries;
thus if project A requires foo.jar 1.6 and project B uses foo.jar 1.7,
that's normally OK.
Different service versions a little less OK,
such as 1.7.1 vs 1.7.2; those should be explained, if required.
A qualifier-only
difference is definitely not OK.

### Provide optimized p2 repository

Projects must provide their own project p2 repository for their own project and updates.
Projects must [optimize their p2 repositories](https://github.com/eclipse-equinox/p2/blob/master/docs/p2_index.md)
to reduce bandwidth utilization and provide a better install and update experience for users.

In addition, they must provide their artifacts and metadata in a specified format and method to allow at least parts of their repository to be aggregated and mirrored to a common repository.
The [current process](Contributing_to_Simrel_Aggregation_Build.md) may be modified throughout the year, if improvements can be made.

Feature "includes" must be strict,
that is "include" an exact version of that other feature.
This is required so installs and builds can be repeatable independent of the exact day of the install or the exact repos enabled.
This is the way things are,
and have been for years,
and this statement is just making it explicit since technically it is possible for people to use some p2 publishers that don't have this predictability or repeatability
(which can certainly be appropriate in some contexts, just not the Simultaneous Release repository).
While there may, in the future, be new mechanisms that allow some "line up collection" to be specified,
it will be something new, not changing the meaning of feature "includes" element via p2 metadata.

For similar reasons, the repositories produced and contributed must use p2 publishers that produce greedy='false' in the content metadata for runtime-optional dependencies.
See and the [p2 Installable Units](https://github.com/eclipse-equinox/p2/blob/master/docs/Installable_Units.md) for some history and details on this issue of greedy versus non-greedy requirements.
But in brief, to have a runtime-optional dependency be non-greedy is important for several reasons,
especially in an IDE environment.
First it gives ultimate control over what is installed to the user,
based on their feature selection,
instead of depending on what happens to be available from the repositories they are pointing to at that moment it time.
It also makes it much easier for adopters to be able to predict (and maintain) what their users have installed.
In fact, if something is runtime-optional,
but pulled into an install because someone did not specify greedy='false' meta-data,
there is no way an adopter can provide a patch feature to one of their customers if that optional bundle causes a bug.

Everyone's p2 repositories must make use the of p2.mirrorsURL property.
For "how to" information, see [p2.mirrorsURL](https://github.com/eclipse-equinox/p2/blob/master/docs/p2_index.md).
Note: this is not really a "Simultaneous Release Requirement" but is required of any p2 repository on Eclipse Foundation infrastructure,x
and is just documented here to help spread the word and educate newcomers.

Similar to p2.mirrorsURL attribute, a well behaved, well optimized p2 repository should contain a p2.index file.
This is especially important for "composite repos" and prevents unnecessary "round trips" to server looking for files.
See for history and for how-to instructions, see the [p2.index](https://github.com/eclipse-equinox/p2/blob/master/docs/p2_index.md).
Again, this is not so much a "Simultaneous Release Requirement" but is recommended of any p2 repository on Eclipse Foundation infrastructure,
and is just documented here to help spread the word and educate newcomers.

### Branding

Each major project (as determined by participating PMCs) must have an 'About' dialog icon with hover text that displays the provider name.
Every plug-in and feature must specify a descriptive provider-name (for features),
or Bundle-Vendor header (for plug-ins),
as determined by the project's PMC,
e.g., "Eclipse Modeling Project" rather than "Eclipse.org".
Also, Projects should contribute to the welcome page when appropriate.

### Do No Harm

Projects must work together in any combination of any install.
Put another way, this means that users can install any subset of the projects participating in Simultaneous Release,
and each of the installed projects will work as well as if it had been installed independently.
If such a problem is identified,
the affected projects must track down and fix the problem,
to be in the simultaneous release repository.

### Document Update Policy

It is required that participating projects document whether or not they support updating from one release to the next.
For example, from Neon (2016) to Oxygen (2017).
\[The current implementation plan for tracking,
details TBD (see ),
is for there to be a field in the PMI Release Record that must be checked "Yes" or "No".\]
To meet this requirement in the affirmative:


- The project will accept bugs as valid if an update does not work, or there is a functional problem after updating.
- The project will test such updates.
- The project will document, such as in a "Migration Guide" or "Release Notes",
  any details about what does or does not work across yearly updates.

For example, a user's workspace may be "migrated" to the new release and not be usable by the old release after the update
(but projects freshly checked out or imported would continue to work with either).
Or, perhaps there are some known cases where some preference setting would be lost and have to be set again by the user.

Please note, this requirement is about *documenting* a project's policy.
As of this writing (for Oxygen) it is possible for a project to simply document "No, updates from previous releases are not supported".
In the future, after more experience is gained,
it is anticipated that it will be required to support "continuous updates" even across each boundaries.
The only reason we do not make it required at this point in time is that we are not sure we understand all the implications.
Accordingly, has been opened to document "requirements or issues" that participating projects are aware of or find in support of this effort.

## Optional Requirements

The items in this category are, in a sense, optional.
That is, what, exactly, is done by a project is optional,
but it is required for projects to **document** what they do.
These are often "best practices" that many projects have found essential at driving good adoption,
plus the items sometimes speak to the quality of the project
(quality as an Eclipse "good citizen",
as opposed to their code quality or architecture).
But, their importance is not as universally relevant to all projects and their adopters,
hence it is only required that each project document what they do for these items,
but exactly what they do is up to the best judgment of the project and their community.


## Planning Council Exception Process

Exceptions for any rule or schedule can be made if there are good enough reasons to.
This same exception process will be followed for things like "requests to respin" a build after a deadline.
The process to get any exception must be open and well documented and follow these steps:

1. The Project's PMC must approve the request for an exception and it is the PMC (not the lone Project or committer) that makes the request to the Planning Council.
   The Planning Council member that represents the PMC is the one to bring the issue forward to the Planning Council.
2. The exception requires at least 3 positive votes from active Planning Council members and no negative votes.
   When time is a factor, e.g., requests for rebuilds,
   the deadline for voicing a negative vote is basically by the time 3 votes are documented.
   But when time is not a factor,
   such as when requesting an exception to one of the criteria,
   then a period of one week will pass before being final,
   to allow times for concerns or negative votes to be voiced even after 3 positive votes.
   If there are not enough positive votes within one week,
   then the request for exception will be considered 'failed'.
   Note that "3" was chosen under the assumption that the Planning Council member representing the PMC would vote for it, 
   since that PMC must approve it initially, so that means 2 others must also vote for it, for 3 total.

Depending on the timing, the issue and votes will be documented in either the Planning Council Meeting minutes, or on the Planning Council mailing list.

# Additional Information

-   [Simultaneous Release FAQ](Simultaneous_Release_Cycle_FAQ.md)