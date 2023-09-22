Feature: User Login on Saucedemo Website

  Scenario: User sees error message when logging in without a username
    Given User is located on the main page of saucedemo website
    When User clicks "Login" button
    Then User should see "Epic sadface: Username is required" error message
