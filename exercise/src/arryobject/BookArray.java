package arryobject;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		
		//배열 생성전 출력 - null로 초기화 됨
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			}
		
		library[0] = new Book("혼공 자바", "신용권");
		library[1] = new Book("반응형 웹", "나잘나");
		library[2] = new Book("스프링부트", "아무나");
	
		//출력
		library[0].showInfo();
	
		//전체출력
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		System.out.println();
		
		//데이터 수정
			library[0].setBookName("혼자공부하는 Java");	
			
		//library[1]의 저자 수정	
			
		//항상 for
		for(Book book : library)
			book.showInfo();	
		
	
			
		}
}
