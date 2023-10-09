# Accessibility Team

## Members

  -
    Tammy Cornell, IBM
    Kentarou Fukuda, ACTF Project
    Neil Hauge, Oracle
    Kaloyan Raev, SAP
    Oliver Keim, SAP

## Statement of Problem

Currently, many Eclipse Members have a business need to make sure
software they consume from Eclipse meets certain Accessibility
requirements. Besides just being a nice thing to do, it is often
required to "prove" software is accessibility, in order to sell to
certain markets or bid on certain contracts.

The "proof" often comes in the form of conducting certain tests and
checks and completing a checklist, for long term documentation of what
was done to ensure the software is accessible.

Currently, many Eclipse members have their own process and checklists
for this accessibility work, but it would be simpler if there was one
"Eclipse Accessibility Checklist" which would set the expectation for
all Eclipse Projects ... at least all Eclipse Projects participating in
the yearly, simultaneous release. And, of course, this "required item"
for the yearly release can not be too burdensome for the Eclipse
projects.

Our "required" item for Galileo simultaneous release was a 'should do'
item, and stated as simply as "... should design and test for
accessibility". So another way to state the problem, is whether or not
there is a stronger requirement that would lead to a stronger, more
demonstrable or measured statement about accessibility compliance.

## Meetings and Notes

Meeting 10/15 9:00am US EDT Attendees: Tammy, Neil, Kentarou & Kaloyan

  - reviewed the goal of this project
  - discussed which Accessibility standards each company is following,
    confirmed that all (involved in this meeting) are using the US
    Section 508.
  - Kentarou provided an overview of the incubator ACTF project:
    <http://www.eclipse.org/actf/>
  - The ACTF project needs to be enhanced more before it can be widely
    adopted by Eclipse projects. Currently does not provide tooling for
    SWT. It currently supports html, flash content, similar function as
    inspect32... Helios timeframe is to short to build in the additional
    function.
  - For a short term solution we believe it would be valuable to update
    the Accessibility guidance located at eclipse.org:
    <http://www.eclipse.org/articles/article.php?file=Article-Accessibility/index.html#>
    This document was originally created by Tod Creasey in IBM, Tammy
    will contact Tod to see about getting this webpage updated.
  - Confirmed that each team is using the Software, Web & Documentation
    checklists. Tammy will work on getting a copy of these checklists to
    possibly include in the 'Should do'/guidelines section of the
    release train/ emphasize/recommended .
    <http://www-03.ibm.com/able/guidelines/index.html>
  - Kaloyan is trying to locate an Accessibility rep to join him on the
    team
  - Will most likely break this up into two parts: short term/Helios:
    update guidance documentation and provide stripped down checklists.
    long term goal: provide tools (possibly ACTF) to automate
    Accessibility checking during development.
  - will meet again on 10/20 9:00am US EDT

-----

Meeting 10/20 9:00am US EDT Attendees: Tammy & Kentarou

  - Tammy confirmed that the following webpage will be updated by 11/30
    <http://www.eclipse.org/articles/article.php?file=Article-Accessibility/index.html#>
  - Need someone to review the accessibility checklists located here to
    see if they can be trimmed down/reduced:
    <http://www-03.ibm.com/able/guidelines/index.html>
  - Tammy is verifying if the above checklists can be used on the
    Eclipse website.
  - Kentarou supplied an ACTF presentation that Tammy will distribute to
    this team
  - Kentarou will hold a meeting this week with some of the other
    resources working on ACTF to see what they plan to accomplish in the
    upcoming months. Kentarou mentioned that this project could use some
    additional resources/active committers.
  - May expand Accessibility guidelines webpage to contain basic testing
    instructions and possibly a link to an open source screen reader
    (NVDA) <http://www.nvda-project.org/>
  - Will try to handle actions via email this week and schedule our next
    meeting for 10/27.

-----

Meeting 10/27 9:00am US EDT Attendees: Tammy, Neil & Kentarou

  - the Accessibility checklists located here:
    <http://www-03.ibm.com/able/guidelines/index.html> can not be
    reproduced on the Eclipse website, if we use them we will need to
    provide a link back to the IBM public website to reference them.
    ACTION ITEM: The other accessibility cross project team members will
    research and see if they can come up with something more generic
    that can be stored on eclipse.org.
  - will suggest an Accessibility Verification milestone be added to the
    release train schedule (possibly around the API Freeze)so release
    train projects will be reminded to do a first pass accessibility
    check that is early enough so they have time to react to any
    accessibility

problems/issues.

  - Neil will draft a recommendation (proposal is due 11/4/09). Will
    review recommendation in the next meeting on 10/29.
  - Kentarou is meeting with the ACTF team tomorrow and will have an
    update/outlook for us in the next meeting.

