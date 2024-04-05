package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된 for / iterator 출력
		 * import 단축키 ctrl+shift+o
		 */
		ArrayList<String> routine = new ArrayList<String>();
		routine.add("2.aaaaaaaaaa");
		routine.add("3.bbbbbbbbbb");
		routine.add("1.cccccccccc");
		routine.add("5.dddddddddd");
		routine.add("4.eeeeeeeeee");
		//for문
		System.out.println("for문");
		for(int i=0;i<5;i++) {
			System.out.println(routine.get(i));
		}
		//향상된for문
		System.out.println("향상된 for문");
		for(String i : routine) {
			System.out.println(i);
		}
		//Iterator
		System.out.println("Iterator");
		Iterator<String> it = routine.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		//정렬
		Collections.sort(routine);
		System.out.println(routine);
		
		routine.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 (크다/작다를 이용) -/+의 값이 출력
				//문자는 compareTo 메서드를 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				return o2.compareTo(o1); //내림차순
			}
		});
		System.out.println(routine);

	}

}
