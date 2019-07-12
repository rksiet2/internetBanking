package com.bank.InternetBanking.Entity;
 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Component
@Entity
@Table(name= "account")
 
public class Account {
 
    @Id
    private long accountId;
    private String name;
    private long amount;
	
    public Account() { }

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

   
}