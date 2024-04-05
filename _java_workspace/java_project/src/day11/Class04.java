package day11;

public class Class04 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드 : 
		 * power() : power가 켜지면 "ON" 꺼지면 "OFF"
		 * 
		 * chUp() : 1씩 증가 ch는 20까지 순환
		 * chDown() : 1씩 감소 순환
		 * 
		 * volUp(), volDown() : 1씩 증감, 10까지, 0이면 음소거 출력
		 */
		Tv t = new Tv();
		t.power();
		t.chUp();
		t.volDown();t.volDown();t.volDown();t.volDown();
		t.power();
		t.volDown();
		
	}

}

class Tv{
	private final String BRAND = "LG"; //final은 변경할 수 없는 값을 지정 (변수명 대문자)
	private boolean power;
	private int ch = 1;
	private int vol;
	//생성자
	public Tv() {
		this.vol = 3;
	}
	//print
	public void print() {
		System.out.println(BRAND+",채널:"+ch+",볼륨:"+vol);
	}
	//power
	public void power() {
		power = !power;
		if(power) {
			System.out.println("On");
			print();
		}else {
			System.out.println("Off");
		}
//		System.out.println(isPower()? "On":"Off");
	}
	//ch
	public void chUp() {
		if(power==true&&ch<=20) {
			ch++;
			if(ch==21) {
				ch=1;
				System.out.println("채널:"+ch);
			}else {
				System.out.println("채널:"+ch);
			}
		}
	}
	public void chDown() {
		if(power==true&&ch>0) {
			ch--;
			if(ch==0) {
				ch=20;
				System.out.println("채널:"+ch);
			}else {
				System.out.println("채널:"+ch);
			}
		}
	}	
	//vol
	public void volUp() {
		if(power==true&&vol<=10) {
			vol++;
			if(vol==11) {
				vol--;
				System.out.println("볼륨:"+vol);
			}else {
				System.out.println("볼륨:"+vol);
			}
		}
	}
	public void volDown() {
		if(power==true&&vol>=0) {
			vol--;
			if(vol==0) {
				System.out.println("음소거");
			}else if(vol==-1) {
				vol++;
				System.out.println("음소거");
			}else {
				System.out.println("볼륨:"+vol);
			}
		}
	}
	//getter setter
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
}