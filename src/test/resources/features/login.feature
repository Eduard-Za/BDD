Feature: Login

  Background:
    Given I am on the Login page

  Scenario Outline: login with correct and incorrect data

    When I fill in <credentials> in the login fields
    Then I verify that the text <message> is displayed

    Examples:
      | credentials       | message                  |
      | valid.credentials | successful.login.message |
      | invalid.username  | invalid.username.message |
      | invalid.password  | invalid.password.message |
