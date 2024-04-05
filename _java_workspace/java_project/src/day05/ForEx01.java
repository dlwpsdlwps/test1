package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자신만의 수를 가지는 수
		 * 소수 : 3,5,7,11,13,17,19
		 * 소수의 약수는 (1, 자신)
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num=13
		 * 소수입니다
		 * num=12
		 * 소수가 아닙니다
		 */
		Scanner scan = new Scanner(System.in);
		
		int cnt=0;
		
//		System.out.println("숫자를 입력해주세요.");
//		int num = scan.nextInt();
//		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				cnt++;
//			}
//		}
//		
//		if(cnt==2) {
//			System.out.println("소수입니다.");
//		}else {
//			System.out.println("소수가 아닙니다.");
//		}
		
		//2~100까지의 소수를 모두 출력
		//이중for문 2~100까지
		
		int cnt2=0;
		
		for(int i=2;i<=100;i++) {
			cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.printf("%2d ",i);
				cnt2++;
			}
			if(cnt2==5) {
				cnt2=0;
				System.out.println();
			}
		}
		
		
		scan.close();

	}

}
