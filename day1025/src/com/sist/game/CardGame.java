package com.sist.game;

public class CardGame {

	public static void main(String[] args) {
		
		//carddeck��ü�� �����Ѵ�.
		//�����ڿ� ���ؼ� 52���� ī�尡 �����ȴ�.
		CardDeck deck = new CardDeck();
		
		//ī�� ����
		deck.shuffle();
		
		//ī������� �� ����� �θ��� ����
		Player p1 = new Player();
		Player p2 = new Player();
		
		//ù��° ����� ī�带 �ϳ� �̾ƿ´�.
		p1.getCard(deck.deal());
		//�ι�° ����� ī�带 �ϳ� �̾ƿ´�.
		p2.getCard(deck.deal());
		
		//ù��° ����� �ڽ��� ��� ī�带 �����ش�
		p1.showCards();
	
		//�ι�° ����� �ڽ��� ��� ī�带 �����ش�
		p2.showCards();

	}

}
