package com.sist.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(3.4));//�ڹ��ʱ⿡�� ��������ü����������������
		list.add(2.7);//������ �ڵ����� => auto Boxing�̶�� �Ѵ�.
		list.add(5.5);
		
		//�ε��� ������ ����ϴ� ������ for����  => �ε����� �ʿ��Ҷ� �̹������
		for(int i=0 ; i < list.size() ; i++ ) {
			//Double data= list.get(i);
			//double n = data.doubleValue();
			double n = list.get(i); // auto UnBoxing�̶���Ѵ�.
			System.out.println(n);
		}
		System.out.println("===================================");
		
		//for -each�������
		for(double d : list) {
			System.out.print(d+"\t");
		}
		
		System.out.println("===================================");
		
		//Iterator(�ݺ���)��� =>�����Ͱ��ִ¸�ŭ �ݺ������ϱ� ���� Ŭ����
		//�̸���� ��ҿ� ���� �ݺ��ڸ� ������ ������ ��ȯ
		Iterator<Double> iter = list.iterator();
		while(iter.hasNext()) {//�����Ͱ� �ִ� ��ŭ �ݺ�����
			double n = iter.next();
		}
		

	}

}
