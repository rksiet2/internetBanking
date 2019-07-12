package com.bank.InternetBanking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.InternetBanking.Entity.Account;
import com.bank.InternetBanking.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	
	@Query(value="FROM Account a where a.accountId NOT IN (:id)")
	List<Account> findOtherId(@Param("id") long id);
	
}