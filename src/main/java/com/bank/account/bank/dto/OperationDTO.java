package com.bank.account.bank.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class OperationDTO {
    private Long id ;
    private String type ;
    private Double amount ;
    private String currency;
    private String date;
}
