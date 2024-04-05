package day08;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {11,2,3,5,7,8,4,6,1,10,15,13,12};
		
		printArray(arr);
		System.out.println();
		sortArray(arr);
		System.out.println("---정렬 후---");
		printArray(arr);
		System.out.println();
		System.out.println("---배열 리턴 후 출력--");
		printArray(sortArray1(arr));
		System.out.println();
		System.out.println("---랜덤 후 정렬---");
		printArray(sortArray1(randomArray()));
		
	}
	
	/* 주어진 정수배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열
	 * 리턴타입 : 출력 => void
	 * 메서드명 : printArray
	 * 5개씩 한 줄에 나열
	 */
	public static void printArray(int x[]) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
			if((i+1)%5==0) { 
				System.out.println();
			}
		}
		
		return;
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수 : 배열
	 * 리턴타입 : void
	 * 메서드명 : sortArray
	 */
	public static void sortArray(int x[]) {
		for(int i=0;i<x.length-1;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					int tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
	}
	
	// 정렬 후 배열을 리턴
	public static int[] sortArray1(int x[]) {
		for(int i=0;i<x.length-1;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					int tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
		return x;
	}
	
	/* randomArray
	 * 배열을 생성하여[10개] 랜덤 값(1~50까지의)을 채우고 해당 배열을 리턴
	 * 매개변수 : x
	 * 리턴타입 : 배열
	 */
	public static int[] randomArray() {
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*50)+1;
		}
		
		return arr;
	}

}
