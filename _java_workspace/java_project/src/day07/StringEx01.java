package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력
		 * 파일명 : 이것이자바다
		 * 확장자 : java
		 * */
//		String[] arr1 = str2.split(",");
//		for(String s : arr1) {
//			System.out.print(s+" ");
//		}
//		System.out.println();
		String file = "이것이자바다.java";

		//substring
		int get = file.indexOf(".");
		System.out.println("파일명 : "+file.substring(0,get));
		System.out.println("확장자 : "+file.substring(get+1));
		
		//split
		String[] arr = file.split("[.]"); // "[.]"or"\\."
		System.out.println("파일명 : "+arr[0]);
		System.out.println("확장자 : "+arr[1]);
		
	}

}
