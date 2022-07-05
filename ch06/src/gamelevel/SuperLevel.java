package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
	 System.out.println("매우매우 높이 jump");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다");
	}

	@Override
	public void showLEvelMessage() {
		System.out.println("*****고급자 레벨입니다****");
	}

	
}
