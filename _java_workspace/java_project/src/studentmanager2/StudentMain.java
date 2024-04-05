package studentmanager2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 메뉴 처리
		//객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
		Scanner scan = new Scanner(System.in);
		//manager 호출하기 위한 객체
		StudentManager sm = new StudentManager();
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2.학생리스트 | 3.학생검색(학생정보,수강정보)");
			System.out.println("4.수강신청 | 5.수강철회 | 6.종료");
			System.out.println(">> 메뉴선택 >");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: sm.insertStudent(scan); break;
			case 2: sm.printStudent(); break;
			case 3: sm.searchStudent(scan); break;
			case 4: sm.registerSubject(scan); break;
			case 5: sm.deleteSubject(scan); break;
			case 6: System.out.println("종료."); break;
			default: System.out.println("잘못된 입력입니다."); break;
			}
			
		}while(menu!=6);
		
		
		scan.close();

	}

}
