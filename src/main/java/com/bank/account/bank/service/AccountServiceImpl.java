package com.bank.account.bank.service;

import com.bank.account.bank.dao.AccountRepository;
import com.bank.account.bank.dao.OperationRepository;
import com.bank.account.bank.dto.Amount;
import com.bank.account.bank.dto.RequestDto;
import com.bank.account.bank.model.CurrentAccount;
import com.bank.account.bank.model.Operation;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    OperationRepository operationRepository;

    public void makeDeposit(@NotNull RequestDto requestDto) {
        Optional<CurrentAccount> currentAccount = Optional.of(accountRepository.findOne(requestDto.getId()));
        if(currentAccount.isPresent()){
            Double balance = currentAccount.get().getBalance() ;
            currentAccount.get().setBalance(balance + requestDto.getAmount().getAmount());
            accountRepository.save(currentAccount.get());
        }
        //TODO : save operation, type deposit, date, amount, id account
        operationRepository.save(new Operation());
    }

    public void makeWithdraw(@NotNull RequestDto requestDto) {

    }
}
