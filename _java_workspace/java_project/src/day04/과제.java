package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * ...
		 * 도착 총 이동 횟수 : 10번 => 주사위를 던진 횟수
		 */
		Scanner scan = new Scanner(System.in);
		
		int dice=0;
		int cnt=0;
		int des=30;
		
		while(des>=0) {
			dice = (int)(Math.random()*6)+1;
			System.out.println("주사위를 던져주세요.(Enter)");
			String input = scan.nextLine();
			System.out.println("주사위 : "+dice);
			System.out.println(dice+"칸 전진 => "+(des-=dice));
			System.out.println();
			cnt++;
		}
		System.out.println("도착, 총 이동횟수: "+cnt);
		
		scan.close();

	}

}
