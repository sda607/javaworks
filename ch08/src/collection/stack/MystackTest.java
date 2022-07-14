package collection.stack;

public class MystackTest {

	public static void main(String[] args) {

		Mystack stack = new Mystack();
		
		//객체 넣기
		stack.push("봄");	//0
		stack.push("여름");	//1
		stack.push("가을");	//2
		stack.push("겨울");	//3
		
		//객체 빼기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); // -1
		
	}

}
