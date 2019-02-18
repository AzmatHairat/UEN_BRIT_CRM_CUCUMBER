
Feature: login functionality
  @login
  Scenario: Manager login
    Given user on the login page

    When user logs in using "myemail@hotmail.com" and "mysecurepassword"
    Then homepage should be displayed
    And title should be "homepage"


  Scenario: User login
    Given user on the login page
    When user logs in using "myemail@gmail.com" and "regularpassword"
    Then homepage should be displayed
    And title should be "homepage"