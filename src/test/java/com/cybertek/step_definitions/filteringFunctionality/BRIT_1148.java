package com.cybertek.step_definitions.filteringFunctionality;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.SearchPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BRIT_1148 {

/*
@Then(“User click the Activity types button”)
   public void user_click_the_Activity_types_button() {
       Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       new Actions(Driver.getDriver()).pause(2000).perform();
       wait.until(ExpectedConditions.visibilityOf(homePage.ActivityTypesButton));
       homePage.ActivityTypesButton.click();
       new Actions(Driver.getDriver()).pause(2000).perform();

   }
 */
        SearchPage searchPage = new SearchPage();
        HomePage homePage = new HomePage();


    @When("user click calender button")
    public void user_click_calender_button() {
       searchPage.CalendarButton.click();

    }

    @Then("system should display a calender")
    public void system_should_display_a_calender() throws InterruptedException {
        Thread.sleep(3);
        Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]")).click();

    }

    @And("user enter {string} in a day")
    public void user_enter_in_a_day(String string) {
        Driver.getDriver().findElement(By.name("name")).sendKeys(string);

    }

    @Then("system should add one opportunity in the homepage")
    public void system_should_add_one_opportunity_in_the_homepage() {
        Driver.getDriver().findElement(By.xpath("//div[@class='modal-footer']//button[1]")).click();

    }

     //filtering
    @When("user click Magnifier icon")
    public void user_click_Magnifier_icon() {
        searchPage.MagniffierIcone.click();


    }

    @Then("system should display filtering options")
    public void system_should_display_filtering_options() {
        BrowserUtils.verifyElementDisplayed(searchPage.GroupByButton);
    }

    //table
    @When("user click link table")
    public void user_click_link_table() {
        searchPage.ListButton.click();
    }

    @Then("system should display a table in the home page")
    public void system_should_display_a_table_in_the_home_page() {
        Assert.assertTrue(searchPage.tableDisplay.isDisplayed());
    }


    //ducomentation page
    @When("user click documentation option")
    public void user_click_documentation_option() throws InterruptedException {
        searchPage.Usernamedisplays.click();
        Thread.sleep(3);
       searchPage.documentation.click();

    }

    @Then("system should navigate documentation page")
    public void system_should_navigate_documentation_page() {
        Driver.getDriver().navigate().to("https://www.odoo.com/documentation/user/12.0/");
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Odoo User Documentation — Odoo 12.0 documentation"));

    }


    //
    @When("user click graph button")
    public void user_click_graph_button() {
       searchPage.Graghbtn.click();

    }

    @Then("system should display a graph")
    public void system_should_display_a_graph() {
        Assert.assertTrue(searchPage.measure.isDisplayed());
    }


    //pivot
    @When("user click pivot")
    public void user_click_pivot() {
       searchPage.pivot.click();

    }

    @Then("system should display pivot table")
    public void system_should_display_pivot_table() {
        Assert.assertTrue(searchPage.pivotTable.isDisplayed());
    }

    //lead tag
    @When("user click Leads Opportunities button")
    public void user_click_Leads_Opportunities_button() {
      homePage.LeadsOpportunities.click();

    }

    @Then("system should display lead tag")
    public void system_should_display_lead_tag() {
        BrowserUtils.verifyElementDisplayed(searchPage.LeadTag);
    }


    //new massage
    @When("user click conversation icon")
    public void user_click_conversation_icon() {
       searchPage.conversation.click();
    }

    @Then("system should display s new small window")
    public void system_should_display_s_new_small_window() {
        searchPage.newMassageBtn.click();
    }

    @Then("user should be able to click window close button")
    public void user_should_be_able_to_click_window_close_button() {
        BrowserUtils.verifyElementDisplayed(searchPage.newMassagePopUp);
        searchPage.windowCloseBtn.click();
    }






}
