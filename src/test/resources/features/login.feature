
Feature: login functionality
  @login
  Scenario: Manager login
    Given user on the login page

    When user logs in using "EventsCRM_Manager3@info.com" and "Ugh45wQ14"
    Then homepage should be displayed



  Scenario: User login
    Given user on the login page
    When user logs in using "EventsCRM_User@info.com" and "opJu56KKL41"
    Then homepage should be displayed
