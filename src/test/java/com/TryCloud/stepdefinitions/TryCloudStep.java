package com.TryCloud.stepdefinitions;

import com.TryCloud.pages.TryCloudPage;
import com.TryCloud.utilities.Driver;
import com.TryCloud.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Properties;


public class TryCloudStep {
    TryCloudPage tryCloudPage=new TryCloudPage();

    @Given("user on the login page")
    public void userOnTheLoginPageHttpQaTrycloudNetIndexPhpLoginClear() {
        {
            Driver.getDriver().get(configurationReader.getProperty("env"));
        }
    }
    @When("user use username  {string}  and passcode {string}")
    public void userUseUsernameAndPasscode(String username,String password) {

        tryCloudPage.login.sendKeys(username);
        tryCloudPage.password1.sendKeys(password);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        tryCloudPage.submit.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        System.out.println(Driver.getDriver().getTitle().contains("Dashboard"));
        Driver.closeDriver();
    }



    }









