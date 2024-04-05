package day10;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setName("스파크");
		c.setColor("빨간색");
		c.setYear("2024");
		c.print();
		c.power();
		System.out.println("My Car Power:"+(c.isPower()? "ON":"OFF"));
		c.power();
		System.out.println("My Car Power:"+(c.isPower()? "ON":"OFF"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("my Car Speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("my Car Speed:"+c.getSpeed());
		
		Car c2 = new Car();
		c2.setName("그랜저");
		c2.setColor("검은색");
		c2.setYear("2003");
		c2.print();
		c2.power();
		System.out.println("My Car Power:"+(c2.isPower()? "ON":"OFF"));
		System.out.println("my car speed:"+c2.getSpeed());
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		for(int i=1;i<=100;i++) {
			
			c2.speedUp();
			System.out.println("my car speed:"+c2.getSpeed());
		}
		for(int i=1;i<=100;i++) {
			
			c2.speedDown();
			System.out.println("my car speed:"+c2.getSpeed());
		}
		
	}

}

class Car{ //클래스명은 대문자로 시작
	//멤버변수 = private
	//메서드 = public => getter/setter 메서드
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	
	//power()
	//꺼져있을 경우 => 켜짐
	//켜져있을 경우 => 꺼짐
	public void power() {
		power = !power;
	}
	
	//speedUp()
	public void speedUp() {
		if(speed<300) {
			speed += 10;
		}
	}
	
	//speedDown()
	public void speedDown() {
		if(speed>0) {
			speed -= 10;
		}
	}	
	
	//print()
	public void print() {
		System.out.println("myCar:"+name+"/"+color+"("+year+")");
	}

	//getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
