Feature: make deposit in current account

  Background:
    Given : account balance is 0

  Scenario: make a deposit in current account
    When deposit 100
    Then balance is 100

