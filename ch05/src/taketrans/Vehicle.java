package taketrans;

public class Vehicle {

	String vehicleName;
	int money;
	int passengerCount;	//승객수
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//운송하다 메서드
	public void carry(int money) {
		this.money += money;	//수입 합계
		passengerCount++;		//승객수 1명 증가
	}
	
	//정보
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d이고, 승객수는 %d명입니다.",
				vehicleName, money, passengerCount );
	}

}
