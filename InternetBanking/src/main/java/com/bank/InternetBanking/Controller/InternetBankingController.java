package com.bank.InternetBanking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.InternetBanking.Entity.Account;
import com.bank.InternetBanking.Entity.Transaction;
import com.bank.InternetBanking.Entity.User;
import com.bank.InternetBanking.Service.InternetBankingService;
 


@RestController
public class InternetBankingController {
 
    @Autowired
    InternetBankingService IBservice;
 
    @RequestMapping(value= "/login", method= RequestMethod.POST)
    public String login(@RequestParam String username,@RequestParam String password) {
        System.out.println("username"+username);
        User user= (User) IBservice.verifyUser(username,password);
        if(user != null)
        return "Success";
        else
        return "failure";
    }
    
    @RequestMapping(value= "/create", method= RequestMethod.POST)
    public void createUser(@RequestBody User user) {
       IBservice.createUser(user);
    }
    
    @RequestMapping(value= "payee/{id}", method= RequestMethod.GET)
    public List<Account> getPayeeById(@PathVariable long id) throws Exception {
        List<Account> payee =  IBservice.getPayeeById(id);
        return payee;
    }
    @RequestMapping(value= "/trans", method= RequestMethod.POST)
    public void getTransc(@RequestBody Transaction transaction) {
    	IBservice.getTransc(transaction);
    }
    
    
    
    
    
}