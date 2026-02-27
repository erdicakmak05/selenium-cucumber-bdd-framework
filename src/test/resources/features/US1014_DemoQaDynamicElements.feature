Feature: US1014 Dynamic Elements
  @Dinamik
  Scenario: TC19 Dynamic elements should be clickable

    Given user navigates to "DemoQaUrl" page
    Then wait for the "Will enable 5 seconds" button to become enabled
    And verify that the "Will enable 5 seconds" button is enabled
