package arraylist;

import java.util.ArrayList;

import arryobject.Book;

public class BookList {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		//Book객체 생성
		Book book1 = new Book("혼공 자바", "신용권");
		Book book2 = new Book("반응형 웹", "나잘나가");
		Book book3 = new Book("스프링부트", "너가잘나가");
		
		//ArrayList자료저장
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
//		bookList.add(new Book("혼공 자바", "신용권"));
		//전체출력
		for(int i=0; i<bookList.size(); i++) {
		Book book =	bookList.get(i);
		book.showInfo();
		}
		
	}

}
