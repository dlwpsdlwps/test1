package test;

public class Test {

	public static void main(String[] args) {
		Card2 c = new Card2(1,'♥');
		c.print();
		System.out.println();
		
		CardPack2 cp = new CardPack2();
		int cnt = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				cp.getPack()[cnt].print();
				cnt++;
			}	
		}
	}
}
