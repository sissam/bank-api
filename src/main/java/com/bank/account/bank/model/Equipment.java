package com.bank.account.bank.model;

import com.bank.account.bank.dto.Amount;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public abstract class Equipment {
    @Id
    private Long id;

    private Client owner ;

    @Setter
    private Amount balance ;

    @OneToMany
    private List<Operation> operationList ;

}
