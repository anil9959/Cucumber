$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Testing.feature");
formatter.feature({
  "name": "Free CRM Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testng"
    }
  ]
});
formatter.scenario({
  "name": "Flight Booking on chrome",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testng"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking on flight tab",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.clicking_on_flight_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered source \"vijayawada\" and destination \"bangalore\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.i_entered_source_and_destination(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "flights should be displayed and Book Cheapest Flight",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.flights_should_be_displayed_and_Book_Cheapest_Flight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Flight Booking on firefox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testng"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page \"firefox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking on flight tab",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.clicking_on_flight_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered source \"Delhi\" and destination \"Mumbai\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.i_entered_source_and_destination(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "flights should be displayed and Book Cheapest Flight",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.flights_should_be_displayed_and_Book_Cheapest_Flight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});