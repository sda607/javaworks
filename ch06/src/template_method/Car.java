package template_method;

import java.awt.Taskbar.State;

public abstract class Car {

	//추상매서드
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동 겁니다");
	}
	public void turnOff() {
		System.out.println("시동 끕니다");
	}
	
	//템블릿 메서드 
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
