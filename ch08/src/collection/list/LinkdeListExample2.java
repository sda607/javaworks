package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdeListExample2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		List<String> list2 = new LinkedList();
		
		long StartTime, endTime;
		
		StartTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i)); //String.valueOf() - 정수를 숫자로
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린신간 : " + (endTime - StartTime) + "ns");
		StartTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));
			}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린신간 : " + (endTime - StartTime) + "ns");
	}
	

}
