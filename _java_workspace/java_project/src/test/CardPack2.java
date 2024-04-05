package test;

import day11.Card;

public class CardPack2 {
	private Card pack[] = new Card[52];
	private int cnt = 0;
	//생성자
	public CardPack2() {
		char shape = '♥';
		for(int i=1;i<=4;i++) {
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1;j<=13;j++) {
				Card c = new Card();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	//getter/setter
	public Card[] getPack() {
		return pack;
	}
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
