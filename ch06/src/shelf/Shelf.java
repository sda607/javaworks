package shelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	//객체 생성시에 어레이리스트 생성
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size(); //리스트 요소의 개수 반환
	}
		
}
