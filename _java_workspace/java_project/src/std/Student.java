package std;

import java.util.HashMap;

public class Student {
	//멤버변수 : 이름, 나이, 전화번호, map(과목+점수), 합계 평균
	//생성자, 메서드, g/s, 출력메서드
	//메서드 - 출력메서드(학생정보, 과목점수(성적표), 합계, 평균)
	//메서드 - map(과목, 점수) 데이터를 추가 put
	//메서드 - map(과목, 점수) 데이터를 삭제 remove
	//과목과 점수는 manager에서, 메서드를 나눠서 호출해도 됨
	
	//멤버변수는 private 설정 / 메서드 public
	//클래스명은 대문자로 시작, 변수명, 메서드명은 소문자로 시작
	//변수명, 메서드명에 단어가 많아지면 다음 시작단어 대문자 (카멜케이스 표기법)
	//indent : 들여쓰기 잘 맞추기
	
	private String stdname;
	private int stdage;
	private String stdnum;
	private int sum;
	private double avg;
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int subCnt;
	//생성자
	public Student() {}
	public Student(String stdname, int stdage, String stdnum) {
		this.stdname = stdname;
		this.stdage = stdage;
		this.stdnum = stdnum;
	}
	//출력메서드
	public void printStudent() {
		System.out.println("이름:"+stdname+" 나이:"+stdage+" 번호:"+stdnum);
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
			avg = sum/(double)subCnt;
		}
		System.out.println("합계:"+sum+" 평균:"+avg);
	}
	//점수추가 메서드
	public void addMap(String sub, int score) {
		map.put(sub, score);
		subCnt++;
	}
	//점수삭제 메서드
	public void delMap(String key) {
		map.remove(key);
		subCnt--;
	}
	//g/s
	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getStdage() {
		return stdage;
	}

	public void setStdage(int stdage) {
		this.stdage = stdage;
	}

	public String getStdnum() {
		return stdnum;
	}

	public void setStdnum(String stdnum) {
		this.stdnum = stdnum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	};
	
	

}
