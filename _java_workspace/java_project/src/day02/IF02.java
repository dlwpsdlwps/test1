package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균, 평가를 출력
		 * 평가는
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 범위 외의 숫자가 입력되면 다시 입력하라고 출력
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		int kor,eng,mat,sum;
//		double avg;
//		
//		System.out.println("국어점수 > ");
//		kor = scan.nextInt();
//		if(kor<0||kor>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("영어점수 > ");
//		eng = scan.nextInt();
//		if(eng<0||eng>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("수학점수 > ");
//		mat = scan.nextInt();
//		if(mat<0||mat>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		
//		sum = kor+eng+mat;
//		System.out.println("합계 : "+sum);
//		avg = sum/(double)3;
//		System.out.println("평균 : "+avg);
//		
//		if(avg>=90) {
//			System.out.println("평가 : A");
//		}else if(avg>=80) {
//			System.out.println("평가 : B");
//		}else if(avg>=70) {
//			System.out.println("평가 : C");
//		}else {
//			System.out.println("평가 : D");
//		}
//		
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력(0~100) : 국,영,수 순으로 입력");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		
		if(kor<0||kor>100) {
			System.out.println("국어점수의 범위가 벗어남.");
		}
		if(eng<0||eng>100) {
			System.out.println("영어점수의 범위가 벗어남.");
		}
		if(mat<0||mat>100) {
			System.out.println("수학점수의 범위가 벗어남.");
		}
		
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		
		System.out.println("합계: "+sum +" 평균: "+avg);
		
		char result = 'D'; //char = ''
		if(avg>100||avg<0) {
			System.out.println("잘못된값");
		}else if(avg>=90) {
			result = 'A';
		}else if(avg>=80) {
			result = 'B';
		}else if(avg>=70) {
			result = 'C';
		}else {
			result = 'D';
		}
		
		System.out.println("결과: "+result);
		
		scan.close();

	}

}
