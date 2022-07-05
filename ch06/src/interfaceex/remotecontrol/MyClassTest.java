package interfaceex.remotecontrol;

public class MyClassTest {

	public static void main(String[] args) {

		System.out.println("1)-------------------");
		//rc 필드를 사용
		MyClass myclass1 = new MyClass();	
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		
		System.out.println("2)-------------------");
		//생성자의 매개 변수
		MyClass myclass2 = new MyClass(new Television());
		
		System.out.println("3)-------------------");
		//매서드의 로컬 변수(지역변수)
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		System.out.println("3)-------------------");
		//매개변수
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
	}

}
