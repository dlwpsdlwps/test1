package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성한 후
		 * 1~50핸덤수를 배열에 저장 한 후
		 * 합계, 평균, 최대값, 최소갑
		 */
		int arr[] = new int[10];
		int sum = 0;
		int max = 0;
		int min = 50;
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println();
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/(double)arr.length);
		System.out.println("max: "+max);
		System.out.println("min: "+min);		
	}

}
