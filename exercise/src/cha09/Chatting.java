package cha09;

public class Chatting {
 
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;
		String nickName = chatId;
		
		class Chat{
			public void start() {
				while(true){
					String inputDate = "안녕하세요";
					String messsage = "[" + nickName + "]" + inputDate;
					sendMessage(messsage);
				}
			}
			
			void sendMessage(String messsgae) {
				
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
