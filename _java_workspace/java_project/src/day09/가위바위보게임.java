package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택(0=가위 1=바위 2=보)
		 * 내가 가위바위보 중 하나를 선택해서 입력
		 * 승/패/무 의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 */
		Scanner scan = new Scanner(System.in);
		String user;
		int user2 = -1;
		int com = 0;
		
		System.out.println("가위/바위/보 중에 하나를 내십시오.");
		user = scan.next();
		System.out.println("user : "+user+"를 내셨습니다.");
		
		com = (int)(Math.random()*3);
		System.out.println(com);
		switch(com) {
		case 0:
			System.out.println("com : 가위");
			break;
		case 1:
			System.out.println("com : 바위");
			break;
		case 2:
			System.out.println("com : 보");
			break;
		}
		switch(user) {
		case "가위":
			user2 = 0;
			break;
		case "바위":
			user2 = 1;
			break;
		case "보":
			user2 = 2;
			break;
		}
		switch(user2) {
		case 0:
			if(com==0) {
				System.out.println("무");
			}else if(com==1) {
				System.out.println("패");
			}else if(com==2) {
				System.out.println("승");
			}
			break;
		case 1:
			if(com==0) {
				System.out.println("승");
			}else if(com==1) {
				System.out.println("무");
			}else if(com==2) {
				System.out.println("패");
			}
			break;
		case 2:
			if(com==0) {
				System.out.println("패");
			}else if(com==1) {
				System.out.println("승");
			}else if(com==2) {
				System.out.println("무");
			}
			break;
		}
		
		scan.close();
			
	}

}
