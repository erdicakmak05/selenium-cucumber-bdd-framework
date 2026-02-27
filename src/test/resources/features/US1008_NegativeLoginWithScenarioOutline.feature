@SO
Feature: US1008 Negative login test with different values using Scenario Outline

  Scenario Outline: TC13 different username and password

    Given user navigates to "HMCUrl" page
    And user clicks on login link
    Then enters username as "<username>" from scenario outline
    And enters password as "<password>" from scenario outline
    And clicks the login button
    Then verifies that login has failed



    Examples:
    |username|password|
    |MANAGER |MANAGER1|
    |manager |manager1|
    |MAnager |MANager1|
    |MAN ager|Man ager1|
