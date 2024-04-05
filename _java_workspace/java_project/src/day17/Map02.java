package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력 받아 (Scanner) map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복 (1=계속 / 0=종료)
		 * 과목과 점수를 입력해주세요 >
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 */
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int kw = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(kw!=0) {
			System.out.println("과목과 점수를 입력해주세요 >");
			map.put(s.next(), s.nextInt());
			System.out.println("계속하시겠습니까? (1=계속 / 0=종료)");
			kw = s.nextInt();
		}
		System.out.println("종료");
		
		for(String key : map.keySet()) {
			System.out.print(key+":"+map.get(key)+" ");
			sum += map.get(key);
		}
		System.out.println();
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/(double)map.size());
		
		s.close();

	}

}
