package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력, 각 자리의 합게 출력
		 * ex) 11456 => 출력 65411 => 6+5+4+1+1 => 결과 값 출력
		 * ex) 19874 => 출력 47891 => 4+7+8+9+1 +> 결과
		 */
//		Scanner scan = new Scanner(System.in);
//		
//		int arr[] = new int[5];
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("숫자 입력 > ");
//			arr[i] = scan.nextInt();
//			sum += arr[i];
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("합계: "+sum);
//		
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
//		System.out.println(num);
		int sum = 0;
		
		// num % 10 = 나머지 => 마지막 자리 (출력)
		// num / 10 = 몫 (int)다시 나누는 값으로 사용
		while(num>0) {
			int b = num%10; //마지막 자리 추출
			System.out.print(b+" ");
			
			sum += b;
			num = num/10; //정수/정수 => 정수	소수점 버림
		}
		System.out.println("합계:"+sum);
		
		scan.close();

	}

}
