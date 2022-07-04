package inheritance.cellphone;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String messsage) {
		System.out.println("저기 :" + messsage);
	}
	
	void receiveVoice(String messsage) {
		System.out.println("상대방 :" + messsage);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	

	
	
}
