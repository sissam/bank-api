package com.bank.account.bank.config;

public enum EndPointEnum {
    DEPOSIT("/deposit");
    private String url;

    EndPointEnum(String url){this.url = url;
    }
}
