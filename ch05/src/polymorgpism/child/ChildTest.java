package polymorgpism.child;

public class ChildTest {

	public static void main(String[] args) {

//		child child = new child();
		Parent parnet = new child();
		
//		Parent parent = Child; //자동 타입 변환
		parnet.method1();
		parnet.method2(); //자식 클래스의 매서드가 호출됨
	
	}

}
