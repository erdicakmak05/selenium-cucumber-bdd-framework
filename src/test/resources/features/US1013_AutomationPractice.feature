Feature: US1013 Invalid email test
  @Automation
  Scenario: TC18 Cannot login with invalid email

     Given user navigates to "AutomationPracticeUrl" page
     And user clicks on the sign in link
     And enters an email address without @ symbol and clicks enter
     Then verify that the error message is "Invalid email address"



