package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws IOException {
		// 줌 단위로 문자 읽기
		//BufferedReader 사용 - 보조 스트림
		Reader fr = new FileReader("reader.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String data = br.readLine(); //줄 단위 읽기 (readLine())
			if(data == null) break;
			System.out.println(data);
		}

		br.close();
	}

}
