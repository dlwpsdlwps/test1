package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 10개의 배열을 담을 수 있는 arr 생성
		 * 1~10까지 값을 입력한 후 출력
		 */
//		int arr[] = new int[10];
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("숫자 입력 > ");
//			arr[i] = scan.nextInt();
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		scan.close();
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//배열을 섞는 코드
		//랜덤 번지를 선택해서 순차적으로 하나씩 교환
		//(int)(Math.random()*9)+0 //0부터 10개의 랜덤 수 출력
		//max = 최종번지 개수, min = 첫번지
		//교환코드
		//[i][i+1]
//		int temp = arr[i];
//		arr[i] = arr[i+1];
//		arr[i+1] = temp;
		
		int min = 0;
		int max = arr.length;
		for(int i=0;i<arr.length;i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		}
		System.out.println("---섞은 후 값 보기---");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//섞은 값을 원래대로 정리(정렬)
		//작은 수부터 정리 = 오름차순
		//큰 수부터 정리 = 내림차순
		System.out.println("---정렬 후---");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {	// >:오름차순 <:내림차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}			
		}
		for(int s : arr) {
			System.out.print(s+" ");
		}
		System.out.println();

	}

}
