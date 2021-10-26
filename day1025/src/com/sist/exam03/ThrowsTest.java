package com.sist.exam03;

public class ThrowsTest {
	
	//메소드를 호출하는쪽에서 예외처리
	public static void div(int a, int b) throws ArithmeticException{
		int r = a/b;
		System.out.println("나누기 결과:" + r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		div(4,2);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
