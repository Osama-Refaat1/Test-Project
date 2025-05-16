Feature: user should be able to login to the system
  Background: user go to login page
  Given user goes to login page

    #Scenario 1 : Valid reset
  Scenario: user could reset password successfully
    When user click on forgetPassword
    Then user navigate to forget Page and enter his email
    And user click on Recovery Button
    And password will be reset


    #Scenario 1 : Invalid reset
  Scenario: user couldn't reset password successfully
    When user click on forgetPassword
    Then user navigate to forget Page and enter his email
    And user click on Recovery Button
    And password will not be reset