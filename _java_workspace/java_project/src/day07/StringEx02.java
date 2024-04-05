package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 */
		String[] file = {"이것이자바다.java","java의정석.java","String.jpg","String 메서드.txt","array.txt"};
		String kw;
		int r = 0;
		
		// ex) java => 이것이자바다.java ...
		// String => String.jpg ...
		// txt => ...
		// 스트링 => 검색결과가 없습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색어 입력 > ");
		kw = scan.next();
		System.out.print("검색결과: ");
		for(int i=0;i<file.length;i++) {
			if(file[i].contains(kw)) {
				System.out.print(file[i]+" ");
				r++;
			}
		}
		if(r==0) {
			System.out.println("없음");
		}
		
		scan.close();
		

	}

}
