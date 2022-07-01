package methods;

public class CarEx {

	public static void main(String[] args) {

			car myCar = new car();
			myCar.keyTurnOn();
			myCar.run();
			int Speed = myCar.getSpeed();
			System.out.println("현재속도 :" + Speed + "km/h");
			
		}


	}

