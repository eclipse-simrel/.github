# Juno Planning Council retrospective

These notes were collected at the end of the Indigo Release, at 8/1/2011
Planning Council call, specifically just to collect them. And not to
solve issues, or even necessarily to suggest solutions, but just to
capture issues (good and bad) while the release was still fresh on our
minds. Where solutions are suggested below, it is intended to primarily
better capture the issue discussed .. not to dictate a or pre-judge a
solution. Action plans and solutions will be discussed later.

## History

Juno is the seventh simultaneous release, following Callisto, Europa,
Ganymede, Galileo, Helios, Indigo. The Planning Council meets regularly
to come up with plans and requirements. Eclipse Foundation projects can
voluntarily join the simultaneous release. For meeting minutes, see
<http://wiki.eclipse.org/Planning_Council>.

## Comments from PC during 8/1 meeting

These rough notes were captured from the "brainstorming" session. We
will refine in future meetings.

### Positive things mentioned

(Especially things not mentioned in previous retrospective, such as
predictability; we'll assume all those still true unless otherwise
stated).

  - perceived to be smoother. projects improving with experience. The
    phrase "well oiled machine" was used to describe it.

### Things that could have been better

  - The importance (or no) of "non-greediness" requirement seems little
    understood.

<!-- end list -->

  - The use of non-train projects by train projects seems
    confused/confusing.

<!-- end list -->

  -
    perhaps have an early "freeze" (say M6?) to be sure no "last minute"
    (untested) surprises.

<!-- end list -->

  - query2 case ... slipped through cracks.

<!-- end list -->

  -
    perhaps require or suggest "one release" before joining train

<!-- end list -->

  - communication:

<!-- end list -->

  -
    we currently do not track or have an easy way of knowing which
    projects have no one subscribed to cross-project list?

## Comments from PC meeting during 9/5 meeting

  - ''One issue (I brought up) was that every April or May we start to
    see a flurry of note/bugs about how p2 isn't good enough, or is
    "hard on the Eclipse infrastructure". Is there no way we can be more
    proactive? Do we need a "cross project team"? ''

<!-- end list -->

  - ''Ian did a good job of summarizing some of the issues runtime
    projects have being in "sim. release" and thought it would be an
    ongoing discussion as to "what do they want instead, if anything".
    Some points made: ''

<!-- end list -->

  -
    *p2 repo isn't all that interesting ... runtimes want to be in
    "maven central" (or maven.eclipse.org, I would assume)*.

<!-- end list -->

  -
    ''Some issues were "matter of degree", such as often 10 or 15 "tools
    related projects" often must be coordinated (such as "web tools")
    but for runtime projects its seldom more than a few, if that many.
    ''

<!-- end list -->

  -
    *One fundamental issue (I think, if I heard right) was that many
    runtime clients want to stay on OLD version (even if tools advance)
    but OLD version is no longer in "current" repository (so, while
    doable ... it takes extra work, and is less "coordinated" to those
    users). They could (nearly) as easily use current tools repo, and
    individual runtime repos when needed*.

## Reference

See also [last year's
retrospective](Indigo_retrospective.md)

[Juno](Category:Juno "wikilink")