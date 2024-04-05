package day18;

import java.util.HashMap;
import java.util.Scanner;

public class WordManager {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public WordManager() {
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		map.put("d", "d");
		map.put("e", "e");
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
	
	

}
