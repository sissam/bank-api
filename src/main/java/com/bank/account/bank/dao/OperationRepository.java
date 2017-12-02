package com.bank.account.bank.dao;

import com.bank.account.bank.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long>{
}
