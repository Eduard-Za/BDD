Feature: table

  Background:
    Given I am on the Tables page

  Scenario: Last name ordering

    When I order by Last Name
    Then table is sorted by last name in ascending order

    When I order by Last Name
    Then table is sorted by last name in descending order