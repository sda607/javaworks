package taketrans;

public class Student {
	String name;
	int money;
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//차량탑승, 매개변수의 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee); //요금을 내고 차에 탑승
		this.money -= fee;
	}
	
	//정보
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %,d원 입니다.\n", name, money );
	}
}
