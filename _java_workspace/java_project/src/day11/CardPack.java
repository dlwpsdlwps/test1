package day11;

/* CardPack 클래스
 * - ♥1 ~ ♥K / ◆1 ~ ◆K / ♣1 ~ ♣K / ♠1 ~ ♠K
 * - 총 카드 수 52장
 * - 52장의 카드 한 묶음 (배열)
 * 
 * - 카드 출력 기능 - Card class print() 사용
 * - 카드 초기화 기능 (CardPack 생성자)
 * - 카드 한 장을 빼내는 기능 => 출력 print() 사용
 * - 카드 섞는 기능
 */
public class CardPack {
	//int arr[] = new int[52]; //int 배열 안에 들어가는 자료의 형태
	//카드 52장이 들어갈 수 있는 배열을 생성
	private Card pack[] = new Card[52];
	private int cnt = 0; //카드 배열의 index 위치를 체크하기 위한 변수
	
	public CardPack() {
		//CardPack 클래스를 생성하면 52장의 카드가 생성되어야 함
		// - 숫자 : 1~10,J,Q,K
		// - 모양 : ♥,◆,♣,♠
		char shape = '♥';
		for(int i=1;i<=4;i++) { //4가지 모양을 넣기 위한 for문
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1;j<=13;j++) { //13까지 숫자를 넣기 위한 for문
				Card c = new Card(); //새 카드 1장을 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	
	//카드를 섞는 기능
	//shuffle()
	//리턴타입 : void
	//매개변수 : x
	public void shuffle() {
		Card arr2[] = new Card[52];
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = pack[(int)(Math.random()*52)];
			for(int j=0;j<i;j++) {
				if(arr2[i]==arr2[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			pack[i] = arr2[i];
		}
		
//		for(int i=0; i<pack.length; i++) {
//			int random = (int)(Math.random()*52);
//			Card tmp = pack[i];
//			pack[i] = pack[random];
//			pack[random] =pack[i];
//		}
	}
	
	//카드 한 장을 빼내는 기능
	//pick() : 카드가 리턴돼야 함
	//리턴타입 : Card c 객체
	//매개변수 : x
	public Card pick() {
		if(cnt==0) return null;
		cnt--;
		return pack[cnt];
	}
	//초기화 하는 기능
	public void init() {
		cnt = 52;
	}
	
	//getter / setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

}
