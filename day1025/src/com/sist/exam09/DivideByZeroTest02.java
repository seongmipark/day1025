package com.sist.exam09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest02 {

	public static void main(String[] args) {
		
		try {
		int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		number1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		number2 = sc.nextInt();
		

		result = quotient(number1,number2);
		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("정수값만 입력하세요.");
			
		}catch(DivideByZeroException e) {
			System.out.println("예외발생: "+e.getMessage());
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
	
	public static int quotient(int numerator, int denominator) throws DivideByZeroException{
		if(denominator == 0)
			throw new DivideByZeroException("0으로 나눌 수 없습니다.");
		return numerator / denominator;
	}

}


