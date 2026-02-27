@parametreliTest
Feature: US1003 creating step definition with parameter
  @toplu @paralel1
  Scenario: TC05_Parameter usage

    Given user navigates to amazon page
    And searches for "iPhone"
    Then verifies that results contain "iPhone"
    And closes the page