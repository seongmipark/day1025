package com.sist.exam03;

public class ThrowsTest {
	
	//�޼ҵ带 ȣ���ϴ��ʿ��� ����ó��
	public static void div(int a, int b) throws ArithmeticException{
		int r = a/b;
		System.out.println("������ ���:" + r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		div(4,2);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
