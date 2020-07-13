$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 23,
  "name": "Home page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "jenny",
        "abcd",
        "john@abcd.com",
        "Australia",
        "3242353"
      ],
      "line": 26
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Then Home page is populated"
    }
  ],
  "line": 28,
  "name": "Cards displayed are \"false\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 140093500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "duration": 1226400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 21
    }
  ],
  "location": "stepDefination.cards_displayed_are(String)"
});
formatter.result({
  "duration": 1810000,
  "status": "passed"
});
});