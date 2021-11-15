package com.upgrade.infinitispace.virtualwallet.repository;

import com.upgrade.infinitispace.virtualwallet.models.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {

//    @Query("SELECT a FROM Account  a WHERE a.accountNumber=:accountNumber")
    List<Account> findAccountByAccountNumber(Integer accountNumber);
}
