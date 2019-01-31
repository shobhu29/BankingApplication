package com.capgemini.beans;

public class Account {
	
	private int account_num;
	private int amount;
	public Account(int account_num, int amount) {
		super();
		this.account_num = account_num;
		this.amount = amount;
	}
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [account_num=" + account_num + ", amount=" + amount + "]";
	}

	
}
