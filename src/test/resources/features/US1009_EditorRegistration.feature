
Feature: US1009 Registration to editor database page with Scenario Outline

  Scenario Outline:
    When user navigates to editor.datatables.net
    Then clicks the new button
    And enters "<firstname>" as firstname
    And enters "<lastname>" as lastname
    And enters "<position>" as Position
    And enters "<office>" as Office
    And enters "<extension>" as Extension
    And enters "<startDate>" as Start date
    And waits for 1 second
    And enters "<salary>" as Salary
    And clicks the Create button
    And waits for 1 second
    When user searches for "<firstname>"
    Then verifies that the name section contains "<firstname>"

    Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |erdi     |cakmak  |qa      |Istanbul|test   |2020-01-01|200  |