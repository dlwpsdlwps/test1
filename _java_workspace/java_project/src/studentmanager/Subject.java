package studentmanager;

public class Subject {
	/*
	- Subject class : 하나의 수강과목정보를 저장하는 클래스
	- 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표, 강의장
	- 멤버변수, 생성자, 게터/세터, toString
	 */
	private String sbCode;
	private String sbName;
	private double sbScore;
	private int sbTime;
	private String sbProfssor;
	private String sbSemester;
	private String sbSchedule;
	private String sbClass;
	
	//생성자
	public Subject() {}
	public Subject(String sbCode, String sbName, double sbScore, int sbTime, String sbProfssor, String sbSemester,
			String sbSchedule, String sbClass) {
		super();
		this.sbCode = sbCode;
		this.sbName = sbName;
		this.sbScore = sbScore;
		this.sbTime = sbTime;
		this.sbProfssor = sbProfssor;
		this.sbSemester = sbSemester;
		this.sbSchedule = sbSchedule;
		this.sbClass = sbClass;
	}
	
	//게터세터
	public String getSbCode() {
		return sbCode;
	}
	public void setSbCode(String sbCode) {
		this.sbCode = sbCode;
	}
	public String getSbName() {
		return sbName;
	}
	public void setSbName(String sbName) {
		this.sbName = sbName;
	}
	public double getSbScore() {
		return sbScore;
	}
	public void setSbScore(double sbScore) {
		this.sbScore = sbScore;
	}
	public int getSbTime() {
		return sbTime;
	}
	public void setSbTime(int sbTime) {
		this.sbTime = sbTime;
	}
	public String getSbProfssor() {
		return sbProfssor;
	}
	public void setSbProfssor(String sbProfssor) {
		this.sbProfssor = sbProfssor;
	}
	public String getSbSemester() {
		return sbSemester;
	}
	public void setSbSemester(String sbSemester) {
		this.sbSemester = sbSemester;
	}
	public String getSbSchedule() {
		return sbSchedule;
	}
	public void setSbSchedule(String sbSchedule) {
		this.sbSchedule = sbSchedule;
	}
	public String getSbClass() {
		return sbClass;
	}
	public void setSbClass(String sbClass) {
		this.sbClass = sbClass;
	}
	
	//toString
	@Override
	public String toString() {
		return " [코드:" + sbCode + ", 과목명:" + sbName + ", 학점:" + sbScore + ", 시수:" + sbTime
				+ ", 교수:" + sbProfssor + ", 학기:" + sbSemester + ", 시간표:" + sbSchedule
				+ ", 강의실:" + sbClass + "]";
	}
	
	
}
