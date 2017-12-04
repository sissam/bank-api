package com.bank.account.bank.model;

import com.bank.account.bank.dto.OperationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "OPERATION")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue
    private Long id ;

    private String type ;

    private Double amount ;

    private String Currency ;

    private LocalDateTime localDateTime;

    @ManyToOne
    private CurrentAccount currentAccount ;

    public static OperationDTO buildOperationDTO(Operation operation){
        //FIXME : use mapper instead
        return OperationDTO.builder().id(operation.getId()).type(operation.getType()).date(operation.getLocalDateTime().toString()).amount(operation.getAmount()).currency(operation.getCurrency()).build();
    }
}
