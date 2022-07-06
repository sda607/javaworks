package innerinterface;

public class ButtonTest {

	public static void main(String[] args) {

		Button button = new Button();
		CallListener call = new CallListener();
		
		//전화 걸기
		button.setListener(call);
		button.touch();
		
		//문자보내기
		button.setListener(new MessgeListener());
		button.touch();
		
		//익명 객체 구현
		//사진찍기
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진찍기");
			}
		});
		button.touch();
	}

}
