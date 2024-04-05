package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정
		 * 4.메뉴보기|5.주문|6.주문내역|7.종료
		 */
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정\r\n"
					+ "4.메뉴보기|5.주문|6.주문내역|7.종료");
			System.out.println("메뉴입력>");
			menu = scan.nextInt();
			switch(menu) {
			case 1: sm.addMenu(scan); break;
			case 2: sm.delMenu(scan); break;
			case 3: sm.modMenu(scan); break;
			case 4: sm.printMenu(); break;
			case 5: sm.orderMenu(scan); break;
			case 6: sm.printOrder(); break;
			case 7: System.out.println("종료."); break;
			default: System.out.println("잘못된 입력입니다."); break;
			}
		}while(menu!=7);
		
		scan.close();

	}

}
