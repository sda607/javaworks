package thread;

public class ThreadB extends Thread{
	
	public ThreadB() {
		setName("ThreadB");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 출력한 내용");
	}
	
	
 }
