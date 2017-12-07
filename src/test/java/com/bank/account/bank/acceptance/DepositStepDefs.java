package com.bank.account.bank.acceptance;

import com.bank.account.bank.model.CurrentAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositStepDefs {


    @Given("^: account balance is (\\d+)$")
    public void account_balance_is(Double arg1) throws Throwable {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setBalance(arg1);
    }

    @When("^deposit (\\d+)$")
    public void deposit(int arg1) throws Throwable {

    }

    @Then("^balance is (\\d+)$")
    public void balance_is(int arg1) throws Throwable {
    }
}
