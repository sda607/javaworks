package interfaceex_polymorghism;

public class Car {
	//필드 - 인터페이스타입으로 객체 생성
	Tire forntLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backrightTire = new KumTire();
	
	//메서드
	void run() {
		forntLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backrightTire.roll();
	}
}

