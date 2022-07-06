package interface_inherit;

public class MyClassTest {

	public static void main(String[] args) {
		//MyClass의 객체 생성
		MyClass myClass = new MyClass();
		
		//인터페이스형
		X x = myClass; //자동 타입 변환
		x.x();
		
		Y y= myClass;
		y.y();
		
		//
		MyInterface iclass = myClass; //자동 타입 변환
		iclass.x();
		iclass.myMethod();
	}

}
