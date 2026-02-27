Feature: US1010 Add button test on Herokuapp page

  Scenario: TC15 elements appearing later should work

    Given user navigates to "HerokuappAddElementUrl" page
    When user clicks on Add Element button
    And waits until the Delete button becomes visible
    And verifies that the Delete button is visible
    And clicks the Delete button to remove it




