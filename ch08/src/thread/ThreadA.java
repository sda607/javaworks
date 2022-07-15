package thread;

public class ThreadA extends Thread{
	//setName(), getName() THread의 메소드
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
 }
