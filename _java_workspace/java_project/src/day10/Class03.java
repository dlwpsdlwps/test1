package day10;

public class Class03 {

	public static void main(String[] args) {
		//Car1클래스흫 통해 c객체를 생성 new 키워드를 통해 생성 Car1() 생성자에 의해 초기화 된다.
		Car1 c = new Car1();
		//정보
		c.setName("스파크");
		c.setColor("빨간색");
		c.setYear("2024");
		c.setDoor("4");
		c.print();
		//조작
		c.speedup();
		c.power();
		System.out.println("Power: "+(c.isPower()? "ON":"OFF"));
		c.speedup();
		c.speedup();
		c.power();
		System.out.println("Power: "+(c.isPower()? "ON":"OFF"));
		c.speeddown();
		c.speeddown();
		c.power();
		System.out.println("Power: "+(c.isPower()? "ON":"OFF"));
		
		Car1 c2 = new Car1("소나타", "2021");
		c2.print();
		
		Car1 c3 = new Car1("아반떼", "2021", "빨강", "4");
		c3.print();

	}

}

//같은 패키지에서 같은 이름의 클래스를 사용하면 error
class Car1{
	
	//멤버변수 : name, year, color, door, power, speed
	private String name;
	private String year;
	private String color;
	private String door;
	private boolean power;
	private int speed;
	
	//생성자 위치
	public Car1() {
		//기본 생성자
	}
	//생성자는 여러개 만들 수 있음(생성자 오버로딩)
	//오버로딩 조건 : 매개변수의 개수가 달라야함, 개수가 같다면 타입이 달라야함
	public Car1(String name, String year, String color, String door) {
		this(name, year); //생성자 호출
		this.color = color;
		this.door = door;
	}
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	//내 차량의 정보를 출력하는 메서드 (name, year, color, door)
	public void print() {
		System.out.println("info."+name+"_"+color+"_"+year+"_"+door+"개");
	}
	
	//power()
	//시동이 켜졌습니다. / 시동이 꺼졌습니다.
	public void power() {
		if(speed>0) {
			System.out.println("차를 멈춘 후 시동을 꺼주세요.");
		}else {
			power = !power;
		}
	}
	
	//speedup / down의 전제는 power가 켜져야 가능
	//시동이 꺼져있는 상태라면 "시동이 꺼져있습니다. 시동을 켜주세요." 출력
	//speedup()
	//300이상이면 "최고속도입니다."라고 출력
	//현재속도를 출력
	//속도가 0이 아닌데 시동을 끄려하면 "차가 멈춘 후 시동을 꺼주세요."
	public void speedup() {
		if(power==false)
		{
			System.out.println("시동을 켜주세요.");
		}
		if(power==true&&speed<300) {
			speed += 150;
			System.out.println("speed: "+speed);
		}
		if(power==true&&speed>=300) {
			System.out.println("최고속도입니다.");
		}
	}
	
	//speeddown()
	//속도가 0이되면 더 이상 내려가지 않음 (멈췄습니다.)
	//현재 속도가 얼마인지 출력
	public void speeddown() {
		if(power==false)
		{
			System.out.println("시동을 켜주세요.");
		}
		if(power==true&&speed>0) {
			speed -= 150;
			System.out.println("speed: "+speed);
		}
		if(power==true&&speed<=0) {
			System.out.println("멈췄습니다.");
		}
	}
	
	//getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
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