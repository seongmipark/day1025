package com.sist.exam03;

//���α׷� ����ÿ� �ΰ��� ������ ���޹޾� �������� ����� ����ϴ� ���α׷� �ۼ�
public class DivTestException02 {

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div = a/b;
		System.out.println("���:"+div);

		}
		catch(ArithmeticException e) { // ������ ���� ���ܰ�ü���� ����
			System.out.println("�и� 0�� �� �� �����.");
		}
		catch(Exception e) { 
			System.out.println("������ �� ���� �ΰ��� �����ؾ� �մϴ�.");
		}finally {//���ܰ� �߻��ϵ� ���ϵ� ������ ����
			System.out.println("�۾� �Ϸ�");			
		}
	}
}
