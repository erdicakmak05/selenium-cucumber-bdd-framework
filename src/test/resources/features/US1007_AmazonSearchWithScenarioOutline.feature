Feature: US1007 Amazon search with Scenario Outline

  Scenario Outline: TC12 all elements in a list will be searched on amazon

    Given user navigates to "AmazonUrl" page
    And searches for "<searchItem>"
    Then verifies that results contain "<searchItem>"


    Examples:
    |searchItem|
    |Kazma|
    |Kurek|
    |Kus  |