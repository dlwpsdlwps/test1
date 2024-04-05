package day16;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 생성된 배열 출력
		int arr[] = null;
		Exception06 ex = new Exception06();
		
		try {
			arr = ex.arrMaker(1, 5, 10);
			for(int i: arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			arr = null;
			ex.arrMaker2(1, 5, arr);
			for(int i : arr) {
				System.out.print(i+" ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}


//메서드 생성
/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여
 * 랜덤 값을 채워 배열을 리턴
 * 랜덤 값의 범위는 매개변수 입력 start(시작값), count(개수)
 * - size가 0보다 작다면 예외발생
 * - count개수가 0보다 작다면 예외발생
 */
public int[] arrMaker(int start, int count, int size) {
	if(size<0)
		throw new RuntimeException("size가 0보다 작습니다.");
	if(start<0)
		throw new RuntimeException("start가 0보다 작습니다.");
	int arr[] = new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i] = (int)((Math.random()*count)+start);
	}
	return arr;
}
//메서드 생성
/* 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
 * - 배열이 null이면 예외발생
 * - 배열의 길이가 0보다 작다면 예외발생
 */
public void arrMaker2(int start, int count, int arr[]) {
	if(arr==null)
		throw new RuntimeException("null입니다.");
	if(arr.length<0)
		throw new RuntimeException("배열의 길이가 0보다 작습니다.");
	for(int i=0;i<arr.length;i++) {
		arr[i] = (int)((Math.random()*count)+start);
	}
}
}