package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.PageFactory.*;

public class LoginPage  {
    public LoginPage(){
        initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;

    @FindBy(xpath = "//body[@class='o_web_client o_no_chat_window']")
    public WebElement confirmHomePage;












    String currentUserEmail;


    public void userLogin(String email1, String password1){
        currentUserEmail = email1;
        this.emailBox.sendKeys(email1);
        this.passwordBox.sendKeys(password1);
        login_button.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
//        wait.until(ExpectedConditions.urlContains("map"));

    }


//    public void managerLogin(){
//
//        obj.emailBox.sendKeys(ConfigurationReader.getProperties("ManagerEmail"));
//        obj.passwordBox.sendKeys(ConfigurationReader.getProperties("ManagerPassword"));
//        obj.login_button.click();
//    }
//
//    public void open(){
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
//        waitForPageToLoad(5);
//    }
}