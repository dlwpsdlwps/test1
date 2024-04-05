package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업
		 * 두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a=3, b=5 => 3+4+5
		 * ex) a=5, b=1 => 1+2+3+4+5
		 * ex) a=3, b=3 => 3
		 */
		과제 h = new 과제();
		System.out.println(h.gap(3, 5));
		System.out.println(h.gap(5, 1));
		System.out.println(h.gap(3, 3));
		System.out.println(h.gap(1, 100));
	}
	//메서드
	public int gap(int x, int y) {
		int sum = 0;
		if(x>y) {
			for(int i=0;i<=(x-y);i++) {
				sum+=y+i;
			}
		}
		if(x<y) {
			for(int i=0;i<=(y-x);i++) {
				sum+=x+i;
			}
		}
		if(x==y) {
			sum = x;
		}
		return sum;
	}
}
