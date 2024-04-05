package studentmanager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* 객체를 생성하고 화면에 출력하는 클래스
		 * - menu :
			1. 학생 등록 | 2. 학생리스트 출력| 3. 학생 검색(학생정보,수강정보)
			4. 수강신청 | 5.수강철회 | 6.종료
		 */
		Scanner scan = new Scanner(System.in); 
		StudentManager sm = new StudentManager();
//		sm.insertStrudent(scan);
		int menu = 0;
		
		while(menu!=6) {
			System.out.println("1.학생등록|2.학생리스트|3.학생검색|4.수강신청|5.수강철회|6.종료");
			System.out.print("메뉴입력 > ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				sm.insertStudent(scan);
				break;
			case 2:
				sm.printStudent();
				break;
			case 3:
				sm.searchStudent(scan);
				break;
			case 4:
				sm.registerSubject(scan);
				break;
			case 5:
				sm.deleteSubject(scan);
				break;
			case 6:
				System.out.println("종료.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
		scan.close();
		
	}

}
