<img src="../assets/artwork/svg/SimRel-Color.svg" width="10%">

---

# SimRel Wiki

A number of Eclipse projects harmonize their development activities to produce releases on a coordinated schedule 
to produce the so-called *simultaneous release*, *coordinated release*, or *release train* of Eclipse.

---

#### Planning Council

This folder provides the wiki for the Eclipse Planning Council, which helps manage, direct, and schedule the SimRel activities.

- [Eclipse Planning Council](Planning_Council.md)

---

#### SimRel Details

This folder also provides provides details about the processes involved in producing the quarterly release, including schedules:

- [SimRel Schedule](Simultaneous_Release.md)
- [SimRel Overview](SimRel/Overview.md)
- [SimRel Requirements](SimRel/Simultaneous_Release_Requirements.md)
- [SimRel Roles](SimRel/Simultaneous_Release_Roles.md)
- [SimRel Plan](SimRel/Simultaneous_Release_Plan.md)
- [SimRel Contribution](SimRel/Contributing_to_Simrel_Aggregation_Build.md)
- [SimRel FAQ](SimRel/Simultaneous_Release_Cycle_FAQ.md)
- [SimRel Checklist](SimRel/Release_Checklist.md)

#### Adding a new SimRel and its dates

When adding a new simultaneous release and its dates, first add the JSON file containing the agreed dates for `M1`, `M2`, `M3`, `RC1`, `RC2` and `GA` in a JSON file named
```
wiki/SimRel/<SimRel-Name>_dates.json
```
where `<SimRel-Name>` is for example `2025-12`.

To generate the wiki details page for that release, the following command can be run from the root of this repository (requiring Java-25 or later):
```
java scripts/generateReleaseDetails.java <SimRel-name>
```

---

#### Why this format?

You may be wondering why this format for the wiki pages?
The information in this folder was previously hosted at [wiki.eclipse.org](https://wiki.eclipse.org/),
but in early 2024 that wiki [was made read-only](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/wikis/Wiki-shutdown-plan).
The GitHub built-in wiki was determined to be insufficiently flexible.
- Non-committers can't easily contribute due to lack of support for Pull Requests.
- Folder nesting is not fully supported.
- Overall navigation is somewhat limited.

Therefore simply storing the files as markdown directly in this repository seemed the best solution.
