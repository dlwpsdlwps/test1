package sale;

public class Order extends Sale{
	private int count;
	private int total;
	//생성자
	public Order() {}
	public Order(String menu, int price, int count, int total) {
		super(menu, price);
		this.count = count;
		this.total = total;
	}
	//g/s
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "품명:"+super.getMenu()+" 가격:"+super.getPrice()+" 수량:"+count+" 지불금액:"+total;
	}
	

}
