package day13;

import java.util.Scanner;

//Product 클래스 생성 : 상품을 등록하는 클래스
//멤버변수 : 상품명, 가격
//생성자
//상품추가 메서드
//상품출력 메서드(toString)

public class 과제 {

	public static void main(String[] args) {
		//상품을 10개 등록 가능한 배열 생성
		//스캐너를 이용하여 상품을 등록받기
		//등록한 상품 출력
		Scanner scan = new Scanner(System.in);
		Product[] menu = new Product[10];
		char ans = 0;
		int cnt = 0;
		
		//상품을 등록하시겠습니까(y/n)? y => 등록 / n => 그만
		//n을 누르면 등록한 상품 출력
		
		while(ans!='n') {
			System.out.println("상품을 등록하시겠습니까? y/n");
			ans = scan.next().charAt(0);
			
			if(ans=='y') {
				System.out.println("상품명 > ");
				String name = scan.next();
				System.out.println("가격 > ");
				String price = scan.next();
				
				menu[cnt] = new Product();
				menu[cnt].proAdd(name, price);
				cnt++;
				if(cnt==menu.length) ans = 'n';
			}else {
				if(ans=='n') {
					System.out.println("종료");
				}else {
					System.out.println("y나 n만 입력가능");
				}
			}
		}
		for(int i=0;i<cnt;i++) {
			System.out.println(menu[i]);
		}
		
		scan.close();
		
		
	}

}

class Product{
	private String name;
	private String price;
	//생성자
	public Product() {}
	
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}
	//상품등록
	public void proAdd(String name, String price) {
		this.name = name;
		this.price = price;
	}
	//출력
	@Override
	public String toString() {
		return "품명:" + name + ", 가격:" + price;
	}
	//g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}