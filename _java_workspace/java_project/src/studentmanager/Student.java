package studentmanager;

public class Student {
	/* 
	- Student class : 한 학생의 정보를 저장하는 클래스
		- 학번, 이름, 나이, 전화번호, 주소, 수강과목s
		- 멤버변수, 생성자, 게터/세터, toString
		- 멤버변수에 학생이 듣고자하는 과목을 저장 Subject[]
		- 메서드 : 
			- 학생정보 출력 메서드
			- 수강과목 추가 메서드
			- 수강과목 삭제 메서드
			- 수강과목 출력 메서드
	 */
	private String stNum;
	private String stName;
	private String stAge;
	private String stTel;
	private String stAddress;
	private Subject[] sbList = new Subject[5];
	private int sbCnt;

	//생성자
	public Student() {}
	public Student(String stNum, String stName, String stAge, String stTel, String stAddress) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stAge = stAge;
		this.stTel = stTel;
		this.stAddress = stAddress;
	}
	
	//메서드
	//학생정보 출력 메서드
	public void stPrint() {
		System.out.println("학번:"+stNum+" 이름:"+stName+" 나이:"+stAge+" 연락처:"+stTel+" 주소:"+stAddress);
	}
	
	//수강과목 추가 메서드
	public void sbInsert(Subject s) {
		sbList[sbCnt] = s;
		sbCnt++;
	}
	
	//수강과목 삭제 메서드
	public void sbDelete(String sbName) {
		int index = -1;
		for(int i=0;i<sbCnt;i++) {
			if(sbList[i].getSbName().equals(sbName)) {
				index = i;
			}
		}
		if(index==-1) {
			System.out.println("해당 과목이 없습니다.");
		}else {
			for(int i=index;i<sbCnt-1;i++) {
				sbList[i] = sbList[i+1];
			}
			sbList[sbCnt-1] = null;
			sbCnt--;
		}
	}
	
	//수강과목 출력 메서드
	public void sbPrint() {
		if(sbCnt==0) {
			System.out.println("수강 중인 과목이 없습니다.");
		}else {
			for(int i=0;i<sbCnt;i++) {
				System.out.print("과목"+(i+1));
				System.out.println(sbList[i]);
			}
		}
	}
	
	//게터세터
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStAge() {
		return stAge;
	}
	public void setStAge(String stAge) {
		this.stAge = stAge;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public Subject[] getSbList() {
		return sbList;
	}
	public void setSbList(Subject[] sbList) {
		this.sbList = sbList;
	}
	public int getSbCnt() {
		return sbCnt;
	}
	public void setSbCnt(int sbCnt) {
		this.sbCnt = sbCnt;
	}

	//toString
	@Override
	public String toString() {
		return "학번:" + stNum + ", 이름:" + stName + ", 나이:" + stAge + ", 연락처:" + stTel
				+ ", 주소:" + stAddress;
	}
}
