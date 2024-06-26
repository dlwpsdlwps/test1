package day20;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * 
		 */
		int[] arr = {1,8,4,5,7,8,9,6,5,4,1,2,3,6,8,2,4};
		//짝수만, 정렬, 중복 값 제거
		Arrays.stream(arr)
		.distinct()
		.filter(n->n%2==0)
		.sorted()
		.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		//배열로 리턴
		int[] result = Arrays.stream(arr)
		.filter(n->n%2==1)
		.sorted()
		.distinct()
		.toArray();
		
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}

	}

}
