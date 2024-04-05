package std;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		/* Student List 버전
		 * 1.학생추가|2.학생리스트|3.학생검색|4.학생수정|5.학생삭제|
		 * 6.점수추가|7.점수수정|8.점수삭제|9.종료
		 * 
		 * Student 클래스
		 * 학생정보 /
		 * 과목, 점수 (map) - 영어 단어장과 비슷
		 * 
		 * manager => 학생을 list로 구성 => 메뉴 내용 처리
		 * 
		 * list, map, class, interface
		 */
		Scanner scan = new Scanner(System.in);
		StdManager sm = new StdManager();
		int menu = 0;
		do {
			System.out.println("1.학생추가|2.학생리스트|3.학생검색|4.학생수정|5.학생삭제|\r\n"
					+ "6.점수추가|7.점수수정|8.점수삭제|9.종료");
			System.out.println("입력>");
			menu = scan.nextInt();
			switch(menu) {
			case 1: sm.addStd(scan); break;
			case 2: sm.printStd(); break;
			case 3: sm.searchStd(scan); break;
			case 4: sm.modStd(scan); break;
			case 5: sm.delStd(scan); break;
			case 6: sm.addSub(scan); break;
			case 7: sm.modSub(scan); break;
			case 8: sm.delSub(scan); break;
			case 9: System.out.println("종료."); break;
			default: System.out.println("올바르지 않은 입력입니다."); break;
			}
		}while(menu!=9);
		
		scan.close();

	}

}
