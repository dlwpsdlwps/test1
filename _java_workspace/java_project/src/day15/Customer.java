package day15;

public class Customer {
	
	/* 일반고객 / Gold고객(할인) / VIP고객(할인)
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스적립률 : double bonusRatio
	 * 
	 * 클래스 생성
	 * - 기본 customerGrade = "Silver"
	 * - bonusRatio = 0.01 => 1% 적립
	 * 
	 * - 메서드
	 * 1. 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price))
	 * => 구매 금액을 주고 적립 보너스를 계산 bonusPoint에 누적
	 * => 보너스 적립, 할인여부를 체크해서 구매 price를 리턴
	 * 
	 * 2. 출력메서드(메서드명 : customerInfo())
	 * => 홍길동님 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 *    전담 상담사 번호는 1111입니다. - VIP고객만 출력
	 * 
	 * - Silver 등급
	 *   => 제품을 구매할 때 0% 할인 / 보너스 포인트 1% 적립
	 * - Gold 등급
	 *   => 제품을 구매할 때 10% 할인 / 보너스 포인트 2% 적립
	 * - VIP 등급
	 *   => 제품을 구매할 때 10% 할인 / 보너스 포인트 5% 적립
	 *   => 전담 상담사를 멤버변수에 추가(int agentID)
	 *   
	 *   GoldCustomer extends Customer{
	 *   	기본 메서드를 오버라이딩 하여 사용
	 *   }
	 *   
	 *   VIPCustomer extends Customer{
	 *   	기본 메서드를 오버라이딩 하여 사용
	 *   }
	 *   
	 *   CustomerMain 클래스에서 확인
	 * 
	 */
	//멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	//생성자
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	//메서드
	//1. 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price))
	//=> 구매 금액을 주고 적립 보너스를 계산 bonusPoint에 누적
	//=> 보너스 적립, 할인여부를 체크해서 구매 price를 리턴
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	//2. 출력메서드(메서드명 : customerInfo())
	//=> 홍길동님 등급은 VIP이며, 보너스 포인트는 1000입니다.
	//   전담 상담사 번호는 1111입니다. - VIP고객만 출력
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
	//g/s
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	//toString
	@Override
	public String toString() {
		return "고객ID=" + customerID + ", 이름=" + customerName + ", 등급="
				+ customerGrade + ", 보너스포인트=" + bonusPoint + ", 적립률=" + bonusRatio;
	}
}
