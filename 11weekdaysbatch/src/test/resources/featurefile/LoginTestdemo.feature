Feature: firstdemo login feature

  Background: user is on the loginpage
    Given user is on the loginpage
    When user enter the valid username and valid password
    And click on login button
    Then user should be successfully logged in to the application

  @login
  Scenario: To validate the login Action
       And wait for logout
     
  @logout
  Scenario: To validate the logout
    When user click on profile
    And click on logout
    Then user should be successfully logged out
