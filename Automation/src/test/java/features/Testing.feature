@testng
Feature: Free CRM Login Feature

Scenario Outline: Flight Booking on chrome

Given user is already on Login Page "<Browser>"
And clicking on flight tab
And I entered source "<Source>" and destination "<Destination>"
When I click on search button
Then flights should be displayed and Book Cheapest Flight
And Close the browser

Examples:
|Browser|Source|Destination|
|chrome|vijayawada|bangalore|

Scenario Outline: Flight Booking on firefox

Given user is already on Login Page "<Browser>"
And clicking on flight tab
And I entered source "<Source>" and destination "<Destination>"
When I click on search button
Then flights should be displayed and Book Cheapest Flight
And Close the browser
Examples:
|Browser|Source|Destination|
|firefox|Delhi|bangalore|







		