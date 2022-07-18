package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample3 {

	public static void main(String[] args) {
		//바이트 기반 파일 입력스트림
		try( InputStream is = new FileInputStream("c:/File/test3.db")){
			
			byte[]buffer = new byte[5];
			
			while(true) {
				int data = is.read(buffer, 2, 3);	//2번 인텍스부터 3개 읽어옴
				if(data == -1) break;
				for(int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
