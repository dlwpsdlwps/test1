package day07;

public class String02 {

	public static void main(String[] args) {
		//String method

		String str = "홍길동~~~~!!!!!";
		String str1 = "";
		
		//trim : 불필요한 공백을 제거
		System.out.println("--trim--");
		System.out.println("     hello     ".trim());
		
		//toLowerCase(), toUpperCase() : 대소문자 변환
		System.out.println("--toLowerCase()--");
		System.out.println("toLowercase".toLowerCase()); // 소문자로 변환
		System.out.println("toLowercase".toUpperCase()); // 대문자로 변환

		//isEmpty() : 객체가 비어있는지 체크 비어있으면 true
		System.out.println("--isEmpty()--");
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		
		//replace : 글자를 치환(변환)
		System.out.println("--replace--");
		String str2 = "banana,apple,kiwi";
		System.out.println(str2.replace(",","/"));
		
		//split : 특정 값을 기준으로 나누기 => 배열로 리턴
		System.out.println("--split--");
		String[] arr1 = str2.split(",");
		//System.out.print(arr);
		for(String s : arr1) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		// Integer.parseInt 문자를 숫자로 변환
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2); // 연결연산자 역할
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		//String.valueOf() : 숫자를 문자로 변환
		int a = 12345;
		String as = String.valueOf(a);
		System.out.println(as);
		System.out.println(as instanceof String);
		
		
	}

}