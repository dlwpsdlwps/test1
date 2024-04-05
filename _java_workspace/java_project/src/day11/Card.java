package day11;

/* 1장의 카드를 생성하기 위한 클래스
 * - 숫자 : 1~10,J(11),Q(12),K(13)
 * - 모양 : ♥,◆,♣,♠
 * - 한 장의 카드를 출력하는 기능 print() => ♥1
 * - ex) ◆12 => ◆Q, (없는모양)2 => ♥2, (없는모양)(범위밖숫자) => ♥1 
 */
/* 클래스의 구성
 * - 멤버변수 : 모양, 숫자 => private => getter/setter 생성
 * - 메서드 : print()
 * - 생성자 : 기본 생성자만 생성 => ♥1
 */

public class Card {
	
	private int num;
	private char shape;
	//생성자
	public Card() {
		num = 1;
		shape = '♥'; 
		//print();
	}
	//메서드 print
	public void print() {
		if(num==11) System.out.printf("%cJ ",shape);
		else if(num==12) System.out.printf("%cQ ",shape);
		else if(num==13) System.out.printf("%cK ",shape);
		else System.out.printf("%c%d ",shape,num);
	}
	//setter
	public void setNum(int num) {
		if(1<=num&&num<=13) this.num = num;
		else this.num = 1;
	}
	public void setShape(char shape) {
		//♥,◆,♣,♠
		if(shape=='♥'||shape=='◆'||shape=='♣'||shape=='♠') this.shape = shape;
		else this.shape = '♥';
	}

}