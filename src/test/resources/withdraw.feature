Feature: make withdraw from current account

  Background:
    Given : account balance is 100

  Scenario: make a withdraw from current account
    When withdraw 100
    Then balance is 0

