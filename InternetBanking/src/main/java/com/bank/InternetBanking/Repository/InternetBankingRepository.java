package com.bank.InternetBanking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.InternetBanking.Entity.User;

@Repository
public interface InternetBankingRepository extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String username,String password);

}