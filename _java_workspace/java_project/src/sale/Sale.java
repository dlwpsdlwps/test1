package sale;

public class Sale {
	private String menu;
	private int price;
	//생성자
	public Sale() {}
	public Sale(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	//g/s
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "품명:"+menu+" 가격:"+price;
	}
	

}
