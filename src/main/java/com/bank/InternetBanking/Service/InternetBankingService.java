package com.bank.InternetBanking.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.InternetBanking.Entity.Account;
import com.bank.InternetBanking.Entity.Transaction;
import com.bank.InternetBanking.Entity.User;
import com.bank.InternetBanking.Repository.AccountBankingRepository;
import com.bank.InternetBanking.Repository.InternetBankingRepository;
import com.bank.InternetBanking.Repository.TransactionRepository;

@Service
public class InternetBankingService { 
    @Autowired
    InternetBankingRepository internetBankingRepository;
    @Autowired
    AccountBankingRepository accountBankingRepository;
    @Autowired
    TransactionRepository transactionRepository;

    
	public User verifyUser(String username, String password) {
		return internetBankingRepository.findByUsernameAndPassword(username,password);
	}


	public void createUser(User user) {
		// TODO Auto-generated method stub
		internetBankingRepository.save(user);
		Account account =new Account();
		account.setAccountId(user.getAccountId());
		account.setName(user.getName());
		account.setAmount(10000);
		accountBankingRepository.save(account);
	}

	public List<Account> getPayeeById(long id) {
		 return accountBankingRepository.findOtherId(id);
		
	}

	public void getTransc(Transaction transaction) {
		// TODO Auto-generated method stub
		
		Account fromAccnt = accountBankingRepository.findByAccountId(transaction.getFromaccId());
		Account toAccntOp = accountBankingRepository.findByAccountId(transaction.getToaccId());
		long minBal = fromAccnt.getAmount() - transaction.getAmount();
		long addBal = toAccntOp.getAmount() + transaction.getAmount();
		fromAccnt.setAmount(minBal);
		toAccntOp.setAmount(addBal);
		transactionRepository.save(transaction);
	}

}
