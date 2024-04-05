package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();

	public void add(Scanner scan) {
		// 제품 추가
		System.out.println("품명>");
		String name = scan.next();
		System.out.println("가격>");
		int price = scan.nextInt();
		Sale<String, Integer> s  = new Sale<String, Integer>(name,price);
		menu.add(s);
		System.out.println("제품 추가 완료.");
	}

	public void menuPrint() {
		// 제품 리스트
		System.out.println("--리스트--");
		for(Sale<String, Integer> tmp : menu) {
			System.out.println(tmp);
		}
	}

	public void orderPick(Scanner scan) {
		// 입력받는 값은 제품명, 수량
		// 제품명 가격*수량 (지불금액)을 order 추가
		// 햄버거 5 => 햄버거 25000
		int orderCnt = 0;
		System.out.println("주문할 품명>");
		String name = scan.next();
		int price = 0;
		for(Sale<String, Integer> tmp : menu) {
			if(name.equals(tmp.getMenu())) {
				price = tmp.getPrice();
				orderCnt++;
			}
		}
		if(orderCnt==0) {
			System.out.println("잘못된 품명입니다.");
			return;
		}
		System.out.println("주문 수량>");
		int cnt = scan.nextInt();
		price = price*cnt;
		Sale<String, Integer> s  = new Sale<String, Integer>(name,price);
		order.add(s);
		System.out.println("주문 완료.");
	}
	
	public void orderPick2(String name, int count) {
		for(int i=0;i<menu.size();i++) {
			String ProductMenu = menu.get(i).getMenu();
			int ProductPrice = menu.get(i).getPrice();
			if(ProductMenu.equals(name)) {
				int index = orderSearch(name);
				if(index != -1) {
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+(ProductPrice*count));
					return;
				}
				//주문한적 없는 메뉴일 경우
				Sale p = new Sale(ProductMenu, (ProductPrice*count));
				order.add(p);
			}
		}
	}
	
	public int orderSearch(String name) {
		//name = 주문메뉴
		int index = -1;
		for(int i=0;i<order.size();i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void orderPrint() {
		// 주문내역 출력
		// 총 지불금액 출력
		int sum = 0;
		System.out.println("--주문내역--");
		for(Sale<String, Integer> tmp : order) {
			System.out.println(tmp);
		}
		System.out.println("--총 지불금액--");
		for(Sale<String, Integer> tmp : order) {
			sum += tmp.getPrice();
		}
		System.out.println("Total : "+sum);
	}
	
	public void orderPrint2() {
		int sum = 0;
		for(Sale tmp : order) {
			System.out.println(tmp);
			sum += (int)tmp.getPrice();
		}
		System.out.println("Total:"+sum);
	}
	

}
