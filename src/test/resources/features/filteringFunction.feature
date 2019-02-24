@BRIT-4299
Feature:
 	As a manager, I should be able to filter my opportunities by using the “Group By” drop down option.*

  Background: : login to the homePage
    Given  user on the login page
    When user logs in using "EventsCRM_Manager3@info.com" and "Ugh45wQ14"
    Then homepage should be displayed
    And user click the CRM button



	      Scenario:  Manger should be able to create new opportunity from calander
		      When user click calender button
		      Then system should display a calender
		      And user enter "<java>" in a day
		      Then system should add one opportunity in the homepage

		  Scenario Outline:
		    When user click calender button
		    Then system should display a calender
		    And user enter "<opportunity name>" in a day
		    Then system should add one opportunity in the homepage
		    
		    Examples:
		    | <opportunity name> |
		    | Uno                |
		    | dos                |
		    |teres               |
		    |quatro              |
		    |sinco               |
		    
		    

		  Scenario: Manager should be able to click groupBy button
		    When user click Magnifier icon
		    Then system should display filtering options

		  Scenario:Manager should be able to see the table
		    When user click link table
		    Then system should display a table in the home page


		  Scenario:Manager should be able to see the documentation page
		    When user click documentation option
		    Then system should navigate documentation page

		  Scenario: Manager should be able to see graph on the homepage
		    When user click graph button
		    Then system should display a graph

		  Scenario:Manager should be able to click pivot
		    When user click pivot
		    Then system should display pivot table

		  Scenario:Manager should be able to see lead tag
		    When user click Leads Opportunities button
		    Then system should display lead tag

		  Scenario:Manager should be able to receive new massage
		    When user click conversation icon
		    Then system should display s new small window
		    Then user should be able to click window close button
		