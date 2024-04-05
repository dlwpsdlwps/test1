package day04;

public class For07 {

	public static void main(String[] args) {
		// 이중 for문
		/* for(int i=1;i<=5;i++){		i=	1	2	3	4	5
		 * 		for(int j=1;j<=5;j++){	j=	1~5	1~5	1~5	1~5	1~5
		 * 			실행문;					5	5 	5 	5 	5 => 25번 실행
		 * 		}
		 * }
		 */
		 
		// 별찍기
		/* *****	i=1 j=5
		 * *****	i=2 j=5
		 * *****	i=3 j=5
		 * *****	i=4 j=5
		 * *****	i=5 j=5
		 */
		for(int i=1;i<=5;i++) {		//줄
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();	//한 줄 끝나면 줄바꿈
		}
		System.out.println("----------");
		
		/* *		i=1 j=1
		 * **		i=2 j=2
		 * ***		i=3 j=3
		 * ****		i=4 j=4
		 * *****	i=5 j=5
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/*     *	i=1 b=4 j=1
		 *    **	i=2 b=3 j=2
		 *   ***	i=3 b=2 j=3  
		 *  ****	i=4 b=1 j=4
		 * *****	i=5 b=0 j=5
		 */
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/*     *		i=1 b=4 j=1 +0
		 *    ***		i=2 b=3 j=3 +1
		 *   *****		i=3 b=2 j=5 +2
		 *  *******		i=4 b=1 j=7 +3
		 * *********	i=5 b=0 j=9 +4
		 */
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 3줄 씩 3개 출력
		 */
		int cnt = 1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(cnt+++" ");
			}
			System.out.println();
		}
		System.out.println("----------");

	}

}
