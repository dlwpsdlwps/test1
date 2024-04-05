package day08;

public class Method03 {

	public static void main(String[] args) {
		mtable(2);
	}
	
	/* 정수 2~9 중 하나에 해당하는 구구단 출력 메서드
	 * 매개변수 : 2
	 * 리턴타입 : void 출력 => 출력이 없음
	 */
	public static void mtable(int x) {
		for(int i=1;i<=9;i++) {
			System.out.println(x+"*"+i+"="+x*i);
		}
	}
}
