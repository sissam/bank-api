package com.bank.account.bank.rest;

import com.bank.account.bank.dto.RequestDto;
import com.bank.account.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import static com.bank.account.bank.config.EndPoints.DEPOSIT;
import static com.bank.account.bank.config.EndPoints.WITHDRAW;


@RestController
@RequestMapping("api/bank")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(DEPOSIT)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void deposit(@RequestBody @Valid RequestAccount request){
        accountService.makeOperation(RequestDto.buildFromAPIRequest(request));
    }

    @RequestMapping(WITHDRAW)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void withdraw(@RequestParam RequestAccount request){
        accountService.makeOperation(RequestDto.buildFromAPIRequest(request));
    }


}