Notes from Kentarou: Here are the URLs of other accessibility resources
on Eclipse. 1. Tips for making user interfaces accessible
<http://help.eclipse.org/galileo/topic/org.eclipse.platform.doc.isv/reference/misc/ui_accessibility_tips.html>
2. Accessibility features in Eclipse
<http://help.eclipse.org/galileo/topic/org.eclipse.platform.doc.user/concepts/accessibility/accessmain.htm>
3. Accessibility check list example (Eclipse SDK 3.2, 3.3)
<http://dev.eclipse.org/viewcvs/index.cgi/platform-ui-home/accessibility/status33.html?content-type=text%2Fplain&view=co>
<http://dev.eclipse.org/viewcvs/index.cgi/platform-ui-home/accessibility/status32.html?content-type=text%2Fplain&view=co>
it might be a good reference for other projects to create their own
check list. Item 1 above and this article
(http://www.eclipse.org/articles/article.php?file=Article-Accessibility/index.html)
will be a good reference documentation (and starting point) for Eclipse
developers. We should break down the software accessibility check list
into work items suitable for Eclipse. However, it will be a middle/long
term work.

-----

Meeting 10/29 9:00am US EDT Attendees: Neil & Kentarou

  - Kentarou talked to ACTF team. Communicated that resources are
    currently limited. The team's current focus is to provide an
    inspection tool that can verify accessibility for platform UI
    development (based on MSAA usage).
  - The ACTF team would like to do more, but it's not clear whether they
    will be able to provide the general automated testing tool for
    Eclipse given current resource constraints.
  - Kentarou recommended adding an open issue for the need to find more
    resources for the ACTF project in the Eclipse community. Also
    suggested removing dependency on the ACTF tooling from the long term
    requirement, and add the presence of a checklist. Neil will make
    these changes to the proposal.
  - On the topic of the Accessibility Checklist
      - We should be able to draft something like the IBM checklist,
        creating it ourselves if necessary
      - We can probably finalize the checklist after the recommendation
        deadline since time is running out
      - Kentarou and Neil will continue to look for accessibility
        content for the checklist

-----

Meeting 11/3 9:00am US EST Attendees: Neil, Kentarou, Kaloyan & Tammy

  - Kentarou - we should also focus on web accessibility which will be
    used with projects such as e4. Add WCAG to the guidelines.
  - Kentarou - make sure the proposal explains that the platform focus
    for now will be with Windows and that other platforms may need to be
    considered in the future.
  - Tammy - will add pointers to the generic checklists/guidelines
    provided by the .gov sites.
  - Kaloyan will have Oliver review the recommedation and also look into
    a set of generic checklists that could possibly be used on the
    Eclipse website.
  - all agree that until this is automated more, that we will recommend
    it be on the "should do" list.
  - Tammy will make a couple of updates to recommendation and then send
    it around to the cross-project team for final review. Will submit
    proposal later this week.

## Recommendation to Planning Council

**Status**: Submitted 11/5

**Open Issues**:

  - Need testing to determine if we can recommend GNU licensed NVDA open
    source screen reader. One current barrier for project testing is
    having to buy a license for the predominant screen reader software.
    Other short term options might include accessibility test tools such
    as [AccChecker](http://www.codeplex.com/AccCheck) and [UIA
    Verify](http://www.codeplex.com/UIAutomationVerify).
  - The ACTF project is in need of more resources to pursue longer term
    goals of automated accessibility testing for Eclipse. We need to
    look for possible contributors in the Eclipse community.

**Proposal**:

Accessibility is a key requirement for many Eclipse adopters based on
business, legal, and ethical grounds. Accessibility is also an important
requirement for disabled end-users of Eclipse. Accessibility has
previously been on the "Should do" list with one line of information
describing the release train requirements. Building on this foundation
in the short-term (Helios), we propose:

1.  The requirement for accessibility remain in the "Should do" or "Good
    citizen" category, with the thought of moving this to the "Required"
    category in the future.
    1.  Accessibility testing is not something that can be easily
        automated using Eclipse tools (for now) and testing may require
        purchase of screen reader software.
2.  The main [accessibility
    article](http://www.eclipse.org/articles/article.php?file=Article-Accessibility/index.html)
    at Eclipse Corner should be made current (Todd Creasey has prepared
    an update for this
    page:<https://bugs.eclipse.org/bugs/show_bug.cgi?id=296251>) and
    encourage all projects to follow the design guidelines contained
    within. These guidelines will be expanded to include basic
    verification instructions and links to open source Accessibility
    tools that can be leveraged such as
    NVDA:<http://www.nvda-project.org/>.
    1.  This article is the basis for accessibility design at Eclipse.
        Projects should use this article as a way to ensure
        accessibility in their plugins.
3.  Projects should document responses to a consolidated accessibility
    checklist as a part of the release artifacts. Checklist reference
    materials:
    <http://www.itic.org/resources/voluntary-product-accessibility-template-vpat/>,
    <http://www.section508.gov/>, <http://www.w3.org/TR/WCAG/>.
    1.  M6 should be listed as the recommended milestone for completing
        initial accessibility testing to insure that there is time to
        address any issues found.
    2.  Initial platform focus should be Windows.

In the long-term we propose:

1.  The ACTF project should be used to automate accessibility testing
    for train projects within Eclipse.
2.  The accessibility requirement should be moved to the "Required" list
    or at least re-evaluated after Helios based on the status of open
    source accessibility testing tools.

[Planning_Council_Cross_Project_Teams](Category:Planning_Council_Cross_Project_Teams "wikilink")