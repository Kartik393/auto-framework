Feature: Create User via API

  Scenario: Successful user creation
    Given I send a POST request with Payload "<name>" "<job>"
    When user calls "createUser" with "POST" http request
    Then the API response status should be 201
    And the API response should contain the user id
