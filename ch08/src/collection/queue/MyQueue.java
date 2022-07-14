package collection.queue;

import java.util.ArrayList;
import java.util.List;
//DAO
public class MyQueue {

	private List<String> arryayQueue = new ArrayList<>();
	
	//큐의 맨 뒤에 추가
	public void enQueue(String data) {
		arryayQueue.add(data);
	}
	
	//큐의 맨 앞에서 꺼냄
	public String deQueue() {
		int len = arryayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arryayQueue.remove(0);
	}
	public int getSize() {
		return arryayQueue.size();
	}
}
