package collection.queue;

public class ArrayQueueTest {

	public static void main(String[] args) {

		MyQueue Queue = new MyQueue();
		
		//자료넣기(A-B-C)
		Queue.enQueue("A");//0
		Queue.enQueue("B");//1
		Queue.enQueue("C");//2
		
		System.out.println("총 개수:" + Queue.getSize());
		
		//자료 꺼내기(삭제)(A-B-C)
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());//-1
	}

}
