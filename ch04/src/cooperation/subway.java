package cooperation;

public class subway {
	//필드
	String lineNumber;
	int passenger;
	int money;
	
	//생성자
	public subway(String string) {
		this.lineNumber = string;
	}
	
	
	//사람을 태우다
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	//지하철의 정보
	public void showInfo() {
		System.out.println(lineNumber + "지하철의 수입");
	}
	
}	
