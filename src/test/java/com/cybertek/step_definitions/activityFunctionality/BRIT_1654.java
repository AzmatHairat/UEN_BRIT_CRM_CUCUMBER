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
        new Actions(Driver.getDriver()).pause(2000).perform();
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

        //homePage.creatAfterSaveClick.click();

        wait.until(ExpectedConditions.visibilityOf(homePage.buttonSvae));
        homePage.buttonSvae.click();
    }

    @Then("click the saved Activity name")
    public void click_the_saved_Activity_name() {
        wait.until(ExpectedConditions.visibilityOf(homePage.creatFindTheNameAfterSave));
        homePage.creatFindTheNameAfterSave.click();
    }

    @Then("click edit button")
    public void click_edit_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.creatEditButton));
        homePage.creatEditButton.click();
    }

    @Then("type {string}")
    public void type(String string) {
       homePage.createTypeNmae.click();
       homePage.createTypeNmae.sendKeys(string);

    }

    @Then("click the recommendedNextActivities button")
    public void click_the_recommendedNextActivities_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.recommendedNextAcButton));
        homePage.recommendedNextAcButton.click();

    }

    @Then("select one option in recommendedNextActivities column")
    public void select_one_option_in_recommendedNextActivities_column() {
        wait.until(ExpectedConditions.visibilityOf(homePage.recommededListClick));
       homePage.recommededListClick.click();

        new Actions(Driver.getDriver()).pause(2000).perform();

    }
    @Then("User click the saved secondActivity name")
    public void user_click_the_saved_secondActivity_name() {
        wait.until(ExpectedConditions.visibilityOf(homePage.creatFindTheNameAfterSave2));
        homePage.creatFindTheNameAfterSave2.click();
    }

    @Then("Click the Days column to modify Days")
    public void click_the_Days_column_to_modify_Days() {
        wait.until(ExpectedConditions.visibilityOf(homePage.daysButton));
        homePage.daysButton.click();
    }

    @Then("type {string} for day")
    public void type_for_day(String string) {
        wait.until(ExpectedConditions.visibilityOf(homePage.daysButton));
        homePage.daysButton.clear();
        homePage.daysButton.sendKeys("1");

    }

    @Then("user click the first checkbox form top")
    public void user_click_the_first_checkbox_form_top() {
        wait.until(ExpectedConditions.visibilityOf(homePage.chekBoxClick));
        homePage.chekBoxClick.click();
    }

    @Then("all the checkbox should be select")
    public void all_the_checkbox_should_be_select() {
        new Actions(Driver.getDriver()).pause(5000).perform();
        homePage.chekBoxClick.isSelected();
        homePage.checkBoxIsSelect.isSelected();
    }

    @Then("all the checkbox should be deselect")
    public void all_the_checkbox_should_be_deselect() {

        Assert.assertFalse(homePage.chekBoxClick.isSelected());
        Assert.assertFalse(homePage.checkBoxIsSelect.isSelected());
    }

    @Then("go back to the CRM page")
    public void go_back_to_the_CRM_page() {

        new Actions(Driver.getDriver()).pause(2000).perform();
        wait.until(ExpectedConditions.visibilityOf(homePage.creatAfterSaveClick));
        homePage.creatAfterSaveClick.click();
    }

    @Then("click deleteTest")
    public void click_deleteTest() {
        wait.until(ExpectedConditions.visibilityOf(homePage.deleteText));
        homePage.deleteText.click();
    }

    @Then("click action")
    public void click_action() {
        new Actions(Driver.getDriver()).pause(2000).perform();
        homePage.action.click();
        homePage.actionDelete.click();




    }

    @Then("click delete and click ok")
    public void click_delete_and_click_ok() {
        homePage.deleteOk.click();
        new Actions(Driver.getDriver()).pause(2000).perform();


    }

    @Then("deleteTest should be delete")
    public void deletetest_should_be_delete() {
        String deletTextStr = homePage.deleteText.getText();
        new Actions(Driver.getDriver()).pause(2000).perform();

        Assert.assertFalse(deletTextStr.equals("deleteTest"));

    }







}



