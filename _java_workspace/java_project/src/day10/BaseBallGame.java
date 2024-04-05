package day10;

import java.util.Scanner;

import day08.Method07;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임을 메서드화
		 * 사용자 번호는 직접 입력
		 * 번호는 랜덤 생성(1~9, 중복x)
		 * 중복안되게 하는 메서드 isContain
		 */
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int stk = 0;
		int ball = 0;
		
		//컴퓨터 번호 생성
		ran(comNum);
		//테스트
		for(int a : comNum) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		//반복
		while(stk!=3) {
			//사용자 번호 입력
			System.out.println("숫자입력>");
			String mystr = scan.next();
			String[] myNumStr = mystr.split("");
			for(int i=0;i<myNumStr.length;i++) {
				//문자를 숫자로 변환하여 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			
			//숫자 비교
			stk = stkCnt(comNum,myNum);
			ball = bllCnt(comNum, myNum);
			
			//결과 출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			}else {
				System.out.println("> "+stk+"s "+ball+"b ");
			}
			
			if(stk==3) {
				//스트라이크가 3이면 종료
				System.out.println("성공, 게임종료");
			}
		}
		
		scan.close();

	}
	
	//랜덤으로 배열을 중복안되게 생성
	//Method07의 isContain 가져와서 사용
	public static void ran(int x[]) {
		int cnt = 0;
		while(cnt<x.length) {
			int r = (int)(Math.random()*9)+1;
			if(!Method07.isContain(x,r)) {
				x[cnt] = r;
				cnt++;
			}
		}
	}
	
	//스트라이크 개수를 카운트하는 메서드
	/* comNum, myNum를 주고 번호와 위치가 일치하면 count하는 메서드
	 * 리턴타입 : int count를 리턴
	 */
	public static int stkCnt(int x[], int y[]) {
		int cnt = 0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j] && i==j) {
					//값도 자리도 같다면
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	//볼 개수 카운트 메서드
	/* comNum, myNum를 주고 번호만 일치하면 count하는 메서드
	 * 리턴타입 : int count 리턴
	 */
	public static int bllCnt(int x[], int y[]) {
		int cnt = 0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j] && i!=j) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
