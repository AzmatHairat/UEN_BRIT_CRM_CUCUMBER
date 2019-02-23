package com.cybertek.step_definitions.loginFunction;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class loginStep  {


    public static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);
  //  public static WebDriver driver;



    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am opening the login page");
        // open the login page of the application
        // url is in the properties file
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //Driver.getDriver().manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);

    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {

        LandingPage landingPage = new LandingPage();
        landingPage.clickDemobtn();
        System.out.println("Email: "+ email);
        System.out.println("Password: "+ password);

        LoginPage loginPage = new LoginPage();
        loginPage.userLogin(email,password);
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {

        LoginPage loginPage = new LoginPage();

        System.out.println("I can see the home page now!!");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

        wait.until(ExpectedConditions.urlContains("web?#menu_id=115"));

        Assert.assertTrue(loginPage.confirmHomePage.isDisplayed());

    }

    @Given("user click the CRM button")
    public void user_click_the_CRM_button() throws InterruptedException{
        HomePage homePage = new HomePage();
        wait.until(ExpectedConditions.visibilityOf(homePage.CRMButton));
        homePage.CRMButton.click();
        new Actions(Driver.getDriver()).pause(5000).perform();
        //wait.until(ExpectedConditions.titleContains("Pipeline"));
//        Thread.sleep(5000);

    }

    @Then("CRM page should be displayed")
    public void crm_page_should_be_displayed() {
     String expectedTitile = "Pipeline - Odoo";

     wait.until(ExpectedConditions.titleContains("Pipeline"));
     Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitile);
        System.out.println("this is CRM page ");


    }


}
