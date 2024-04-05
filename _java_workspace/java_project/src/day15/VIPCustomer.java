package day15;

public class VIPCustomer extends Customer {
	private int agentID;
	//생성자
	public VIPCustomer() {}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;
	}
	//메서드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= price*0.1;
		return price;
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("전담 상담사 번호는 "+agentID+"입니다.");
	}
	//g/s
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
