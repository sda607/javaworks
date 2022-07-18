package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderexample {

	public static void main(String[] args) {
		// readLine() 사용

		try (FileReader fr = new FileReader("animal.txt");
				BufferedReader br = new BufferedReader(fr)){
			
			//데이터 읽어오기
			String[] animal = null; //전역변수
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				 animal =  line.split("");
			}
			System.out.println(animal[0]);
			
			for(int i=0; i<animal.length; i++) {
				System.out.println(animal[i]);
			}
			//랜덤 출력
			int rand = (int) (Math.random()*animal.length);
			System.out.println(animal[0]);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
