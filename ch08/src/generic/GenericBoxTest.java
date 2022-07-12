package generic;

import generic.box.Apple;
import generic.box2.Box;

public class GenericBoxTest {

	public static void main(String[] args) {

		//String type
		Box box = new Box();
		box.set("GOOD Luck");
		String msg = (String)box.get();//Object형으로 변환
		System.out.println(msg);
		
		//Apple 클래스
		box.set(new Apple("사과"));
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
