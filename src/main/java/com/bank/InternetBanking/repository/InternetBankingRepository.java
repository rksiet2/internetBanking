package com.bank.InternetBanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.InternetBanking.entity.User;

@Repository
public interface InternetBankingRepository extends JpaRepository<User, Integer> {
	
	User findByUsernameAndPassword(String username,String password);

}