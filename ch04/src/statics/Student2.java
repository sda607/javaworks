package statics;

public class Student2 {
	private static int seriaNum = 100; //기준 번호
	private int id; 		//학번
	private String name; 	//이름
	
	public void Student2() {
		seriaNum++;
		id = seriaNum;
	}
	//ID를 설정하는 메서드
	public int setId(int id) {
		this.id = id;
	}
	
	//이름을 설정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	//이름을 가져오는 메서드
	public String getName() {
		return name;
	}
	
}
