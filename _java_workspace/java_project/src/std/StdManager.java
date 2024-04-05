package std;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager implements StdProgram{
	
	private ArrayList<Student> stdList = new ArrayList<Student>();
	private int stdCnt;

	@Override
	public void printStd() {
		// TODO Auto-generated method stub
		System.out.println("--학생리스트--");
		for(int i=0;i<stdCnt;i++) {
			stdList.get(i).printStudent();
		}
	}

	@Override
	public void addStd(Scanner scan) {
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("번호>");
		String num = scan.next();
		Student s = new Student(name, age, num);
		stdList.add(s);
		stdCnt++;
	}

	@Override
	public void modStd(Scanner scan) {
		System.out.println("수정할 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				System.out.println("나이>");
				int age = scan.nextInt();
				System.out.println("번호>");
				String num = scan.next();
				Student s = new Student(name, age, num);
				stdList.set(i, s);
				return;
			}
		}
		System.out.println("찾는 이름이 없습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		System.out.println("삭제할 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				stdList.remove(i);
				stdCnt--;
				return;
			}
		}
		System.out.println("찾는 학생이 없습니다.");
	}

	@Override
	public void searchStd(Scanner scan) {
		System.out.println("찾을 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				stdList.get(i).printStudent();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("점수추가할 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				System.out.println("과목>");
				String sub = scan.next();
				System.out.println("점수>");
				int score = scan.nextInt();
				stdList.get(i).addMap(sub,score);
				return;
			}
		}
		System.out.println("찾는 학생이 없습니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		System.out.println("점수수정할 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				System.out.println("수정할 과목>");
				String sub = scan.next();
				if(stdList.get(i).getMap().containsKey(sub)) {
					System.out.println("점수>");
					int score = scan.nextInt();
					stdList.get(i).getMap().replace(sub, score);
				}else {
					System.out.println("찾는 과목이 없습니다.");
				}
				return;
			}
		}
		System.out.println("찾는 학생이 없습니다.");
	}

	@Override
	public void delSub(Scanner scan) {
		System.out.println("점수삭제할 학생 이름>");
		String name = scan.next();
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(stdList.get(i).getStdname())) {
				System.out.println("삭제할 과목");
				String sub = scan.next();
				if(stdList.get(i).getMap().containsKey(sub)) {
					stdList.get(i).delMap(sub);
				}else {
					System.out.println("찾는 과목이 없습니다.");
				}
				return;
			}
		}
		System.out.println("찾는 학생이 없습니다.");
	}

}
