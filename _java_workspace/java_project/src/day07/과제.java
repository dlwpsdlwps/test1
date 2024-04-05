package day07;

import java.util.Scanner;

public class 과제 {
	
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
	public static double div(int num1, double num2) {
		return num1/num2;
	}
	
	//두 정수의 나머지를 알려주는 메서드 mod
	public static int mod(int num1, int num2) {
		return num1%num2;
	}

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈|2.뺼셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >>메뉴선택 1
		 * >>숫자1 5
		 * >>숫자2 10
		 * 결과 : 5+10=15
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int arr[] = new int[2];
		int num1 = 0;
		int num2 = 0;
		
		System.out.println(">>숫자1 ");
		num1 = scan.nextInt();
		System.out.println(">>숫자2 ");
		num2 = scan.nextInt();
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈|2.뺼셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println(">>메뉴선택 ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.printf("%d+%d=%d%n",num1,num2,sum(num1,num2));
				break;
			case 2:
				System.out.printf("%d-%d=%d%n",num1,num2,sub(num1,num2));
				break;
			case 3:
				System.out.printf("%d*%d=%d%n",num1,num2,mul(num1,num2));
				break;
			case 4:
				System.out.printf("%d/%d=%f%n",num1,num2,div(num1,num2));
				break;
			case 5:
				System.out.printf("%d%%%d=%d%n",num1,num2,mod(num1,num2));
				break;
			case 6:
				System.out.println("종료");
				break;
			}
		}while(menu != 6);

		scan.close();
		
	}

}
