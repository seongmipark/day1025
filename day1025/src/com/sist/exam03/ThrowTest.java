package com.sist.exam03;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4/0;
		//���� ��Ȳ�� �Ǹ� �ڵ����� ���� ��ü�� ����
		
		//������ ���� �Ͽ� ������ ���ܹ߻�
		throw new ArithmeticException();

	}
}
