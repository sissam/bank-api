package com.bank.account.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    private Long id ;

    private String firstName ;

    private String lastName ;

    @OneToMany
    private List<CurrentAccount> myAccounts;


}
