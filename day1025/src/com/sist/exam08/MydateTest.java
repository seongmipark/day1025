package com.sist.exam08;

import java.util.Scanner;

public class MydateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년/월/일 형식으로 날짜를 입력하세요.=>");
		data = sc.next();
		
		MyDate date = new MyDate(data);
	
	
	}

}
