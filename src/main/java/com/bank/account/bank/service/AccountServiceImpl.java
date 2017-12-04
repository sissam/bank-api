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
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    OperationRepository operationRepository;

    /**
     * FIXME : split this method in two, one method per type
     * @param requestDto
     */
    public CurrentAccount makeOperation(@NotNull RequestDto requestDto) {

        if("WITHDRAW".equalsIgnoreCase(requestDto.getType())){
            requestDto.setAmount(0 - requestDto.getAmount());
        }

        Optional<CurrentAccount> currentAccount = Optional.of(accountRepository.findOne(requestDto.getAccountId()));
        if(currentAccount.isPresent()){
            Double balance = currentAccount.get().getBalance() ;
            currentAccount.get().setBalance(balance + requestDto.getAmount());
            accountRepository.save(currentAccount.get());
        }
        //TODO : save operation, type deposit, date, amount, id account
        operationRepository.save(Operation.builder().
                amount(requestDto.getAmount()).Currency(requestDto.getCurrency())
                .currentAccount(currentAccount.get()).localDateTime(LocalDateTime.now())
                .type(requestDto.getType())
                .build());
        return currentAccount.get();
    }
}
