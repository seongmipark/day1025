package com.sist.exam07;

public class BankAccount {
	private double balance; //잔액
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//---------------------메소드
	
	public void deposit(double money) { //입금
		System.out.println(money+"원 입금했습니다.");
		balance = balance + money;
		
	}
	public void withdraw(double money) { //출금
		try {
		if(balance < money) {
			throw new NegativeBalanceException("인출금액이 잔액보다 큽니다.");
			}
		System.out.println(money+"원 출금했습니다.");
		balance = balance - money;
		}catch(NegativeBalanceException e) {
		System.out.println("예외발생:"+e.getMessage());
	}
	}
}

