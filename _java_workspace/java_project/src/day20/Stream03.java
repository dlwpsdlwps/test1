package day20;

import java.util.ArrayList;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		ArrayList<Student> list = new ArrayList<Student>();
		Student st1 = new Student("이름1",50);
		Student st2 = new Student("이름2",60);
		Student st3 = new Student("이름3",70);
		Student st4 = new Student("이름4",80);
		Student st5 = new Student("이름5",90);
		// add로 5명 추가
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		// 스트림을 이용하여 콘솔에 출력 ex) 홍길동 : 98
		list.stream()
		.forEach(n->System.out.println(n));
		
		System.out.println("------");
		list.stream()
		.forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" : "+score);
		});
		
		//list의 점수 합계 / 전체 인원 수 출력
//		list.stream()
//		.forEach(n->{
//			int sum += n.getScore();
//		});
		int sum = list.stream()
				.mapToInt(n->n.getScore())
				.sum();
		System.out.println("합계:"+sum);
		long cnt = list.stream().count();
		System.out.println("총원:"+cnt);

	}

}
