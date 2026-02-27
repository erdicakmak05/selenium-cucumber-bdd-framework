Feature: US1006_Negative Login Test

  Scenario: TC09 cannot login with wrong username and correct password
    Given user navigates to "HMCUrl" page
    Then user clicks on login link
    And user enters "HMCWrongUsername" as username
    And enters "HMCValidPassword" as password
    Then clicks the login button
    And verifies that login has failed
    And closes the page

    Scenario: TC10 cannot login with correct username and wrong password
      Given user navigates to "HMCUrl" page
      Then user clicks on login link
      And user enters "HMCValidUsername" as username
      And enters "HMCWrongPassword" as password
      Then clicks the login button
      And  verifies that login has failed
      And closes the page

    Scenario: TC11 cannot login with wrong username and wrong password
      Given user navigates to "HMCUrl" page
      Then user clicks on login link
      And user enters "HMCWrongUsername" as username
      And enters "HMCWrongPassword" as password
      Then clicks the login button
      And verifies that login has failed
      And closes the page