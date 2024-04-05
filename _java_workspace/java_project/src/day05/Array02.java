package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할 수 있는 배열을 생성
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 점수를 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번째 점수를 입력하세요.");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println(sum/(double)arr.length);
		
		scan.close();

	}

}
