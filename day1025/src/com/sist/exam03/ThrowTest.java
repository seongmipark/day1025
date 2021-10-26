package com.sist.exam03;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4/0;
		//예외 상황이 되면 자동으로 예외 객체가 생성
		
		//다음과 같이 하여 강제로 예외발생
		throw new ArithmeticException();

	}
}
