package com.sist.exam09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		
		try {
		int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		number1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		number2 = sc.nextInt();
		
		result = number1 / number2;
		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("�������� �Է��ϼ���.");
			System.out.println(e.getMessage());  // null
			e.printStackTrace();
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());  // by zero
			e.printStackTrace();
			
		}finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
		

		//20,5 �Է� : 4 ���
		//20, abc �Է� : InputMismatchException���ܹ߻� ,�������� ���ڿ��̵���
		//20,0 �Է� : ArithmeticException���� �߻� , 0���� ����������
	}

}
