package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain {

	public static void main(String[] args) throws IOException {

		System.out.println("전환 상담 배분 방식을 선택하세요");
		System.out.println("R : 한명씩 차례료 배분");
		System.out.println("L : 대기가 가장 적은 상담원에게 배분");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read(); //할당 방식을 입력받아
		//인터페이스 형으로 변수 선언
		scheduler scheduler = null;
		
		if(ch=='R'|| ch=='r') {
			scheduler = new RoundRobin();
			
		}else if(ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}else if(ch=='P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다ㅏ.");
			return; //강제종료 
		}
		scheduler.getNextcall();
		scheduler.sendCallToAgent();
		
	}//main

}
