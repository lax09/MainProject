$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "This Feature is going to design Home page functionalities with the below listed scenarios",
  "description": "",
  "id": "this-feature-is-going-to-design-home-page-functionalities-with-the-below-listed-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "This scenario will validate Admin page",
  "description": "",
  "id": "this-feature-is-going-to-design-home-page-functionalities-with-the-below-listed-scenarios;this-scenario-will-validate-admin-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "open url",
  "rows": [
    {
      "cells": [
        "ff",
        "http://server/bank/"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on admin tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Give username,passwords and click on login button",
  "rows": [
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on Add staff memeber link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Give deatils of staff",
  "rows": [
    {
      "cells": [
        "q1",
        "q2",
        "q3",
        "q4",
        "q5",
        "q6",
        "q7",
        "q8",
        "q9"
      ],
      "line": 13
    },
    {
      "cells": [
        "lakshmi7",
        "12-Mar-1993",
        "unmarried",
        "12-Mar-2014",
        "developer",
        "hyderabad",
        "1234567890",
        "038lax@gmail.com",
        "Amma@123"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TS02_TestCase.openBrowser(DataTable)"
});
formatter.result({
  "duration": 6209547277,
  "status": "passed"
});
formatter.match({
  "location": "TS02_TestCase.navigateToAdminTab()"
});
formatter.result({
  "duration": 384851874,
  "status": "passed"
});
formatter.match({
  "location": "TS02_TestCase.clickOn(DataTable)"
});
formatter.result({
  "duration": 1060748435,
  "status": "passed"
});
formatter.match({
  "location": "TS02_TestCase.clickAddStaff()"
});
formatter.result({
  "duration": 155068466,
  "status": "passed"
});
formatter.match({
  "location": "TS02_TestCase.detailsOfStaff(DataTable)"
});
formatter.result({
  "duration": 3730229836,
  "status": "passed"
});
});