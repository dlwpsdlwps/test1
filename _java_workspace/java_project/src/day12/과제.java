package day12;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("가");
		s.setTel("010-1111-1111");
//		s.printInfo();
//		s.printAcademy();
//		s.printCls();
		
		Student s1 = new Student("나","010-2222-2222","incheon");
//		s1.printInfo();
//		s1.printAcademy();
		s1.insertCls("자바", "5개월");
		s1.insertCls("html", "5개월");
//		s1.printCls();
		
		Student s2 = new Student("다","000101","010-3333-3333","25","seoul");
//		s2.printInfo();
//		s2.printAcademy();
		s2.insertCls("자바", "5개월");
//		s2.printCls();
		
		Student[] std = new Student[8];
		std[0]=s;
		std[1]=s1;
		std[2]=s2;
		//5명 추가 총 8명
		std[3] = new Student("라", "010-4444-4444", "incheon");
		std[3].insertCls("자바", "5개월");
		std[4] = new Student("마", "010-5555-5555", "incheon");
		std[4].insertCls("파이썬", "4개월");
		std[5] = new Student("바", "010-6666-6666", "incheon");
		std[5].insertCls("자바", "5개월");
		std[5].insertCls("파이썬", "4개월");
		std[6] = new Student("사", "010-7777-7777", "incheon");
		std[6].insertCls("자바", "5개월");
		std[6].insertCls("html", "5개월");
		std[6].insertCls("파이썬", "4개월");
		std[7] = new Student("아", "010-8888-8888", "incheon");
		
		System.out.println(">>이름검색<<");
		String searchName = "라";
		//라 학생의 학생정보, 학원정보, 수강정보를 출력
//		int cnt = 0;
		for(int i=0;i<std.length;i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printAcademy();
				std[i].printCls();
				System.out.println();
			}
		}
		System.out.println("----------------------------------");
		//인천지점의 학생들을 모두 검색하여 학생정보만 출력
		System.out.println(">>지점검색<<");
		String searchLoc = "incheon";
		for(int i=0;i<std.length;i++) {
			if(std[i].getLoc()!=null) { //equals는 String값만 비교하지 null과는 비교하지 못한다 (Exception)
				if(std[i].getLoc().equals(searchLoc)) {
					std[i].printInfo();
					System.out.println();
				}
			}
		}
		System.out.println("----------------------------------");
		//자바과목을 수강하는 학생들만 검색하여 학생정보, 학원정보 출력
		System.out.println(">>과목검색<<");
		String searchCls = "자바";
		for(int i=0;i<std.length;i++) {
			for(int j=0;j<std[i].getCls().length;j++) {
				if(std[i].getCls()[j]!=null) {
					if(std[i].getCls()[j].equals(searchCls)) {
						std[i].printInfo();
						std[i].printAcademy();
						std[i].printCls();
						System.out.println();
					}
					
				}
			}
		}
		System.out.println("----------------------------------");

	}

}
/* - 학생 정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원 정보 : 학원 명="EZEN"(final static), 지점
 * - 수강 정보 : 수강과목, 기간(개월 수)
 * 	=> 여러과목 들을 수 있음 (여러과목 수강하기 위해서는 배열로 처리, 5과목 까지 가능)
 * 
 * ex)	홍길동 000101 010-1111-1111 25
 * 		EZEN(인천)
 * 		자바 6개월, 파이썬 1개월, 빅데이터 3개월
 * 기능 (메서드)
 * - 학생기본정보 출력하는 기능
 * - 학원정보를 출력하는 기능
 * - 수강정보를 출력하는 기능
 * - 학생의 수강정보를 추가하는 기능
 */
class Student{
	private String name;
	private String bir;
	private String tel;
	private String age;
	private final static String ACA = "EZEN";
	private String loc;
	private String cls[] = new String[5];
	private String per[] = new String[5];
	private int cnt; //배열의 index 처리용 변수
	//생성자
	public Student() {}
	
	public Student(String name, String tel, String loc) {
		this.name = name;
		this.tel = tel;
		this.loc = loc;
	}
	public Student(String name, String bir, String tel, String age, String loc) {
		this(name, tel, loc); //생성자 호출(생성자의 첫 라인에서만 호출 가능)
		this.bir = bir;
		this.age = age;
	}
	//학생정보출력
	public void printInfo() {
//		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세 "+bir+") /"+tel);
	}
	//학원정보출력
	public void printAcademy() {
//		System.out.println("--학원정보--");
		System.out.println("학원명:"+ACA+" / "+loc+"지점");
	}
	//수강정보출력
	public void printCls() {
		//cnt까지만 출력 => 추가되지 않은 출력x
//		System.out.println("--수강정보--");
		if(cls.length==0||cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return; //여기서 메서드 종료
		}
		for(int i=0;i<cnt;i++) {
			System.out.println("과정:"+cls[i]+"("+per[i]+")");
		}
	}
	//수강정보등록
	//insertCls()
	//매개변수 cls, per 주고 => 배열에 추가
	public void insertCls(String cls,String per) {
		//cnt = 0 => 아직 추가값이 없음
		if(cnt>=5) {
			//배열을 더 늘려 더 망ㅎ은 수강을 받을 수도 있음 (배열복사)
			System.out.println("더 이상 수강하실 수 없습니다.");
			return;
		}
		this.cls[cnt] = cls;
		this.per[cnt] = per;
		cnt++;
	}
	
	//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBir() {
		return bir;
	}

	public void setBir(String bir) {
		this.bir = bir;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String[] getCls() {
		return cls;
	}

	public void setCls(String[] cls) {
		this.cls = cls;
	}

	public String[] getPer() {
		return per;
	}

	public void setPer(String[] per) {
		this.per = per;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getAca() {
		return ACA;
	}
	
	
}