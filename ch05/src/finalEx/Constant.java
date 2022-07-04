package finalEx;

public class Constant {

	int num =10;
	final int NUM = 100; //상수
	
	public static void main(String[] args) {
		
		Constant cons = new Constant();
		cons.num = 20;
//		cons.NUM = 200; 상수는 노우
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
