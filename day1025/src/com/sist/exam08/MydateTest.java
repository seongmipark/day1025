package com.sist.exam08;

import java.util.Scanner;

public class MydateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��/��/�� �������� ��¥�� �Է��ϼ���.=>");
		data = sc.next();
		
		MyDate date = new MyDate(data);
	
	
	}

}
