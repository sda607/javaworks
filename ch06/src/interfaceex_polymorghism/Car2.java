package interfaceex_polymorghism;

public class Car2 {
	//필드 - 인터페이스타입으로 객체 생성
	Tire[] tires = {
			new HanTire(),//0번위치
			new HanTire(),//1번위치
			new KumTire(),
			new KumTire(),
	};
	
	//메서드
	void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
}

