package statics;

public class Student {
	static int seriaNum = 100; //기준 번호
	int id; 		//학번
	String name; 	//이름
	
	//이름을 설정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	//이름을 가져오는 메서드
	public String getName() {
		return name;
	}
	
}
