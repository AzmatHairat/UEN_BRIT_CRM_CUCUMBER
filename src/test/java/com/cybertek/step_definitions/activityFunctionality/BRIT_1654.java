package com.cybertek.step_definitions.activityFunctionality;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BRIT_1654 {

    public static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    HomePage homePage = new HomePage();

    @Then("User click the Activity types button")
    public void user_click_the_Activity_types_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Driver.getDriver().manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOf(homePage.ActivityTypesButton));
        homePage.ActivityTypesButton.click();
        new Actions(Driver.getDriver()).pause(2000).perform();

    }

    @Then("Activity types should be displayed")
    public void activity_types_should_be_displayed() {
        String expected = "Activity Types - Odoo";
        wait.until(ExpectedConditions.titleContains("Activity"));
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @And("user click Create button")
    public void user_click_Create_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.createButtonCustomer));
        homePage.createButtonCustomer.click();


    }

    @Then("click on Name column")
    public void click_on_Name_column() {
        homePage.createTypeNmae.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.createTypeNmae));
        homePage.createTypeNmae.sendKeys("Test001");

    }


    @Then("click the save button")
    public void click_the_save_button() {

        homePage.creatAfterSaveClick.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.buttonSvae));
        homePage.buttonSvae.click();
    }


}



