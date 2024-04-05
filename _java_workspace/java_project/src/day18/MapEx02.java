package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map에 저장 후 출력
		 */
		Scanner s = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		int size = 3;
		
		while(map.size()<size) {
			System.out.println("단어와 뜻 입력>");
			map.put(s.next(), s.next());
		}
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("단어와 뜻 입력 >");
//			map.put(s.next(), s.next());
//		}
		System.out.println("--단어장--");
		for(String t : map.keySet()) {
			System.out.println(t+" : "+map.get(t));
		}
		
		s.close();

	}

}
