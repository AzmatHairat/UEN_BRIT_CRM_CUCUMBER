Feature: login functionality

  Background: : login to the homePage
    Given  user on the login page
    When user logs in using "EventsCRM_Manager3@info.com" and "Ugh45wQ14"
    Then homepage should be displayed
    And user click the CRM button



  Scenario: CRM click

    Then CRM page should be displayed

  Scenario: user able to see all the category and make changes in Activity types
    Then User click the Activity types button
    Then Activity types should be displayed
@wip
  Scenario: create button test
    Then User click the Activity types button
    And user click Create button
    And click on Name column
    And click the save button
