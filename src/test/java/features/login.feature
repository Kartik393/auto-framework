Feature: LogIn User via API

  Scenario: Successful user login
    Given I send a POST request with Payload "<email>" "<password>"
    When user calls "loginUser" with "POST" http request
    Then the API response status should be 200
	    And the API response should contain the token