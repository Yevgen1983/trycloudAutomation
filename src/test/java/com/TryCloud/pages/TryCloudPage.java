package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudPage { {
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//input[@id='user']")
    public WebElement login;
    @FindBy(xpath =" //input[@id='password']")
    public WebElement password1;
    @FindBy (xpath =" //input[@id='submit-form']")
    public WebElement submit;
   // public void login(String username,String password){
 @FindBy(xpath =" //p[@class='warning wrongPasswordMsg']")
         public  WebElement mms;

}
