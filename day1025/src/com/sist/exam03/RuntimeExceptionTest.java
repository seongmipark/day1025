package com.sist.exam03;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {10,20,30};
		System.out.println(a[3]);
		//배열의 인덱스 범위를 넘는 예외가 발생하지만
		//이 ArrayIndexOutofBoundsExcepton은 RuntimeException의 후손이므로
		//사용자가 예외처리를 하지 않아도 자바가 예외처리를 해주어 컴파일이 가능

	}

}
