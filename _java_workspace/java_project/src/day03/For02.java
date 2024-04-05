package day03;

public class For02 {

	public static void main(String[] args) {
		// 1~10까지 출력
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1부터 10까지 짝수만 출력
		for (i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1~10까지 합계를 구하기
		int sum = 0; // 지역변수는 반드시 초기화 해야함. 초기화 기본값 0 / null
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 1~10까지 짝수합과, 홀수합을 출력
		sum = 0;
		int sum2 = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println(sum + ", " + sum2);

	}
}
