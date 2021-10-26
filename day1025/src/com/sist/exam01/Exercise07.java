package com.sist.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(3.4));//자바초기에는 더블형객체를만들었어야했지만
		list.add(2.7);//지금은 자동으로 => auto Boxing이라고 한다.
		list.add(5.5);
		
		//인덱스 변수를 사용하는 보통의 for루프  => 인덱스가 필요할때 이방법으로
		for(int i=0 ; i < list.size() ; i++ ) {
			//Double data= list.get(i);
			//double n = data.doubleValue();
			double n = list.get(i); // auto UnBoxing이라고한다.
			System.out.println(n);
		}
		System.out.println("===================================");
		
		//for -each구문사용
		for(double d : list) {
			System.out.print(d+"\t");
		}
		
		System.out.println("===================================");
		
		//Iterator(반복자)사용 =>데이터가있는만큼 반복수행하기 위한 클래스
		//이목록의 요소에 대한 반복자를 적절한 순서로 반환
		Iterator<Double> iter = list.iterator();
		while(iter.hasNext()) {//데이터가 있는 만큼 반복실행
			double n = iter.next();
		}
		

	}

}
