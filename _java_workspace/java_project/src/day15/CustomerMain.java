package day15;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		
		Customer cLee = new Customer(1001, "리정혁");
		Customer cHong = new GoldCustomer(1002, "홍길동");
		Customer cKim = new VIPCustomer(1003, "김철수", 1111);
		int cnt=0;
		customerList[cnt]=cLee;
		cnt++;
		customerList[cnt]=cHong;
		cnt++;
		customerList[cnt]=cKim;
		cnt++;
		customerList[cnt]=new Customer(1004, "영이");
		cnt++;
		customerList[cnt]=new GoldCustomer(1005, "순이");
		cnt++;
		customerList[cnt]=new VIPCustomer(1006, "영철", 2222);
		cnt++;
		customerList[cnt]=new VIPCustomer(1007, "명수", 1111);
		cnt++;
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		//자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		//다운캐스팅 : 반드시 명식적으로 형변환 해야함.
		//instanceof 원래 그 형태가 맞는지 체크하는 명령어 true / false
		//agentID = 1111 => 3333 변경
		
		for(int i=0;i<cnt;i++) {
			if(customerList[i] instanceof VIPCustomer)
			{
				VIPCustomer v = (VIPCustomer)customerList[i];
				if(v.getAgentID()==1111) {
					v.setAgentID(3333);
				}
			}
		}
		
		System.out.println("--할인율과 포인트 계산");
		
		int price = 100000;
		
		for(int i=0;i<cnt;i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()+"님의 지불 금액은 "+salePrice+" / 보너스 포인트 "+customerList[i].getBonusPoint());
			System.out.println("-----------------------");
		}
		
		System.out.println("--고객 정보 출력 --");
		for(int i=0;i<cnt;i++) {
			customerList[i].customerInfo();
		}
		
		
//		Customer c = new Customer(1001,"실버");
//		System.out.println(c.calcPrice(10000));
//		System.out.println(c);
//		c.customerInfo();
//		
//		System.out.println("-----------------------");
//		
//		GoldCustomer g = new GoldCustomer(1002,"골드");
//		System.out.println(g.calcPrice(10000));
//		System.out.println(g);
//		g.customerInfo();
//		
//		System.out.println("-----------------------");
//		
//		VIPCustomer v = new VIPCustomer(1004,"브이아이피",1111);
//		System.out.println(v.calcPrice(10000));
//		System.out.println(v);
//		v.customerInfo();
	}

}
