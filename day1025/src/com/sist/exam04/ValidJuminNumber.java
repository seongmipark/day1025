//위키백과의 주민번호계산법 확인
package com.sist.exam04;

import java.util.Scanner;
public class ValidJuminNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(-포함)==>");
		jumin = sc.next();
		
		
		//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		//소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다.
		//(단, 10은 0, 11은 1로 표기한다.)
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//800101-1234567
		//인덱스 6번째는 계산에 참여하지 않게.
		//문자열 길이는 14
		//반복실행해야할 인덱스는 12 => i < jumin.length() -1
		
		int sum = 0;
		for(int i = 0 ; i<jumin.length() -1 ; i++ ) {
			if( i != 6) {
			sum = sum + Integer.parseInt(jumin.charAt(i)+"")*n[i];
			}
		}
		sum = sum%11;
		sum = 11 - sum;
		
		if(sum == 10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		int check  = Integer.parseInt(jumin.charAt(13)+"");
		//charAt()의 결과는 char
		//char를 문자열(String)으로 만들기 위하여
		//""를 붙여 문자열로 만든다.
		
		if(sum == check) {
			System.out.println("올바른 주민등록번호 입니다.");
		}else {
			try {
			throw new InValidJuminNumberException("올바른 주민번호 형식이 아닙니다.");
			//왜 오류가 날까?
			//우리가 만든 InValidJuminNumberException은
			//RuntimeException의 후손이 아니라서 예외처리를 해야한다.
			}catch(InValidJuminNumberException e) {
				System.out.println("예외 발생:"+ e.getMessage());
				
			}
		}
	}

}
