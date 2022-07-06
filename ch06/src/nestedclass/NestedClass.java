package nestedclass;

class A{
	//생성자
	A(){System.out.println("A 객체가 생성됨");}
	//필드 - 인스턴스 클래스
	class B{
		int field1;
		//static field2;
		B(){System.out.println("B객체가 생성됨");}
		void method1() {}
	}
		

	//필드 - 정적 멤버
	static class C{
			int field1;
			static int field2;
			C(){System.out.println("C 객체가 생성됨");}
			void method1() {}
			static void method2() {}
	}
	
	void method() {
		//로컬 클래스 - 매서드 내에 선언된 클래스
		class D{
			int field1;
			//static field2;    local에서도 static 사용불가
			D(){System.out.println("D 객체가 생성됨");}
			void method1() {}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

public class NestedClass {

	A a = new A();
	
	//인스턴스 클래스 객체 생성 방법
	A.B b = a.new B();
	 b.field1= 4;
	 
	 ///정적 클래스
	 A.C c = new A.C();
	 c.field1 = 5;
	 A.C.field2
	 
	 //매서드 호출
	 a.method();
	}
}