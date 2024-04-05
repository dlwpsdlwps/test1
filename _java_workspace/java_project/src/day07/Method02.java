package day07;

public class Method02 {

	public static void main(String[] args) {
		// + - * / % 메서드를 생성
		// main에서 호출하여 확인
		System.out.println(sum(2,1));
		System.out.println(sub(2,1));
		System.out.println(mul(2,1));
		System.out.println(div(2,1));
		System.out.println(mod(2,1));

	}
	
	//메서드 선언위치
	//두 정수의 합을 알려주는 메서드 sum
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	//두 정수의 차를 알려주는 메서드 sub
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	//두 정수의 곱을 알려주는 메서드 mul
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	//두 정수의 몫을 알려주는 메서드 div
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	
	//두 정수의 나머지를 알려주는 메서드 mod
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	

}
