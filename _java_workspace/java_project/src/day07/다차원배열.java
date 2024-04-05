package day07;

public class 다차원배열 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 10 20 30 40 50
		 * 60 40 80 60 53
		 * 자료형 배열명[][] = new 자료형[5][3]; // 5행, 3열
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 1 2 3
		 * 4 5 6
		 */
		int arr[][] = new int[5][3];
		
		int cnt = 1;
		for(int i=0;i<arr.length;i++) { //0번지~4번지 5개 행 반복
			for(int j=0;j<arr[0].length;j++) {	//첫 행의 length
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); //행마다 줄바꿈
		}

	}

}
