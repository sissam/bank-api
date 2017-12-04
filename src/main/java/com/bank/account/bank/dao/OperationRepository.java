package com.bank.account.bank.dao;

import com.bank.account.bank.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation, Long>{

    List<Operation> findOperationsByCurrentAccountId(Long id);

}
