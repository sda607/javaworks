package finalEx;

public class SprtsCar  extends Car{

	public static void main(String[] args) {
		
		
	}

	@Override
	public void speedUp() {
		speed += 10;
	}

	
	//재정의 할 수 없음
	/*public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}*/
}
