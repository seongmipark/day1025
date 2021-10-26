package com.sist.exam09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest02 {

	public static void main(String[] args) {
		
		try {
		int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		number1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		number2 = sc.nextInt();
		

		result = quotient(number1,number2);
		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("�������� �Է��ϼ���.");
			
		}catch(DivideByZeroException e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
		
	}
	
	public static int quotient(int numerator, int denominator) throws DivideByZeroException{
		if(denominator == 0)
			throw new DivideByZeroException("0���� ���� �� �����ϴ�.");
		return numerator / denominator;
	}

}


