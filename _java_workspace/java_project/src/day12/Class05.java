package day12;

public class Class05 {
	
	/* 생성자 : 객체를 생성 시 값을 초기화 하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 int => 0, String => null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 		private String name = "홍길동";
	 * 3. 초기화 블럭 : {  } 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자(최고 우선순위)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent es = new EzenStudent("인천","김", "자바", "001");
		//toString()메서드가 없으면 객체의 주소가 출력
		//toString()메서드가 있으면 toString()가 출력
		System.out.println(es); //es.toString() 같은 의미
		
		//4명추가
		EzenStudent es1 = new EzenStudent("강남","안","자바","002");
		EzenStudent es2 = new EzenStudent("인천","최","자바","003");
		EzenStudent es3 = new EzenStudent("인천","박","자바","004");
		EzenStudent es4 = new EzenStudent("인천","이","자바","005");
		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		
		//학생정보를 담을 배열을 생성
		//studentArr[0] = es;
		EzenStudent[] studentArr = new EzenStudent[5];
		studentArr[0] = es;
		studentArr[1] = es1;
		studentArr[2] = es2;
		studentArr[3] = es3;
		studentArr[4] = es4;
		
		//최 학생이 듣고 있는 과목을 출력
		String searchName = "최";
		System.out.println("--"+searchName+"학생이 듣고 있는 과목정보--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getName().equals(searchName)) {
				System.out.println(studentArr[i].getClss());
			}
		}
		
		//안이 자바를 들으려고 했는데 빅데이터로 변경 => 안 정보 출력
		String modify = "안";
		System.out.println("--"+modify+"과목 변경--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getName().equals(modify)) {
				studentArr[i].setClss("빅데이터");
				System.out.println(studentArr[i].toString());
			}
		}
		
		//자바를 듣고 있는 학생명단을 출력
		String subject = "자바";
		System.out.println("--"+subject+" 듣는 학생--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getClss().equals(subject)) {
				System.out.println(studentArr[i].toString());
			}
		}
		
		//파이썬을 듣고 있는 학생명단을 출력 / 학생이 없으면 명단이 없습니다, 출력
		String subject2 = "파이썬";
		int cnt = 0;
		System.out.println("--"+subject2+" 듣는 학생--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getClss().equals(subject2)) {
				System.out.println(studentArr[i].toString());
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("명단이 없습니다.");
		}
		
	}

}

class EzenStudent{
	//학생 정보를 생성하는 클래스
	private String zizeom = "Incheon"; //명시적 초기값
	private String name; //기본 초기값 null
	private String clss;
	private String tel;
	
	//생성자
	public EzenStudent() {} //기본 생성자

	public EzenStudent(String zizeom, String name, String clss, String tel) {
		//super(); // 내 부모 클래스의 생성자 호출
		this.zizeom = zizeom;
		this.name = name;
		this.clss = clss;
		this.tel = tel;
	}
	
	{
		//초기화 블럭 영역
		zizeom = "인천";
		name = "미상";
		clss = "미정";
		tel = "___";
	}

	//toString() : print()와 비슷한 일을 함
	@Override
	public String toString() {
		return zizeom+"> "+ name + "(" + clss + "/" + tel + ")";
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClss() {
		return clss;
	}

	public void setClss(String clss) {
		this.clss = clss;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}