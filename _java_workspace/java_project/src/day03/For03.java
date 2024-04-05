package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 6/1 6/2 6/3 6/4 6/5 6/6
		 * 6의 약수 : 1 2 3 6
		 */

		int num = 100;

		// num을 1~num까지 나눈 나머지가 0인 수를 출력

		int i = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// num1을 입력받아서 약수를 출력
		Scanner scan = new Scanner(System.in);
		int num1 = 0;

		System.out.println("정수를 입력하세요.");
		num1 = scan.nextInt();

		for (i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		scan.close();

	}

}
