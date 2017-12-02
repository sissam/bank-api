package com.bank.account.bank.acceptance;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class DepositStepsDef implements En {

    public DepositStepsDef() {
        Given("^: account balance is (\\d+)$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^deposit (\\d+)$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^balance is (\\d+)$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
