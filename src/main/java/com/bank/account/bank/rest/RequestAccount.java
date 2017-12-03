package com.bank.account.bank.rest;

import com.bank.account.bank.dto.Amount;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RequestAccount {
    private String type;
    private Long accountId;
    private LocalDateTime dateOperation;
    private Double amout ;
    private String currency;

}
