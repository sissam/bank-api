package com.bank.account.bank.rest;

import com.bank.account.bank.dto.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonSerialize(using = JacksonRequestAccountSerializer.class)
//@JsonDeserialize(using = JacksonRequestAccountDeserializer.class)
public class RequestAccount {
    private String type;
    @JsonProperty("account_id")
    private Long accountId;
    @JsonProperty("date_operation")
    private String dateOperation;
    private Double amout ;
    private String currency;

}
