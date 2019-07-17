package com.bank.InternetBanking.entity;
 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Component
@Entity
@Table(name= "user")
 
public class User {
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long accountId;
    private String username;
    private String name;
    private String password;
    public long getAccountId() {
		return accountId;
	}



	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	private int phone;
    private String email;
    private String gender;
    private String DOB;
 
    public User() { }



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
 
   
}