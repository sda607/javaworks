package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		////데이터가 test1.db인 바이트 기반 파일 입력 스트림 생성
	
		InputStream is = new FileInputStream("c:/File/test1.db");
		
		int readByte;
		while((readByte = is.read()) != -1) {
			System.out.println(readByte);
		}
		
		is.close();
	}

}
