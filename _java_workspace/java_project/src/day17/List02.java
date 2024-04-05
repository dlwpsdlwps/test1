package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 정렬하여 출력
		 */
		String arr1[] = new String[] {"a","c","f","b"};
		String arr2[] = new String[] {"d","g","h","k"};
		ArrayList<String> list = new ArrayList<String>();
		for(int i=1;i<=2;i++) {
			for(int j=0;j<4;j++) {
				if(i==1) list.add(arr1[j]);
				else list.add(arr2[j]);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(list);
	}

}
