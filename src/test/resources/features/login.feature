
Feature: login functionality

    Background: : login to the homePage
    Given  user on the login page
    When user logs in using "EventsCRM_Manager3@info.com" and "Ugh45wQ14"
    Then homepage should be displayed


  Scenario: CRM click
#    Given user on the login page
    And user click the CRM button
    Then CRM page should be displayed






#  Scenario: User login
#    Given user on the login page
#    When user logs in using "EventsCRM_User@info.com" and "opJu56KKL41"
#    Then homepage should be displayed
