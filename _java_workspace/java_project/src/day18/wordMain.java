package day18;

import java.util.Scanner;

public class wordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본단어 등록 (5가지 등록)
		 */
		int menu = 0;
		Scanner s = new Scanner(System.in);
		WordManager wm = new WordManager();
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료");
			menu = s.nextInt();
			switch(menu) {
			case 1: wm.addWord(s); break;
			case 2: wm.searchWord(s); break;
			case 3: wm.editWord(s); break;
			case 4: wm.printWord(); break;
			case 5: wm.deleteWord(s); break;
			case 6: System.out.println("종료"); break;
			default: break;
			}
		}while(menu!=6);
		s.close();

	}

}
