Feature: hovers

  Background:
    Given I am on the Hovers page

  Scenario Outline: Hover avatars
    When I hover <num> avatar
    Then I check that <username> is displayed

    Examples:

      | num | username |
      | 1   | user1    |
      | 2   | user2    |
      | 3   | user3    |
