package interfaceex_polymorghism;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.run();
		
		//앞바퀴 교체
		System.out.println("***앞바퀴 교체*****");
		myCar.forntLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		myCar.run();
	}

}
