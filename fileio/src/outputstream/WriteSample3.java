package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample3 {

	public static void main(String[] args) {
		//바이트 기반 파일 출력스트림 생성
		OutputStream os = null;
		try {
			 os = new FileOutputStream("c:/File/test3.db");
			 
			 //배열의 데이터 쓰기
			 byte[] array = new byte[] {10, 20, 30, 40, 50};
			 os.write(array, 1, 3);	//1번 인텍스로부터 3개 쓰기
			 
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
