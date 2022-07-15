package thread;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		//메인과 작업 동시 실행
		Runnable beepTask = new BeepTast();
		Thread thread = new Thread(beepTask);
		thread.start(); //쓰레드 시작
	
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
