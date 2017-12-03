package com.bank.account.bank.rest;

import com.bank.account.bank.dto.RequestDto;
import com.bank.account.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import static com.bank.account.bank.config.EndPoints.DEPOSIT;
import static com.bank.account.bank.config.EndPoints.WITHDRAW;


@RestController
public class AccountController {

    @Autowired
    AccountService depositService;

    @RequestMapping(DEPOSIT)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void deposit(@RequestParam RequestAccount request){
        //call deposit service
        depositService.makeDeposit(RequestDto.buildRequestDto(request));
    }

    @RequestMapping(WITHDRAW)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void withdraw(){

    }


}
