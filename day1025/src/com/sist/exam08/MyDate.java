package com.sist.exam08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MyDate {

	public MyDate(String str) {
		try {
		
		if(str == null ||  str.trim().isEmpty()){
			throw new IllegalArgumentException("�Է°��� �����ϴ�."); 
			}
		
		StringTokenizer st = new StringTokenizer(str, "/");
		String year = st.nextToken();
		String month = st.nextToken();
		String date = st.nextToken();
		System.out.printf("%s�� %s�� %s��",year,month,date);

		
		}catch(IllegalArgumentException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	
}
}

