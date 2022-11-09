package com.TryCloud.stepdefinitions;

import com.TryCloud.pages.TryCloudPage;
import com.TryCloud.utilities.Driver;
import com.TryCloud.utilities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2Invalid {
     TryCloudPage login= new TryCloudPage();
    @Given("user on the login page ")
    public void user_on_the_login_page_http_qa3_trycloud_net_index_php_login_clear(Integer int1) {
        Driver.getDriver().get(configurationReader.getProperty("env"));
    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password ) {
       login.login.sendKeys(username);
       login.password1.sendKeys(password );

    }
    @When("user click the login button1")
    public void user_click_the_login_button1() {
        login.submit.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {

        Assert.assertEquals(login.mms.getText(),message);

}
}