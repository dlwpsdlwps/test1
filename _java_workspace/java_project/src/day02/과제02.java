package day02;

import java.util.Scanner;

public class 과제02 {

	public static void main(String[] args) {
		/*
		 * 카페에 제출 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력 ex) 2 3 + => 2 + 3 => 5 ex) 5 1 - =>
		 * 5 - 1 => 4 연산자는 + - * / % 가능 다른 종류의 연산자가 들어오면 잘못된 연사자로 출력
		 * 
		 */

		// 연산자 = char(기본자료형) == 비교가능 / String(객체) == 비교불가능

//		Scanner scan = new Scanner(System.in);
//		
//		int n=0;
//		int m=0;
//		char ch;
//		
//		System.out.println("정수 2개 입력 >");
//		n = scan.nextInt();
//		m = scan.nextInt();
//		System.out.println("연산자 입력 >");
//		ch = scan.next().charAt(0);
//		
//		switch(ch) {
//			case '+':
//				System.out.println(n+" + "+m+" = "+(n+m));
//				break;
//			case '-':
//				System.out.println(n+" - "+m+" = "+(n-m));
//				break;
//			case '*':
//				System.out.println(n+" * "+m+" = "+(n*m));
//				break;
//			case '/':
//				System.out.println(n+" / "+m+" = "+(n/(double)m));
//				break;
//			case '%':
//				System.out.println(n+" % "+m+" = "+(n%m));
//				break;
//			default:
//				System.out.println("잘못된 연산자입니다.");
//				break;
//		}
//		
//		scan.close();

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자(정수)를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자(정수)를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0);

		if (num2 == 0 && (op == '/' || op == '%')) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}

		int a = num1 - num2;
		int b = num1 * num2;
		double c = num1 / (double) num2;
		int d = num1 % num2;

		// /, %일 경우 num2가 0이 되면 안내문구 띄우기

		switch (op) {
		case '+':
			System.out.println("" + num1 + op + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println("" + num1 + op + num2 + "=" + a);
			break;
		case '*':
			System.out.println("" + num1 + op + num2 + "=" + b);
			break;
		case '/':
			System.out.println("" + num1 + op + num2 + "=" + c);
			break;
		case '%':
			System.out.println("" + num1 + op + num2 + "=" + d);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}

		scan.close();
	}

}
