package collection.stack;

import java.util.ArrayList;
import java.util.List;

//coin을 관리할 Dao
public class Mystack {
	//List형 ArrayList 객체 선언
	private List<String> arrayStack;
	
	public Mystack() {
		arrayStack = new ArrayList<>();
	}
	
	//자료추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//자료 빼기
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		//0번 인텍스부터 시작하므로 1을 빼줌
		return arrayStack.remove(len - 1); 
	}
	
}
