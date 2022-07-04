package chap04;

public class Singleton {

	private Singleton() {}
	
	//getInstance() 메서드
	public static Singleton getInstance() {
		return singleton;
	}
}
