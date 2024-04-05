package day06;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루기 위한 클래스 => 참조변수
		 * String str = new String();
		 * String str = "홍길동"; //일반 자료형처럼 이용가능
		 */
		String str = "홍길동!!!!";
		System.out.println(str);
		String str1 = new String();
		str1 = "홍길순";
		System.out.println(str1);
		
		//length : 전체 글자의 길이 (총글자수)
		System.out.println("--length--");
		System.out.println(str.length());
		
		//charAt(index) : index번지에 있는 문자열은 반환
		System.out.println("--charAt(index)--");
		System.out.println(str.charAt(1));
		
		//subString : 문자열을 추출
		System.out.println("--subString--");
		System.out.println(str.substring(1,3)); //1번지부터 3번지까지 추출(3번지는 포함하지 않음)
		System.out.println(str.substring(1));	//1번지부터 끝까지
		
		//str.compareTo(str1) : str과 str1을 비교하여 앞이면 -1, 같으면 0, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("banana".compareTo("apple"));
		System.out.println("a".compareTo("g"));
		
		//concat : 이어붙이기(+연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("Hello".concat("java"));
		System.out.println("Hello" + "java");
		
		//equals : 두 문자열이 같은지 비교(대소문자구분) 같으면 true, 다르면 false
		//문자는 ==로 비교가 안됨
		//참조변수는 ==로 비교하게 되면 주소가 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		
		//contains : 해당 문자를 포함하는지 체크 boolean
		System.out.println("--contains--");
		String file = "이것이자바다.java";
		System.out.println(file.contains("java"));
		
		//indexOf ; 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		//lastIndexof : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("--indexOf--");
		System.out.println(str.indexOf("동"));
		System.out.println(str.indexOf("!"));
		System.out.println(str.lastIndexOf("!"));
		System.out.println(str.indexOf("$"));
		
		//이메일에서 id를 추출
		String email = "java987@naver.com";
		System.out.println(email.substring(0,email.indexOf("@")));

	}

}
