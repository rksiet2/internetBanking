package com.bank.InternetBanking.entity;
 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Component
@Entity
@Table(name= "transaction")
 
public class Transaction {
	
	@Id
    public long getFromaccId() {
		return fromaccId;
	}

	public void setFromaccId(long fromaccId) {
		this.fromaccId = fromaccId;
	}

    private long fromaccId;
    private long toaccId;
    private String type;
    private long amount;
	
    public Transaction() { }

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getToaccId() {
		return toaccId;
	}

	public void setToaccId(long toaccId) {
		this.toaccId = toaccId;
	}

   
}