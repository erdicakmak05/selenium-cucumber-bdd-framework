Feature: US1005 Positive login test
  @hotel
  Scenario: TC08 Positive Login

    Given user navigates to "HMCUrl" page
    And user clicks on login link
    Then user enters "HMCValidUserName" as username
    And enters "HMCValidPassword" as password
    And clicks the login button
    Then verifies that login is successful
    And closes the page
