
Feature: US1001_amazon_search
@toplu @paralel1
Scenario: TC01_AmazonSearch Test

  Given user navigates to amazon page
  And searches for iPhone
  Then verifies that results contain iPhone

  Given user navigates to amazon page
  And searches for tea pot
  Then verifies that results contain tea pot

  Given user navigates to amazon page
  And searches for flower
  Then verifies that results contain flower

