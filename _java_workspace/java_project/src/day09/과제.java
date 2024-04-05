package day09;

import java.util.Scanner;

import day08.Method07;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 2자리의 숫자를 생성(각 자리 수는 1~9까지의 수)
		 * => 배열로 랜덤 저장(중복 불가능)
		 * 유저는 3자리의 숫자를 맞히는 게임 => 직접 입력 (중복되지 않게)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안맞으면 out
		 * ex)
		 * 컴퓨터 번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1s
		 * 사용자 번호 : 1 3 2 => 1s 2b
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s 정답
		 */
/*
		Scanner scan = new Scanner(System.in);
		
		int com[] = new int[3];
		int user[] = new int[3];
		int index = 0;
		int b = 0;
		int s = 0;
		//유저 입력
		System.out.println("1~9까지의 숫자 중 3개를 입력 : ");
		for(int i=0;i<user.length;i++) {
			user[i] = scan.nextInt();
		}
		//난수생성 컴 입력
		for(int i = 0; i<com.length;i++) {
            do {
                index = (int)(Math.random()*9)+1;
            }while(exists(com,index));
            com[i] = index;
        }
		//컴 출력
		System.out.print("컴퓨터 번호 : ");
		for(int i : com) {
			System.out.print(i+" ");
		}
		System.out.println();
		//유저 출력
		System.out.print("사용자 번호 : ");
		for(int i : user) {
			System.out.print(i+" ");
		}
		System.out.println();
		//비교
		for(int i=0;i<com.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(com[i]==user[j]) {
					b++;
					if(i==j) {
						b--;
						s++;
					}
				}
			}
		}
		//결과
		if(s>0) {
			System.out.print(s+"s ");
		}
		if(b>0) {
			System.out.print(b+"b ");
		}
		if(b<=0&&s==0) {
			System.out.println("아웃");
		}
		
		scan.close();

	}
	
	private static boolean exists(int x[], int index) {
        for (int i = 0; i < x.length; i++) {
            if(x[i] == index)
                return true;
        }
        return false;
*/
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];

//		//메서드는 다른 클래스에서도 불러올 수 있음
//		//static으로 생성했기 때문에 클래스명.메서드명 으로 호줄가능
//		Method07.randomArray(comNum); //comNum에 랜덤 수 중복없이 생성
//		Method07.printArray(comNum);
//		
//		//static이 아닐 경우 객체를 생성하여, 객체명으로 메서드명 호출
//		Method07 me = new Method07();
//		me.randomArray(myNum);
//		me.printArray(myNum);
		
		//컴퓨터 배열을 생성
		//중복되지 않게 랜덤 수 추출 저장
		for(int i=0;i<comNum.length;i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(comNum[i]==comNum[j]) {
					i--;
				}
			}
		}
		
		//결과 체크
		for(int a : comNum) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		while(true) {
			int stk = 0;
			int ball = 0;
			
			//사용자 숫자 입력
			System.out.println("숫자입력>");
			String mystr = scan.next();
			String[] myNumStr = mystr.split("");
			for(int i=0;i<myNumStr.length;i++) {
				//문자를 숫자로 변환하여 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
		
		
			//결과 체크
//			for(int a : myNum) {
//				System.out.print(a+" ");
//		}
		
			//숫자 비교
			for(int i=0;i<comNum.length;i++) {
				for(int j=0;j<myNum.length;j++) {
					if(comNum[i]==myNum[j] && i==j) {
						//값도 자리도 같다면
						stk++;
					}else if(comNum[i]==myNum[j] && i!=j) {
						ball++;
					}
				}
			}
		
			if(stk==0 && ball==0) {
				System.out.println("out");
			}else {
				System.out.println("> "+stk+"s "+ball+"b ");
			}
		
			if(stk==3) {
				//스트라이크가 3이면 종료
				System.out.println("성공, 게임종료");
				break;
			}
		}
		
		scan.close();
    
    }
	
	

}
