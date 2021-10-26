package com.sist.exam09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroTest {

	public static void main(String[] args) {
		
		try {
		int number1, number2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		number1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		number2 = sc.nextInt();
		
		result = number1 / number2;
		System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println("정수값만 입력하세요.");
			System.out.println(e.getMessage());  // null
			e.printStackTrace();
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());  // by zero
			e.printStackTrace();
			
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
		

		//20,5 입력 : 4 출력
		//20, abc 입력 : InputMismatchException예외발생 ,정수값에 문자열이들어가서
		//20,0 입력 : ArithmeticException예외 발생 , 0으로 나눌수없다
	}

}
