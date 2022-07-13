package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//set 자료구조 - 순서가 없고, 중복 저장이 불가
		//이미 hashcode() 들어있음
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("MyBatis");
		//set의 크기
		int size = set.size();
		System.out.println("총 객체수" + size);
		
		//전체 요소 출력
		//순서가 없음
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {			// 객체 수만큼 반복
			String element = iterator.next(); // 1개의 객체 가져옴
			System.out.println(element);
		}
		
		// 요소 삭제
		set.remove("JDBC");
		System.out.println("총 객체수" + set.size());
		
		//모든 요소 삭제
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	
	}

}
