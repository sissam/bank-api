package com.bank.account.bank.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bank.account.bank.config.Operations.DEPOSIT;

@RestController
public class OperationEndPoint {
    @RequestMapping(DEPOSIT)
    public void generateHistory(){

    }
}
