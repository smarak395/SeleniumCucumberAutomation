$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Automation Practice Login Test Scenario",
  "description": "",
  "id": "loginfeature;:-automation-practice-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the header signIn link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on signIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on My Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on signOut button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should be signedOut from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "loginfeature;:-automation-practice-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "loginfeature;:-automation-practice-login-test-scenario;;1"
    },
    {
      "cells": [
        "smarakuniversum@gmail.com",
        "hello"
      ],
      "line": 18,
      "id": "loginfeature;:-automation-practice-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2045686456,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": ": Automation Practice Login Test Scenario",
  "description": "",
  "id": "loginfeature;:-automation-practice-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the header signIn link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters \"smarakuniversum@gmail.com\" and \"hello\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on signIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on My Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on signOut button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should be signedOut from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 9052743969,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.title_of_login_page_is_My_Store()"
});
formatter.result({
  "duration": 116015857,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.user_clicks_on_the_header_signIn_link()"
});
formatter.result({
  "duration": 3058494577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "smarakuniversum@gmail.com",
      "offset": 13
    },
    {
      "val": "hello",
      "offset": 45
    }
  ],
  "location": "LoginDefination.user_enters_and(String,String)"
});
formatter.result({
  "duration": 397578280,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.user_clicks_on_signIn_button()"
});
formatter.result({
  "duration": 2232755114,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.user_is_on_My_Account_page()"
});
formatter.result({
  "duration": 37998840,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.user_clicks_on_signOut_button()"
});
formatter.result({
  "duration": 3904141207,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefination.user_should_be_signedOut_from_the_application()"
});
formatter.result({
  "duration": 29603074,
  "status": "passed"
});
formatter.after({
  "duration": 114323397,
  "status": "passed"
});
});