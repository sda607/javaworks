package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {
	
	public static void main(String[] args) throws IOException {
		//outputstream, WriteSample
		//데이터가 test1.db인 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("c:/File/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);  
		os.write(b);
		os.write(c);
		
		os.close();
	}
	
}
