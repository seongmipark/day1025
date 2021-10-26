package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Player {
	
	String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	
	//���� �̷�� ī������ ��Ƴ��� ���� ����Ʈ ����	
	public TreeSet<Integer> pairList = new TreeSet<Integer>();

	
	//������ �ϴ� ����ڰ� CardDeck�κ��� ī�带 �ϳ��� ������ ���� ����Ʈ�� �����.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	
	
	public Player() {
		//number 2�� ���� value���� 2���ϰ� 1��������ų���̴�.
		int value = 2;
				
		for(int i =0 ; i<number.length ; i++ ) {//ī���� ���ڹ迭��ŭ �ݺ�����
			map.put(number[i],value++);//key�� ī���� ����, value�� 2���� �ϳ��� ����
		}	
	}
	
	
	//ī�带 �Ű������� �޾Ƽ� ���� list�� ��´�
	public void getCard(Card card) {
		list.add(card);
	}
	
	public int pairProcess(String player) {
		int n = 0;
		for(int i = 0 ;i<list.size();i++ ) {
			for(int j=i+1 ; j < list.size() ; j++){
				
				//i��° ī����ڶ� j��° ī�� ���ڶ� �������� �Ǻ�
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) {
					
					//������ ī���� ����(���ڿ�)�� �ش��ϴ� ������ map���κ��� �������� 
					n = map.get(list.get(i).getNumber());
					
					//���� �̷�� ���ڸ� pairList�� ���
					pairList.add(n);
				}
			}
		}
		System.out.println(pairList);
		
	
		Iterator<Integer> iter = pairList.iterator();
		
		//pairList�� 3���϶� ū�� �ΰ��� �̾ƿ�����
		if(pairList.size() ==3) { //���� �̷�� ī�尡 3���̸�
			System.out.println(player + "�� ������Դϴ�.");
			iter.next();          //���� ���� ī��� ������
			n = iter.next() + iter.next(); //������ �ΰ��� ���� �ΰ��� ���ϱ� 
		}else if(pairList.size() == 2){		//���� �̷�� ī�尡 2���̸�
			System.out.println(player + "�� ������Դϴ�.");
			n = iter.next() + iter.next(); //2�� ���
		}else if(pairList.size() ==1) {   //���� �̷�� ī�尡 1���̸�
			System.out.println(player + "�� ������Դϴ�.");
			n = iter.next();			 // 1�� ���
		}
		
		return n;
	}

	
				
				
	//���� ī�带 ��� ���
	public void showCards() {
		System.out.println(list);
	}
	
	
	
}
