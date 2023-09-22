package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is located on the main page of saucedemo website")
    public void user_is_located_on_the_main_page_of_saucedemo_website() {
        // Add code to navigate to the main page of the Saucedemo website
    }

    @When("User clicks \"Login\" button")
    public void user_clicks_login_button() {
        // Add code to simulate clicking the "Login" button
    }

    /**
     * 
     */
    @Then("User should see \"Epic sadface: Username is required\" error message")
    public void user_should_see_error_message() {
        // Add code to verify the presence of the error message
    }
}
