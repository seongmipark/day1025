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
		
		System.out.println("��հ�: "+avg);
	
		//ArithmeticException : � ���� 0���� �������� �Ҷ�
		//NullPointerException : null���� �����Ҷ� 
	}catch(ArithmeticException e){
		System.out.println("0���� ���� �� �����ϴ�.");
	}catch(NullPointerException e) {
		System.out.println("�迭�� ���� �����ϴ�.");
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int []arr = new int[10];
		
		for(int i = 0 ;i<10 ; i++ ) {
			System.out.print("������ �Է��ϼ���==>");
			arr[i] = sc.nextInt();	
		}
		
		AvgTest.getAverage(arr);
	
	//NegativeArraySizeException : �迭�� �ε����� �����϶�.
	//ArrayIndexOutOfBoundsException : �迭������ �Ѿ��	
	
	}catch(NegativeArraySizeException e) {
		System.out.println("�迭�� ũ��� ������ �� �� �����ϴ�.");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭 �ε��� ������ �ʰ��߽��ϴ�.");
	}
}
}
