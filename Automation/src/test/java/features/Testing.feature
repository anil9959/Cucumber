@testng
Feature: Free CRM Login Feature

Scenario: Flight Booking on chrome

Given user is already on Login Page "chrome"
And clicking on flight tab
And I entered source "vijayawada" and destination "bangalore"
When I click on search button
Then flights should be displayed and Book Cheapest Flight
And Close the browser

Scenario: Flight Booking on firefox

Given user is already on Login Page "firefox"
And clicking on flight tab
And I entered source "Delhi" and destination "Mumbai"
When I click on search button
Then flights should be displayed and Book Cheapest Flight
And Close the browser







		