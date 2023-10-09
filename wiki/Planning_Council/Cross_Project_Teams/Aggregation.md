## Members

`   John Arthorne (Platform)`
`   Thomas Hallgren (Buckminster)`
`   David Williams (WTP)`

## Statement of Problem

The current "Helios Builder", has many strong points, but some
weaknesses as well:

  - It is not truly reproducible. There are two sources of input,
    specification (.build) files from cvs, and project's repositories.
    We only have control over the CVS part, (it can be tagged, etc.) but
    Projects can change their repo at any time (either on purpose, or
    accidentally). This change in repo can cause the build to fail or it
    might still succeed, but be a different set of bits than previous
    runs.

<!-- end list -->

  - The current build "builds" feature/product/and plugins (branding and
    capabilities). Ideally, we would only aggregate, and not compile
    anything. ~~~~

<!-- end list -->

  - The current builder/aggregator "fails" if anything is wrong. Even if
    it is only a leaf node. At times, this requires tweaking the "build
    model" to get the build operational again, while waiting for the
    leaf node to correct itself. It would be better if the build tried
    to "work" even if some components were in error, so that tests,
    etc., (that don't depend on leaf node in repo) can get started.

<!-- end list -->

  - When the build fails (due to conflicting dependencies, etc.) it is
    hard to figure out the root of the problem, without a p2 trained
    eye.

<!-- end list -->

  - requires frequent "intervention" to add/remove projects in model
    file (helios.build).

<!-- end list -->

  - The +0, +1, +2 categories are an approximate categorization.

<!-- end list -->

  - There is unspecified trade-offs between being "strict" vs. being
    "lax". For example, in .build files, projects can specify version=""
    and the highest version in the repo will be fetched or mirrored.
    But, there's no guarantee that the repo has been updated yet, so in
    some cases, it might appear to have "built", but is still using a
    lower than expected version.

<!-- end list -->

  - There are some steps in the process that require "hand editing" (or,
    at least, running scripts that are not P2 API), for example
    versioning categories, changing mirror URLs, and creating and
    updating composite repository).

<!-- end list -->

  - Should we migrate to improved aggregation tools (e.g. see [B3
    Aggregator](http://wiki.eclipse.org/Buckminster_Aggregator_User_Guide)).
    And if so, how and when.