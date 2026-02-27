@paralel2
Feature: US1002 Amazon search test with Background

  Background: navigating to amazon page
    Given user navigates to amazon page

  @wip
  Scenario: TC02_Amazon Iphone Search Test

    And searches for iPhone
    Then verifies that results contain iPhone
  @wip
  Scenario: TC02_Amazon Tea Pot Search Test

    And searches for tea pot
    Then verifies that results contain tea pot

  Scenario: TC02_Amazon Flower Search Test

    And searches for flower
    Then verifies that results contain flower