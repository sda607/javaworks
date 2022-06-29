package cooperation;

public class Person {
	
	String name;
	int money;
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타다
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200; 
	}
	//지하철을 타다
	public void takesubway(subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	
	//사람의 정보
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원입니다.");
	}
}
