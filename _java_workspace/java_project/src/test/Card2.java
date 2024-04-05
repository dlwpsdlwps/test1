package test;

public class Card2 {
	private int num;
	private char shape;
	//생성자
	public Card2() {}
	public Card2(int num, char shape) {
		this.num = num;
		this.shape = shape;
	}
	//메서드
	public void print() {
		if(num==11) System.out.printf("%cJ ",shape);
		else if(num==12) System.out.printf("%cQ ",shape);
		else if(num==13) System.out.printf("%cK ",shape);
		else System.out.printf("%c%d ",shape,num);
	}
	//getter/setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	
}
