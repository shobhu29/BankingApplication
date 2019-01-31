package com.capgemini.bl;
import java.util.LinkedList;

import com.capgemini.beans.*;

public class CitiBank {
	
	LinkedList<Account> acnts = new LinkedList<>();
	
	
	public String create_account(int account_num,int amount) throws InsufficientOpeningBalanceException{
		
		if(amount >= 500){		
			Account acnt = new Account(account_num,amount);
			acnts.add(acnt);
			return "Account Created Successfully";
		}
		throw new InsufficientOpeningBalanceException("Insufficient Opening Balance");
	}
	
	
	public Account search_account(int account_num) throws InvalidAccountNumberException {
		
		for(Account acnt : acnts){
			
			if(acnt.getAccount_num()==account_num){
				return acnt;
		}
		
	}
		throw new InvalidAccountNumberException("Invalid Account Number");
}
	
	public int withdraw_amount(int account_num,int amount) throws InvalidAccountNumberException,InsufficientBalanceException{
		
		Account acnt = search_account(account_num);
		if(acnt.getAmount() - amount >= 0){
			
			acnt.setAmount(acnt.getAmount() - amount);
			return acnt.getAmount();
		}
		
		throw new InsufficientBalanceException("Insufficient Balance Exception");
	}
	
	public int deposit_amount(int account_num,int amount) throws InvalidAccountNumberException{
		
		Account acnt = search_account(account_num);	
		acnt.setAmount(acnt.getAmount() + amount);
		return acnt.getAmount();
		
	}
	
	public String fund_transfer(int account_num1,int account_num2,int amount) throws InvalidAccountNumberException,InsufficientBalanceException {
		
		Account acnt = search_account(account_num1);
		Account acnt1 = search_account(account_num2);
		if((acnt.getAmount() - amount ) >= 0){
			acnt1.setAmount(acnt1.getAmount() + amount);
			acnt.setAmount(acnt.getAmount() - amount);
			
			return  " Account 1 " + acnt.getAmount()  + " to Account 2 "   +acnt1.getAmount()  ;
		}
		
		throw new InvalidAccountNumberException("Invalid Account Number");
		
	} 

}


	

