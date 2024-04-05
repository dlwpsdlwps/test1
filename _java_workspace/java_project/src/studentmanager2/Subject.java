package studentmanager2;

public class Subject {
	private String subName;
	private int subTime;
	private String subProfessor;
	private String subScheduler;
	//생성자
	public Subject() {}
	//과목명만
	public Subject(String subName) {
		this.subName = subName;
	}
	//모두
	public Subject(String subName, int subTime, String subProfessor, String subScheduler) {
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
	}
	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	@Override
	public String toString() {
		return "[과목명:" + subName + ", 시수:" + subTime + ", 담당교수:" + subProfessor
				+ ", 시간표:" + subScheduler + "]";
	}
}
