package thisexample;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//생성
	Car(){
		
	}
	Car(String model){
		this(model, "미드나잇블루", 250);
	}
	Car(String model, String color){
		this(model, color, 250);
	}
	
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
