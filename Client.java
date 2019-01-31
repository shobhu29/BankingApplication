package com.capgemini.view;
import com.capgemini.bl.*;
import com.capgemini.beans.*;

public class Client {

	public static void main(String[] args) throws InsufficientBalanceException,InsufficientOpeningBalanceException,InvalidAccountNumberException {

		CitiBank citi = new CitiBank();
		
		try{
			
			System.out.println(citi.create_account(101, 4000));
			System.out.println(citi.create_account(102, 1500));
			System.out.println(citi.create_account(103, 2500));
			System.out.println(citi.search_account(101));
			System.out.println(citi.withdraw_amount(101,1000));
			System.out.println(citi.deposit_amount(102,1000));
			System.out.println(citi.fund_transfer(101, 102, 700));

			}
		
		catch(InsufficientOpeningBalanceException ob){
			
			System.out.println(ob.getMessage());
		}
		
		catch(InvalidAccountNumberException an){
				
			System.out.println(an.getMessage());
		}
		
		catch(InsufficientBalanceException be){
			
			System.out.println(be.getMessage());
		}
	}
}
