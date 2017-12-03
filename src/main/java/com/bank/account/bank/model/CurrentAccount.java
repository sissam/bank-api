package com.bank.account.bank.model;

import com.bank.account.bank.dto.Amount;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "CURRENT_ACCOUNT")
public class CurrentAccount {

    @Id
    private Long id;

    @Setter
    private Double balance ;

    //FIXME : Restrict possible values of currencies
    private String Currency;

    @ManyToOne
    private Client owner ;

    @OneToMany
    private List<Operation> operationList ;

}
