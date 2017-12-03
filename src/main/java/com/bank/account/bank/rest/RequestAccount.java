package com.bank.account.bank.rest;

import com.bank.account.bank.dto.Amount;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RequestAccount {
    private String type;
    private String accountId;
    private LocalDateTime dateOperation;
    private Amount amout ;

}
