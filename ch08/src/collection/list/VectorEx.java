package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();
		
		//게시글 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용1", "글쓴이1"));
		list.add(new Board("제목3", "내용1", "글쓴이1"));
		list.add(new Board("제목4", "내용1", "글쓴이1"));
		list.add(new Board("제목5", "내용1", "글쓴이1"));
		
		//2번 인덱스 삭제
		list.remove(2);
		
		//전체 출력
		for(int i = 0;  i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.wirter);
		}
	}
	

}
