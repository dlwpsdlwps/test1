package studentmanager;

import java.util.Scanner;

public class StudentManager implements Program {
	//실제 객체들을 운영하는 클래스 implements class
	private Student[] st = new Student[5];
	private int stCnt;
	
	//학생정보출력
	@Override
	public void printStudent() {
		for(int i=0;i<stCnt;i++) {
			st[i].stPrint();
			st[i].sbPrint();
		}
		System.out.println("-------------------------------");
	}
	
	//학생등록
	@Override
	public void insertStudent(Scanner scan) {
		Student s = new Student();
		System.out.println("학번 > ");
		s.setStNum(scan.next());
		System.out.println("이름 > ");
		s.setStName(scan.next());
		System.out.println("나이 > ");
		s.setStAge(scan.next());
		System.out.println("연락처 > ");
		s.setStTel(scan.next());
		System.out.println("주소 > ");
		s.setStAddress(scan.next());
		System.out.println("-------------------------------");
		st[stCnt] = s;
		stCnt++;
	}

	//학생검색
	@Override
	public void searchStudent(Scanner scan) {
		int cnt = 0;
		System.out.println("검색할 이름 > ");
		String searchName = scan.next();
		
		for(int i=0;i<stCnt;i++) {
			if(st[i].getStName().equals(searchName)) {
				st[i].stPrint();
				st[i].sbPrint();
				cnt++;
			}
		}
		if(cnt!=0) System.out.println("-------------------------------");
		if(cnt==0) {
			System.out.println("검색한 이름이 없습니다.");
			System.out.println("-------------------------------");
		}
	}

	//수강신청
	@Override
	public void registerSubject(Scanner scan) {
		int index = -1;
		System.out.println("수강신청 학생이름 > ");
		String searchName = scan.next();
		
		for(int i=0;i<stCnt;i++) {
			if(st[i].getStName().equals(searchName)) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("해당 학생이 없습니다.");
		}else {
			Subject s = new Subject();
			System.out.println("코드 > ");
			s.setSbCode(scan.next());
			System.out.println("과목명 > ");
			s.setSbName(scan.next());
			System.out.println("학점 > ");
			s.setSbScore(scan.nextDouble());
			System.out.println("시수 > ");
			s.setSbTime(scan.nextInt());
			System.out.println("교수 > ");
			s.setSbProfssor(scan.next());
			System.out.println("학기 > ");
			s.setSbSemester(scan.next());
			System.out.println("시간표 > ");
			s.setSbSchedule(scan.next());
			System.out.println("강의실 > ");
			s.setSbClass(scan.next());
			st[index].sbInsert(s);
		}
	}

	//수강철회
	@Override
	public void deleteSubject(Scanner scan) {
		int index = 0;
		System.out.println("수강철회할 학생이름 > ");
		String searchName = scan.next();
		
		for(int i=0;i<stCnt;i++) {
			if(st[i].getStName().equals(searchName)) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("해당 학생이 없습니다.");
		}else {
			System.out.println("취소할 과목명 > ");
			String sbName = scan.next();
			st[index].sbDelete(sbName);
		}
	}

}
