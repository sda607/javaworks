package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {

	public static void main(String[] args) {
		//LinkedList 객채 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendmail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendkakaotalk", "홍두께"));
	
		//객체 빼기
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" :
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendkakaotalk" :
					System.out.println(message.to + "님에게 카톡을 보냅니다.");
					break;
			}
		}
	}
	
}
