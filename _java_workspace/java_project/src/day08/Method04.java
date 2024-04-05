package day08;

public class Method04 {

	public static void main(String[] args) {
		/* 최대공약수 최소공배수 리턴
		 * 리턴을 받은 값을 메인에서 출력
		 * */
		System.out.println("gcd : "+gcd(6,12));
		System.out.println("lcm : "+lcm(10,15));
		System.out.println("lcm2: "+lcm2(10,15));
		
	}
	
	/* 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
	 * 매개변수 : 두 정수(int)
	 * 리턴타입 : 최대공약수(int)
	 * 메서드명 : gcd
	 * */
	public static int gcd(int x, int y) {
		int rv = 0;
		for(int i=1;i<=x;i++) {
			if(x%i==0&&y%i==0) {
				rv = i;
			}
		}
		
		return rv;
	}
	
	/* 두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	 * 매개변수 : 두 정수(int)
	 * 리턴타입 : 최소공배수(int)
	 * 메서드명 : lcm
	 * */
	public static int lcm(int x, int y) {
		int rv = 0;
		for(int i=1;i<=100;i++) {
			if(i%x==0&&i%y==0) {
				rv = i;
				break;
				}
			}
		
		return rv;
	}
	
	//최소공배수 규칙 : 두 수를 곱한 후 최대공약수로 나누면 최소공배수
	//10 15 = 150 / 5 = 30
	//메서드 안에서 메서드를 호출 리턴 값을 사용
	public static int lcm2(int x, int y) {
		return x*y / gcd(x,y);
	}
	
}
