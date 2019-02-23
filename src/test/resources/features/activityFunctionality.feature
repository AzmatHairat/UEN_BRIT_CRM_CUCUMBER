@wip
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

  Scenario: create button test
    Then User click the Activity types button
    And user click Create button
    And click on Name column
    And click the save button

  Scenario: modifying the Activity types
    Then User click the Activity types button
    And click the saved Activity name
    And click edit button
    And  click on Name column
    Then type "Test00100"
    And click the save button


  Scenario: recommendedNextActivities test
    Then User click the Activity types button
    And click the saved Activity name
    And click edit button
    And click the recommendedNextActivities button
    Then select one option in recommendedNextActivities column
    And click the save button


  Scenario: recommendedNextActivities add more option test
    Then User click the Activity types button
    And click the saved Activity name
    And click edit button
    And click the recommendedNextActivities button
    Then select one option in recommendedNextActivities column
    And click the recommendedNextActivities button
    And click the save button


  Scenario: edit days
    Then User click the Activity types button
    Then User click the saved secondActivity name
    And click edit button
    Then Click the Days column to modify Days
    And type "1" for day
    And click the save button


  Scenario: checkbox select test
    Then User click the Activity types button
    And  user click the first checkbox form top
    Then all the checkbox should be select


  Scenario: deselect checkbox test
    Then User click the Activity types button
    And  user click the first checkbox form top
    And  user click the first checkbox form top
    Then all the checkbox should be deselect

  Scenario: DeleteAction Test
    Then User click the Activity types button
    And user click Create button
    Then type "deleteTest"
    And  click the save button
    Then go back to the CRM page
    And click deleteTest
    Then click action
    And click delete and click ok
    Then go back to the CRM page
    Then deleteTest should be delete



