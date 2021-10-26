package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Player {
	
	String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	
	//쌍을 이루는 카드목록을 담아놓기 위한 리스트 생성	
	public TreeSet<Integer> pairList = new TreeSet<Integer>();

	
	//게임을 하는 경기자가 CardDeck로부터 카드를 하나씩 가져와 담을 리스트를 만든다.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	
	
	public Player() {
		//number 2에 대한 value값을 2로하고 1씩증가시킬것이다.
		int value = 2;
				
		for(int i =0 ; i<number.length ; i++ ) {//카드의 숫자배열만큼 반복실행
			map.put(number[i],value++);//key는 카드의 숫자, value는 2부터 하나씩 증가
		}	
	}
	
	
	//카드를 매개변수로 받아서 나의 list에 담는다
	public void getCard(Card card) {
		list.add(card);
	}
	
	public int pairProcess(String player) {
		int n = 0;
		for(int i = 0 ;i<list.size();i++ ) {
			for(int j=i+1 ; j < list.size() ; j++){
				
				//i번째 카드숫자랑 j번째 카드 숫자랑 동일한지 판별
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) {
					
					//동일한 카드의 숫자(문자열)에 해당하는 정수를 map으로부터 가져오고 
					n = map.get(list.get(i).getNumber());
					
					//쌍을 이루는 숫자를 pairList에 담기
					pairList.add(n);
				}
			}
		}
		System.out.println(pairList);
		
	
		Iterator<Integer> iter = pairList.iterator();
		
		//pairList가 3개일때 큰값 두개만 뽑아오도록
		if(pairList.size() ==3) { //쌍을 이루는 카드가 3장이면
			System.out.println(player + "는 투페어입니다.");
			iter.next();          //가장 작은 카드는 버리고
			n = iter.next() + iter.next(); //나머지 두개의 숫자 두개를 더하기 
		}else if(pairList.size() == 2){		//쌍을 이루는 카드가 2장이면
			System.out.println(player + "는 투페어입니다.");
			n = iter.next() + iter.next(); //2개 출력
		}else if(pairList.size() ==1) {   //쌍을 이루는 카드가 1장이면
			System.out.println(player + "는 원페어입니다.");
			n = iter.next();			 // 1개 출력
		}
		
		return n;
	}

	
				
				
	//나의 카드를 모두 출력
	public void showCards() {
		System.out.println(list);
	}
	
	
	
}
