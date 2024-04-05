package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오
		 * 상품을 map에 추가하는 작업은 메서드를 활용
		 * 1. map을 main에 생성해놓고, 매개변수로 받아 map의 데이터를 채우는 메서드
		 * 2. map을 메서드 내부에서 생성하여, main으로 리턴하는 메서드
		 * 
		 * 가위 2500
		 * 크레파스 4000
		 * 물감 5000
		 * 합계 ?
		 * 
		 */
		int sum1 = 0;
		int sum2 = 0;
		//1.
		System.out.println("--map을 매개변수로 받는 메서드--");
		HashMap<String, Integer> map = new HashMap<String, Integer>();	//main에서 map생성
		MapEx01 me = new MapEx01();	//static에서 public 메서드 사용하기 위해 생성
		me.inputMap(map);	//map을 매개변수로
		for(String s : map.keySet()) {	//합산 및 출력
			sum1 += map.get(s);
			System.out.println(s+":"+map.get(s));
		}
		System.out.println("합계:"+sum1);	//합계 출력
		//2.
		System.out.println("--map 리턴 메서드--");
		HashMap<String, Integer> map1 = me.inputMap2();	//메서드 내의 map을 map1으로 넣기
		for(String s : map1.keySet()) {	//합산 및 출력
			sum2 += map1.get(s);
			System.out.println(s+":"+map1.get(s));
		}
		System.out.println("합계:"+sum2);	//합계 출력
		//출력
		System.out.println("--출력 메서드--");
		me.printMap(map);	//해당 map을 출력
	
	}
	//map을 매개변수로 받는 케이스
	public void inputMap(HashMap<String, Integer> map) {
		map.put("가위", 2500);
		map.put("크레파스", 4000);
		map.put("물감", 5000);
	}
	
	//map을 내부에서 생성하여 리턴하는 케이스
	public HashMap<String, Integer> inputMap2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("가위", 3500);
		map.put("크레파스", 5000);
		map.put("물감", 6000);
		return map;
	}
	
	//map을 받아서 출력하는 메서드
	public void printMap(HashMap<String, Integer> map) {
		for(String s : map.keySet()) {
			System.out.println(s+":"+map.get(s));
		}
	}

}
