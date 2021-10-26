package com.sist.exam08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MyDate {

	public MyDate(String str) {
		try {
		
		if(str == null ||  str.trim().isEmpty()){
			throw new IllegalArgumentException("입력값이 없습니다."); 
			}
		
		StringTokenizer st = new StringTokenizer(str, "/");
		String year = st.nextToken();
		String month = st.nextToken();
		String date = st.nextToken();
		System.out.printf("%s년 %s월 %s일",year,month,date);

		
		}catch(IllegalArgumentException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	
}
}

