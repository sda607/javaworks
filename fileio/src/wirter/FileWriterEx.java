package wirter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {

	public static void main(String[] args) {
		//문자 파일 기반 출력스트림 생성
		
		 try(Writer fw = new FileWriter("file1.txt")){
			 fw.write("Hello~ JAva");
			 fw.write("가나다라");
//			 fw.write((int) 3.3);	//정수,실수 쓰기불가
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		 System.out.println("수행완료");
	}

}
