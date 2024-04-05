package day11;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c = new Card();
//		c.setNum(12);
//		c.setShape('#');
//		c.print();
		
		CardPack cp = new CardPack(); //52장의 카드가 모두 생성됨

		//섞기
		cp.shuffle();
		
		//카드 팩 출력
		int cnt = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				cp.getPack()[cnt].print();
				//cp.getPack() : CardPack 클래스 안에 있는 pack[]
				//cp.getPack()[cnt] : pack[cnt] => Card c(객체)(멤버변수,메서드)
				//pack[cnt].print = c.print
				cnt++;
			}
			System.out.println();
		}
//		System.out.println("--------------");
//		System.out.println("딜러가 카드를 나누고 있습니다.");
//		Card player1 = cp.pick();
//		Card player2 = cp.pick();
//		System.out.println();
		for(int i=1;i<=51;i++) {
			cp.pick().print();
		}
		cp.pick().print();
//		cp.pick().print();
		
	}

}
