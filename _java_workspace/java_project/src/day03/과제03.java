package day03;

import java.util.Scanner;

public class 과제03 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 
		 * 1~50사이의 랜덤 수를 생성하여 맞히는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력> 10
		 * up
		 * 입력> 20
		 * up
		 * 입력> 30
		 * down
		 * 입력> 23
		 * 정답 종료.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int ran = (int)(Math.random()*50)+1;
		int input = 0;
		int num = 0;
		
		while(ran!=input&&num<5) {
			System.out.print("입력> ");
			input = scan.nextInt();
			if(input>ran) {
				System.out.println("down");
			}else if(input<ran) {
				System.out.println("up");
			}
			num++;
		}
		
		if(num==5) {
			System.out.println("5회 초과 종료");
		}else {
			System.out.printf("%d회만에 정답을 맞히셨습니다.",num);
		}
		
		scan.close();

	}

}
