package day08;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(4));
		
		// 2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
		int sum = 0;
		for(int i=2;i<=100;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("합계: "+sum);

	}

	/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(t/f) 리턴
	 * 리턴타입 : boolean
	 * 매개변수 : int
	 * 메서드명 : prime
	 * */
	public static boolean prime(int x) {
		int cnt = 0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)
			{
				cnt++;
			}
		}
		
		return cnt==2;
	}
	
}
