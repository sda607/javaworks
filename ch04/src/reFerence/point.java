package reFerence;

public class point {
		//점 클래스
	//필드(field)
	int x;
	int y;
	
	//생성자
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showInfo() {
		System.out.println("점(" + x + ", " + y +")");
	}
}
