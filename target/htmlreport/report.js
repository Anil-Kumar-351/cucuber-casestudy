$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/Search.feature");
formatter.feature({
  "name": "search product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User search for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens login page",
  "keyword": "Given "
});
formatter.step({
  "name": "enters usernamee as \"\u003cunamee\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "enters passwordd as \"\u003cpsdd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user search for a product\"head\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on find button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "unamee",
        "psdd"
      ]
    },
    {
      "cells": [
        "AlexUser",
        "Alex@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User search for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.user_opens_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters usernamee as \"AlexUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.enters_usernamee_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters passwordd as \"Alex@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Search.enters_passwordd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for a product\"head\"",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_search_for_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on find button",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.click_on_find_button()"
});
formatter.result({
  "status": "passed"
});
});