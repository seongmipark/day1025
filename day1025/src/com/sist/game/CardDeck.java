package com.sist.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CardDeck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//52���� ī�带 �����Ͽ� ���� �ִ´�
	public CardDeck() {
		
		String []suit = {"Clubs","Diamonds","Hearts","Spades"}; //ī�� ��� 4����
		
		//ī���� ���� 13������ ��´�
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		//��ø�ݺ����� �̿��Ͽ� 52���� ī�带 �����Ͽ� deck�� ���
		for(int i=0 ;i<suit.length;i++) { //ī�� ��縸ŭ �ݺ��� ����
			for(int j=0 ; j<number.length ; j++ ) { //ī�� ���ڸ�ŭ �ݺ���
				deck.add(new Card(suit[i],number[j]));
			}
		}
	}
	
	//52���� ī�尡 ������� �վ��
	//������ ���� ī�带 �������� �����ִ� �޼ҵ�
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//52���� ī�尡 �ִ� deck���� ���� ī�带 �ϳ��� �̾ƿ��� �޼ҵ带 �����
	//�̾ƿ��� deck���� �����ش�.
	//�׻� deck�� �� ù��° ��Ҹ� �̾ƿ����� �Ѵ�. (deck�� 0��° �ε��� ��Ҹ� �̾Ƽ� ����� ��ȯ)
	public Card deal() {
		return deck.remove(0); 
		//�� ó���� ȣ���ϸ� 52���� ī�� �߿� 0��°�� ��ȯ
		//�� ó���� ȣ���ϸ� 51���� ī�� �߿� 0��°�� ��ȯ
		//...
	}
}
	


