package com.bank.account.bank.dto;

import com.bank.account.bank.rest.RequestAccount;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class RequestDto {

    private Long accountId;
    @Setter
    private Double amount ;
    private String currency ;
    private String type;

    public static RequestDto buildFromAPIRequest(RequestAccount request){
        return RequestDto.builder().type(request.getType()).amount(request.getAmout()).currency(request.getCurrency()).accountId(request.getAccountId()).build();
    }

}
