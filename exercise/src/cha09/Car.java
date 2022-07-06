package cha09;

public class Car {
	//인ㅅ느턴스형 내부 클래스
	class Tire{
		Tire(){
			System.out.println("타이어");
		}
	}
	//정적 내부
	static class Engine{
		Engine(){
			System.out.println("엔진");
		}
	};
	
}
