package com.bank.account.bank.service;

import com.bank.account.bank.dto.RequestDto;
import com.bank.account.bank.model.CurrentAccount;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

public interface AccountService {
    CurrentAccount makeOperation(@NotNull RequestDto requestDto);
}
