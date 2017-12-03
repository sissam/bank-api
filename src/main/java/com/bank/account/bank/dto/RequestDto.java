package com.bank.account.bank.dto;

import com.bank.account.bank.rest.RequestAccount;
import lombok.Getter;

@Getter
public class RequestDto {

    private Long id ;
    private Amount amount ;

    public static RequestDto buildRequestDto(RequestAccount requestAccount){
        //TODO map here
        return new RequestDto();
    }
}
