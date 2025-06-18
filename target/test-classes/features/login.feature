Feature: LogIn User via API

  Scenario Outline: Successful user login
    Given I send a POST request with Payload "<email>" "<password>"
    When user calls "logInUser" with "POST" http request
    Then the API response status should be 200
    And the API response should contain the token

			Examples: 
      | email    					 | pass    	   | 
      | eve.holt@reqres.in | cityslicka  | 
