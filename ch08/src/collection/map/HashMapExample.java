package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map의 객체 map 생성
		//순서가 없고 중복 불가(key는 불가, value 가능)
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("이순신", 85);
		map.put("홍길동", 90);
		map.put("강감찬", 80);
		map.put("홍길동", 70);
		
		System.out.println("총 객체수: " + map.size());
		
		//객체 1개 찾기 - key를 사용해서 값을 가져옴
		System.out.println( map.get("홍길동"));
		
		//전체 객체 출력
		Set<String> keySet = map.keySet();
		//반복자 얻기
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();	//1개의 키를 가져와서
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}

}
