$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "This Feature is going to design Home page functionalities with the below listed scenarios",
  "description": "\r\n/*Scenario: This scenario is to validate url is working or not\r\n//Given Enter URL \r\n//Then Validate URL\r\n//And Validate Securelogin,username, passwod fields are displaying or not \r\n//Then Validate error messages*/\r\n\r\n\r\n//Scenario: This scenario will check whether dropdown is sorted or not\r\n//Given  open facebook url\r\n//Then Identify dropdown box\r\n//And Validate whether dropdown is sorted or not*/",
  "id": "this-feature-is-going-to-design-home-page-functionalities-with-the-below-listed-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "This scenario will validate Admin page",
  "description": "",
  "id": "this-feature-is-going-to-design-home-page-functionalities-with-the-below-listed-scenarios;this-scenario-will-validate-admin-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "open url",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "click on admin tab",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TS02_TestCase.navigateToAdminTab()"
});
formatter.result({
  "status": "skipped"
});
});