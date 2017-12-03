package com.bank.account.bank.dao;

import com.bank.account.bank.model.CurrentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<CurrentAccount, Long> {
    //Update amount when id = id
}
