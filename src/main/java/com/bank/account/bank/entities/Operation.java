package com.bank.account.bank.entities;

import com.bank.account.bank.dto.Amount;

import javax.persistence.Entity;

@Entity
public class Operation {

    private String id ;

    private Amount amount ;
}
