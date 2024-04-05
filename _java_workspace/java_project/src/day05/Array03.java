package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,56,78,89,48,62,93,50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * Math.max Math.min
		 * if문
		 */
		int sum = 0;
		int max = 0;
		int min = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+sum/(double)arr.length);
//		System.out.println("최대:"+max);
//		System.out.println("최소:"+min);
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/(double)arr.length);
		System.out.println("최대:"+max);
		System.out.println("최소:"+min);
		

	}

}
