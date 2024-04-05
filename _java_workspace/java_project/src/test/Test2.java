package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수를 입력하세요. : ");
		int cnt = scan.nextInt();
		int sum = 0;
		for(int i=0;i<cnt;i++) {
			sum += (int)(Math.random()*100);
		}
		System.out.println("난수 7개의 합은 "+sum);
		scan.close();
	}

}
