package com.sist.exam07;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount();
		
		bank.setBalance(10000);
		System.out.println("�����ܾ�: " + bank.getBalance());
		

		bank.deposit(2000);
		System.out.println("�����ܾ�: " + bank.getBalance());
		
		bank.withdraw(5000);
		System.out.println("�����ܾ�: " + bank.getBalance());
		
		bank.withdraw(13000);
		
	}
}

