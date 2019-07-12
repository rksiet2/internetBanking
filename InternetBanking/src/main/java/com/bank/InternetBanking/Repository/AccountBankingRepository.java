package com.bank.InternetBanking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.InternetBanking.Entity.Account;

@Repository
public interface AccountBankingRepository extends JpaRepository<Account, Integer> {

	
	@Query(value="FROM Account a where a.accountId NOT IN (:id)")
	List<Account> findOtherId(@Param("id") long id);

	Account findByAccountId(long fromaccId);
	
}