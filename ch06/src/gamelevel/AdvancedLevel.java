package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
	 System.out.println("높이 jump");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모름");
	}

	@Override
	public void showLEvelMessage() {
		System.out.println("*****중급자 레벨입니다****");
	}

	
}
