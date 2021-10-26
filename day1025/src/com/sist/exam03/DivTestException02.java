package com.sist.exam03;

//프로그램 실행시에 두개의 정수를 전달받아 나누기한 결과를 출력하는 프로그램 작성
public class DivTestException02 {

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int div = a/b;
		System.out.println("결과:"+div);

		}
		catch(ArithmeticException e) { // 범위가 작은 예외객체부터 쓴다
			System.out.println("분모가 0이 될 수 없어요.");
		}
		catch(Exception e) { 
			System.out.println("나누기 할 정수 두개를 전달해야 합니다.");
		}finally {//예외가 발생하든 안하든 무조건 실행
			System.out.println("작업 완료");			
		}
	}
}
