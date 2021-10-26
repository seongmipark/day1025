package com.sist.exam10;

import java.util.Scanner;


public class AvgTest {
	

	public static void getAverage(int []arr) {
		try {
		int sum=0;
		double avg;	
		for(int i = 0 ;i<arr.length ; i++ ) {
			sum +=arr[i];
		}	
		
		for(int n : arr) {
			System.out.print(n+"\t");
		}
		System.out.println();
		
		avg = (double)sum/10;	
		
		System.out.println("평균값: "+avg);
	
		//ArithmeticException : 어떤 수를 0으로 나누려고 할때
		//NullPointerException : null값을 참조할때 
	}catch(ArithmeticException e){
		System.out.println("0으로 나눌 수 없습니다.");
	}catch(NullPointerException e) {
		System.out.println("배열에 값이 없습니다.");
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int []arr = new int[10];
		
		for(int i = 0 ;i<10 ; i++ ) {
			System.out.print("정수를 입력하세요==>");
			arr[i] = sc.nextInt();	
		}
		
		AvgTest.getAverage(arr);
	
	//NegativeArraySizeException : 배열의 인덱스가 음수일때.
	//ArrayIndexOutOfBoundsException : 배열범위를 넘어갈때	
	
	}catch(NegativeArraySizeException e) {
		System.out.println("배열의 크기는 음수가 될 수 없습니다.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 인덱스 범위를 초과했습니다.");
	}
}
}
