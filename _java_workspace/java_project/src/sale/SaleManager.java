package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	private ArrayList<Sale> menu = new ArrayList<Sale>();
	private ArrayList<Order> order = new ArrayList<Order>();
	public void addMenu(Scanner scan) {
		System.out.println("품명>");
		String menu = scan.next();
		System.out.println("가격>");
		int price = scan.nextInt();
		Sale s = new Sale(menu,price);
		this.menu.add(s);
		System.out.println("추가완료.");
	}
	public void delMenu(Scanner scan) {
		System.out.println("삭제할 품명>");
		String menu = scan.next();
		for(int i=0;i<this.menu.size();i++) {
			if(menu.equals(this.menu.get(i).getMenu())) {
				this.menu.remove(i);
				System.out.println("삭제완료.");
				return;
			}
		}
		System.out.println("잘못된 품명");
	}
	public void modMenu(Scanner scan) {
		System.out.println("수정할 품명");
		String menu = scan.next();
		for(int i=0;i<this.menu.size();i++) {
			if(menu.equals(this.menu.get(i).getMenu())) {
				System.out.println("가격>");
				this.menu.get(i).setPrice(scan.nextInt());
				System.out.println("수정완료.");
				return;
			}
		}
		System.out.println("잘못된 품명");
	}
	public void printMenu() {
		System.out.println("--메뉴리스트--");
		for(Sale tmp : menu) {
			System.out.println(tmp);
		}
	}
	public void orderMenu(Scanner scan) {
		System.out.println("주문할 품명>");
		String menu = scan.next();
		for(int i=0;i<this.order.size();i++) {
			if(menu.equals(order.get(i).getMenu())) {
				System.out.println("주문할 수량>");
				int count1 = scan.nextInt();
				int count2 = count1+order.get(i).getCount();
				int price = this.menu.get(i).getPrice();
				int total = price*count1+order.get(i).getTotal();
				Order o = new Order(menu, price, count2, total);
				this.order.set(i, o);
				System.out.println("주문완료");
				return;
			}
		}
		for(int i=0;i<this.menu.size();i++) {
			if(menu.equals(this.menu.get(i).getMenu())) {
				System.out.println("주문할 수량>");
				int count = scan.nextInt();
				int price = this.menu.get(i).getPrice();
				int total = price*count;
				Order o = new Order(menu,price,count,total);
				this.order.add(o);
				System.out.println("주문완료");
				return;
			}
		}
		System.out.println("잘못된 품명");
	}
	public void printOrder() {
		int sum = 0;
		System.out.println("--주문내역--");
		for(Order tmp : order) {
			System.out.println(tmp);
			sum += tmp.getTotal();
		}
		System.out.println("-------------");
		System.out.println("Total:"+sum);
	}

}
