@RegressionTest
Feature: user should be able to login to the system
  #test scenario 1 : valid credentials
  Scenario: user login with valid username and password
  When user open browser
  And user navigates to login page

  When user enter valid username and password
  And user click on login button
    #expected result
  Then user could login successfully
  And  user go to home page


 # test scenario 2 : Invalid credentials
  Scenario: user login with invalid email and password
    Given user open browser
    And user navigates to login page
    When user enter invalid email and password
    And user click on login button
    #expected result
    Then user couldn't login successfully
