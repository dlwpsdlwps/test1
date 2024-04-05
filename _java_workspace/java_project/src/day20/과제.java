package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품이 있습니다
		 * 여행 비용은 15세 이상은 100만원, 미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력
		 * 2. 고객명단 검색 => 출력
		 * 고객 클래스를 생성하고, ArrayList로 고객관리
		 * 
		 * 예시) 고객정보 -> 고객명단
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:홍길동, 나이:10, 비용:50
		 * 총 여행 경비 : 250
		 * 
		 * 20대 이상 고객명단 => 이름 순으로 정렬
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:이순신, 나이:40, 비용:100
		 */
		ArrayList<Customer> list = new ArrayList<Customer>();
		Customer c1 = new Customer("이순신", 40);
		Customer c2 = new Customer("신사임당", 35);
		Customer c3 = new Customer("홍길동", 10);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		//비용계산
		int sum = list.stream()
				.mapToInt(n->n.getExpense())
				.sum();
		//고객명단
		list.stream()
		.forEach(n->System.out.println(n));
		System.out.println("총 비용:"+sum);
		//20대이상 고객명단
		list.stream()
		.filter(n->n.getAge()>=20)
		.sorted(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		})
		.forEach(n->System.out.println(n));

	}

}
