package com.sist.exam07;

public class BankAccount {
	private double balance; //�ܾ�
	
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
	
	//---------------------�޼ҵ�
	
	public void deposit(double money) { //�Ա�
		System.out.println(money+"�� �Ա��߽��ϴ�.");
		balance = balance + money;
		
	}
	public void withdraw(double money) { //���
		try {
		if(balance < money) {
			throw new NegativeBalanceException("����ݾ��� �ܾ׺��� Ů�ϴ�.");
			}
		System.out.println(money+"�� ����߽��ϴ�.");
		balance = balance - money;
		}catch(NegativeBalanceException e) {
		System.out.println("���ܹ߻�:"+e.getMessage());
	}
	}
}

