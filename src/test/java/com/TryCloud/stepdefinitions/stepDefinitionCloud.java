package com.TryCloud.stepdefinitions;

import com.TryCloud.pages.TryCloudPage;
import com.TryCloud.utilities.Driver;
import com.TryCloud.utilities.configurationReader;
import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.core.backend.CucumberInvocationTargetException;
import io.cucumber.core.backend.ParameterInfo;
import io.cucumber.core.backend.StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinitionCloud {
    TryCloudPage tryCloudPage=new TryCloudPage();

    @Given("user1 on the login page")
    public void user1_on_the_login_page() {
        Driver.getDriver().get(configurationReader.getProperty("env"));
    }
    @When("user1 use username   and passcode")
    public void user1_use_username_and_passcode(){
       tryCloudPage.login.sendKeys(configurationReader.getProperty("login"));
       tryCloudPage.password1.sendKeys(configurationReader.getProperty("password"));

    }
    @When("user1 click the login button")
    public void user1_click_the_login_button() {
        tryCloudPage.submit.click();
    }
    @Then("verify1 the user should be at the dashboard page")
    public void verify1_the_user_should_be_at_the_dashboard_page() {
        System.out.println(Driver.getDriver().getTitle().contains("Dashboard"));
        Driver.closeDriver();
    }


    }

