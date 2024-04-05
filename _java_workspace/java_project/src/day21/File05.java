package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 읽어들여 map에 저장하여
		// 명단, 합계, 평균을 출력
		// txt에서 읽어들이는 값은 모두 String
		// 계산을 위해서는 int 자료형으로 변환이 필요
		// Intrger.parseInt(); String -> int로 변환
		int sum = 0;
		double avg = 0;
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String name = line.substring(0,line.indexOf(" "));
			int sco = Integer.parseInt(line.substring(line.indexOf(" ")+1));				
			map.put(name, sco);
		}
		//명단
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
			sum += map.get(tmp); //합계
		}
		//합계
		System.out.println("합계:"+sum);
		//평균
		avg = sum/(double)map.size();
		System.out.println("평균:"+avg);

		//br 끊기
		if(br != null) br.close(); //객체가 생성되었다면 끊기

	}

}
