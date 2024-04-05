package day08;

public class Method07 {

	public static void main(String[] args) {
		/* 로또 번호 생성
		 */
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6]; //사용자 로또 번호
//		ran(lotto);
//		prt(lotto);
//		ran(user);
//		prt(user);
		randomArray(lotto);//로또번호
		randomArray(user);//사용자 번호
		System.out.println("---당첨번호---");
		printArray(lotto);
		System.out.println("---사용자 번호---");
		printArray(user);
		System.out.println("---당첨여부---");
		if(lottoRank(lotto, user)==-1) {
			System.out.println("꽝!");
		}else {
			System.out.println(lottoRank(lotto, user)+"등");
		}

	}
	
	/* 배열을 매개변수로 받아 1~45까지 랜덤 수를 채워서 생성
	 * 매개변수 : 배열 => int x[]
	 * random == x[i] false면 추가
	 */
//	public static void ran(int x[]) {
//		for(int i=0;i<x.length;i++) {
//			x[i] = (int)(Math.random()*45)+1;
//			for(int j=0;j<i;j++) {
//				if(x[i] == x[j]) {
//					i--;
//				}
//			}
//		}
//	}
	public static void randomArray(int x[]) {
		//배열을 받아서 배열에 랜덤 값 중복없이 채우기
		int cnt = 0; //while에서 i 역할을 할 변수
		while(cnt<x.length) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(x,r)) {
				x[cnt] = r;
				cnt++;
			}
		}
	}
	
	/* 배열을 매개변수로 받아 배열을 출력하는 메서드
	 */
//	public static int[] prt(int x[]) {
//		for(int i : x) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//		return x;
//	}
	public static void printArray(int x[]) {
		for(int i=0;i<x.length;i++) {
			if(i==6) {
				System.out.print("["+x[i]+"]");
			}else {
				System.out.print(x[i]+" ");
			}
		}
		System.out.println();
	}
	
	/* 중복 확인 메서드
	 * 매개변수 : 배열, 값
	 * 있으면 true, 없으면 false
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 */
	public static boolean isContain(int x[], int y) {
		for(int i=0;i<x.length;i++) {
			if(x[i]==y) {
				return true;
			}
		}
		
		return false;
	}
	
	//등수 확인 메서드
	/* 매개변수 : lotto[] / user[]
	 * 리턴타입 : int
	 * 메서드명 : lottoRank
	 * --당첨기준
	 * user번호 기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 번호 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지는 꽝
	 */
	public static int lottoRank(int x[], int y[]) {
		int cnt = 0;
		int bonus = 0;
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j]) {
					if(i==6) {
						bonus++;
					}else {
						cnt++;
					}
				}
			}
		}
		
		switch(cnt) {
		case 6:
			return 1;
		case 5:
			if(bonus==1) {
				return 2;
			}else {
				return 3;
			}
		case 4:
			return 4;
		case 3:
			return 5;
		default:
			return -1;
		}
		
	}

}
