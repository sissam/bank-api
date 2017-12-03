package com.bank.account.bank.dao;

import com.bank.account.bank.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long>{
}
