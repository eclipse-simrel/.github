# Helios Planning Council retrospective

These notes were collected at the end of the Helios Release, at 7/7/2010
Planning Council call, specifically just to collect them. And not to
solve issues, or even necessarily to suggest solutions, but just to
capture issues (good and bad) while the release was still fresh on our
minds. Where solutions are suggested below, it is intended to primarily
better capture the issue discussed .. not to dictate a or pre-judge a
solution. Action plans and solutions will be discussed in the Fall.

## History

Helios is the fifth simultaneous release, following Callisto, Europa,
Ganymede, Galileo. The Planning Council met regularly to firm come up
with plan and requirements. For meeting minutes, see
<http://wiki.eclipse.org/Planning_Council>.

## Comments from PC during 7/7 meeting

### Positive things mentioned

  - Released on time

<!-- end list -->

  - Infrastructure performance improvements (e.g. bugzilla and cvs) made
    things easier, and were appreciated

<!-- end list -->

  - Documentation of requirements has improved, over previous years

<!-- end list -->

  - Tracking system was better than previous methods

<!-- end list -->

  - Dependent projects were done on time, rolled up easily

<!-- end list -->

  - IP Process went well, was timely

### Things that could have been better

  - project identity problem continues:

<!-- end list -->

  -

      -
        39 projects in Helios tracking
        54 sets of documents
        62 IP logs
        71 "eclipse projects"

<!-- end list -->

  -

      -
        need to figure out how to "roll up" to have consistent view.
        or, perhaps improve definition of "project to participate"

<!-- end list -->

  -

      -
        webtools, good examples of "self rollup"
        gemeni is an up coming example of ?how to rollup?
        modeling ... are there really so many independent sub-projects?
        too much "hand waving" about "what's a project".

<!-- end list -->

  - problems with "legal documents" not discovered until late

<!-- end list -->

  -

      -
        how to do earlier, without over burdening projects

<!-- end list -->

  - hard to do "testing" ahead of time before final "milestone declared
    done".

<!-- end list -->

  -

      -
        partially since not enough time to fix problem between +1, +2;
        especially when projects did not provide "warmup" builds

<!-- end list -->

  - Composite repo with 'old stuff' was confusing; something might have
    worked in 'staging', but not once rolled up to repo, since there
    different content (due to having multiple milestone composites).

<!-- end list -->

  -

      -
        This was intentional, to find problems, but how to balance
        testing composites with being accurate

<!-- end list -->

  - too little testing of EPP Packages ... what's expectations? how to
    document?

<!-- end list -->

  -

      -
        in particular, need to document to include "install other stuff"
        in the general testing procedures documentation

<!-- end list -->

  - too little testing of staging or milestones ... what's expectations?
    how to document?

<!-- end list -->

  - Tracking tool was good (especially if HTML version produced, and
    included in release documents ... was that really said, or was I
    hearing things? :)

<!-- end list -->

  - One person mentioned requirements were too much "for one person" to
    track (esp. for those projects containing many small projects, maybe
    with only one committer, maybe on "life support").

<!-- end list -->

  - One mentioned they will "push back" on the list of requirements,
    they will ask "why required" ... but didn't mention any specifics in
    this call.

<!-- end list -->

  - One on Arch. Council wondered if there should be wider "sim.
    release" meetings, to encourage more participation on defining or
    explaining requirements ... didn't seem to be wide spread desired
    expressed at this meeting, but ... should listen carefully if
    expressed by others.

### items from John's note to planning council list

\- First, I think the post-mortem is a bit early. Last year we did this
in August, and we haven't had a chance to have all the necessary
discussions within our own project to provide good input yet. I hope we
will also have some time in the August call for further discussion on
it.

\- For planning purposes, it would be useful to know the subsequent
release name earlier. We only selected the Indigo name a few weeks
before the Helios release was out. I'm sure many projects start thinking
about their next release before June and it would help to have a name
associated with it. Perhaps we should even select the next two or three
release names all at once - both for continuity/consistency of naming
and avoid the annual churn of the name selection process (I vaguely
remember this being done before).

\- Every release train milestone and RC starting with M1 was delivered
on time\! This an amazing accomplishment and the first time this has
been on time for the entire release cycle as far as I remember. Actually
there was one exception: M2 was released a day early.

\- Having the +0,+1,+2,+3 dates on contiguous days felt a bit tight.
There was no room for build failures or last minute problems. I.e., a
project team has only 24 hours from when their prerequisites are
available until they must deliver their final bits for the milestone. If
they discover a problem caused by their prerequisite they have very
little time to diagnose and iterate with the upstream project. Having
said that, we did manage to ship on schedule every time so maybe it is
ok. One possible improvement would be to encourage projects to deliver
"candidate" builds to the staging repository before their milestone
release date, with the caveat that their bits could still change. That
would allow downstream projects to build/test against the candidate, and
report problems upstream before it is too late.

\- If we are going to test and enforce legal files in bundles
(about.html, etc), we need to start doing it earlier. It appears this
was only tested \*after\* RC4 and it caused a last minute firestorm for
several projects (bug 316720). I know this is the responsibility of each
project, but if we have the tools available to run on the release train
repository we should try doing it earlier (say M7).

\- There were a few cases of unexpected contributions sneaking into the
build unannounced after their due date. I think we should have the
flexibility to accomodate late changes but they at least need to be
communicated so anyone downstream can react. It would be nice if we
could avoid it, but maybe we need to "lock" the build at the end of the
+2 date and only rebuild if requested on the list for all to see. I can
give examples where this happened but it's nicer to avoid naming names
;)

### Items from Architecture Council meeting

Callers to Architecture Council meeting discussed on July 8. See [those
meeting
notes](Architecture_Council/Meetings/July_8_2010#Helios_Retrospective "wikilink")
for additional feedback items. Some overlap, but some distinct comments.

## Reference

See also [last year's
retrospective](Galileo_postmortem.md)

[Category:Helios](Category:Helios "wikilink")