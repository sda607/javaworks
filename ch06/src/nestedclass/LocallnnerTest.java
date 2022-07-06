package nestedclass;

	class Outer{
		int outNum = 100;
		static int sNum = 200;
		
		//메서드
		Runnable getRunnable() {
			int num = 10; //인터페이스상수
			
			//지역 내부 클래스
			class MyRunnable implements Runnable{
				int localNum = 20;
				@Override
				public void run() {
					System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
					System.out.println(sNum + "(외부클래스의 정적 변수)");
					System.out.println(localNum + "(내부클래스의 멤버 변수)");
				}
			}
			MyRunnable myRun = new MyRunnable();
			return myRun;
//			return new MyRunnable();
		}
	}
	

public class LocallnnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		//방법2 인터페이스 형으로 변환
		Runnable runner = outer.getRunnable(); //자동 형변환
		runner.run();
	}

}
