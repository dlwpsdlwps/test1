package day04;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * menu
		 * 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료
		 * menu에 따라서 두 수의 연산결과를 출력
		 * 1 -> 5+3=8
		 * 2 -> 5-3=2
		 * ...
		 * 6 -> 종료
		 * 다른 번호는 잘못된 메뉴로 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int menu=0;
		
		System.out.println("숫자 2개 입력 > ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		do {
			System.out.println("menu");
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
			System.out.println("menu 선택 > ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.printf("%d+%d=%d%n",num1,num2,num1+num2);
				break;
			case 2:
				System.out.printf("%d-%d=%d%n",num1,num2,num1-num2);
				break;
			case 3:
				System.out.printf("%d*%d=%d%n",num1,num2,num1*num2);
				break;
			case 4:
				if(num2==0) {
					System.out.println("두번째 숫자를 다시 입력해주세요.");
					num2 = scan.nextInt();
					System.out.printf("%d/%d=%f%n",num1,num2,num1/(double)num2);
				}else {
					System.out.printf("%d/%d=%f%n",num1,num2,num1/(double)num2);
				}
				break;
			case 5:
				if(num2==0) {
					System.out.println("두번째 숫자를 다시 입력해주세요.");
					num2 = scan.nextInt();
					System.out.printf("%d%%%d=%d%n",num1,num2,num1%num2);
				}else {
					System.out.printf("%d%%%d=%d%n",num1,num2,num1%num2);
				}
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=6);
		
		scan.close();

	}

}
