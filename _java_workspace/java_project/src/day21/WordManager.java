package day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public WordManager() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("car", "자동차");
		map.put("door", "문");
		map.put("eagle", "독수리");
	}
	
	public void addWord(Scanner s) {
		System.out.println("단어>");
		String word = s.next();
		System.out.println("뜻>");
		String mean = s.next();
		map.put(word, mean);
	}
	public void searchWord(Scanner s) {
		System.out.println("찾을 단어 입력>");
		String word = s.next();
		for(String key : map.keySet()) {
			if(key.equals(word)) {
				System.out.println(key+":"+map.get(key));
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");
	}
	public void editWord(Scanner s) {
		System.out.println("수정할 단어 입력>");
		String word = s.next();
		for(String key : map.keySet()) {
			if(key.equals(word)) {
				System.out.println("뜻>");
				String mean = s.next();
				map.put(key, mean);
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");
	}
	public void printWord() {
		int cnt = 0;
		for(String key : map.keySet()) {
			cnt++;
			System.out.println(cnt+"."+key+":"+map.get(key));
		}
	}
	public void deleteWord(Scanner s) {
		System.out.println("삭제할 단어 입력>");
		String word = s.next();
		for(String key : map.keySet()) {
			if(key.equals(word)) {
				map.remove(word);
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");
	}
	public void makeFile() throws IOException {
		FileWriter f = new FileWriter("word.txt");
		BufferedWriter b = new BufferedWriter(f);
		//키 리스트 정렬
		ArrayList<String> keyList = new ArrayList<String>(map.keySet());
		Collections.sort(keyList);
		//파일 쓰기
		for(String tmp : keyList) {
			b.write(tmp+":"+map.get(tmp)+"\r\n");
		}
		
		if(b!=null) b.close();
		if(f!=null) f.close();
	}

	public void filePrint() throws IOException {
		// StringBuffer 객체
		// .append : 기존 String에 데이터 추가 가능
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		//sb.append : 기존 String에 데이터 추가
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n"); // 줄바꿈
		//키를 리스트 정렬
		ArrayList<String> keyList = new ArrayList<String>(map.keySet());
		Collections.sort(keyList);
		//map을 스트링버퍼에 넣기
		for(String key : keyList) {
			sb.append(key+":"+map.get(key));
			sb.append("\r\n");
		}
		data = sb.toString(); //StringBuffer 객체여서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw!=null) {
			bw.close();
		}
		if(fs!=null) {
			fs.close();
		}
	}
	

}
