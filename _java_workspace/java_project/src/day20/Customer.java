package day20;

public class Customer {
	private String name;
	private int age;
	private int expense;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		if(age>=15) {
			expense = 100;
		}else {
			expense = 50;
		}
	}
	public Customer(String name, int age, int expense) {
		this.name = name;
		this.age = age;
		this.expense = expense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + " 비용:" + expense;
	}
	

}
