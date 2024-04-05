package day22;

class JoinTest extends Thread{
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++) {
			this.total += i;
		}
	}
	
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 두 개의 Thread를 생성
		// 그 결과를 확인
//		System.out.println(Thread.currentThread().getName());
		JoinTest jt1 = new JoinTest(1, 50);
		jt1.start();
		JoinTest jt2 = new JoinTest(51, 100);
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//두 개의 Thread가 실행되고 난 후
		//thread1 1~50까지의 합계 출력
		//thread2 51~100까지의 합계 출력
		//thread1+thread2의 합계 출력
		System.out.println("jt1 total => "+jt1.total);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("jt2 total => "+jt2.total);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastTotal = jt1.total+jt2.total;
		System.out.println();
		System.out.println("jt1+2 total => "+lastTotal);

	}

}
