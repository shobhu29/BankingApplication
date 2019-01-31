package com.capgemini.beans;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(){
		
		
	}
	
	public InsufficientBalanceException(String msg){
		
		super(msg);
		
	}


}
