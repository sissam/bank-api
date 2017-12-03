package com.bank.account.bank.service;

import com.bank.account.bank.dto.RequestDto;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

public interface AccountService {
    void makeOperation(@NotNull RequestDto requestDto);
}
