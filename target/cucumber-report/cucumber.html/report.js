$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("blood.feature");
formatter.feature({
  "line": 1,
  "name": "Blood Group",
  "description": "As a user I want to login and edit blood group",
  "id": "blood-group",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9894263800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should able to click on Login link SuccessFully and navigate to dashboard page",
  "description": "",
  "id": "blood-group;user-should-able-to-click-on-login-link-successfully-and-navigate-to-dashboard-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on username and enter \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on password and enter \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am on dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I mouse hover and click on blood group tab",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should navigated to the blood group page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should be able to click on vertical ellipsis link under the action tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I mouse hover and click on edit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I mouse hover and click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should see the error message \"Permission denied\"",
  "keyword": "And "
});
formatter.match({
  "location": "BloodSteps.iAmOnLoginpage()"
});
formatter.result({
  "duration": 143991900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 31
    }
  ],
  "location": "BloodSteps.iClickOnUsernameAndEnter(String)"
});
formatter.result({
  "duration": 136639900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 31
    }
  ],
  "location": "BloodSteps.iClickOnPasswordAndEnter(String)"
});
formatter.result({
  "duration": 90473500,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3008730300,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iAmOnDashboardPage()"
});
formatter.result({
  "duration": 23900,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iMouseHoverAndClickOnBloodGroupTab()"
});
formatter.result({
  "duration": 246035100,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iShouldNavigatedToTheBloodGroupPage()"
});
formatter.result({
  "duration": 54500,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iShouldBeAbleToClickOnVerticalEllipsisLinkUnderTheActionTab()"
});
formatter.result({
  "duration": 864894300,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iMouseHoverAndClickOnEditButton()"
});
formatter.result({
  "duration": 166272300,
  "status": "passed"
});
formatter.match({
  "location": "BloodSteps.iMouseHoverAndClickOnSubmitButton()"
});
formatter.result({
  "duration": 410161300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Permission denied",
      "offset": 32
    }
  ],
  "location": "BloodSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 279623300,
  "status": "passed"
});
formatter.after({
  "duration": 840070700,
  "status": "passed"
});
});