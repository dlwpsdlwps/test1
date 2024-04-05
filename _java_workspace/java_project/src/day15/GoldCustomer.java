package day15;

public class GoldCustomer extends Customer {
	//생성자
	public GoldCustomer() {	}
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio= 0.02;
	}
	//메서드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price -= price*0.1;
		return price;
	}
}
