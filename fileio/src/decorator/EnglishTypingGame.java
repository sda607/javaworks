package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EnglishTypingGame {

	public static void main(String[] args) throws IOException, IOException {

		Scanner sc = new  Scanner(System.in);
		try(FileReader fr = new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr)){
			
			String[] word = null;
			String data = null;
			while(true) {
				data = br.readLine();
				if(data == null) break;
				word = data.split(" ");
			}
			int n = 1;
			long start = 0, end = 0;
			System.out.println("타자 연습 게입 - 준비되면[go]");
			sc.nextLine();
			start = System.currentTimeMillis();
			while(n <= 10) {
				System.out.println("문제" + n);
				int rand = (int)(Math.random()* word.length);
				String Question = word[rand];
				System.out.println(Question);//문제 표시
				
				String answer = sc.nextLine(); //답변입력
			}
		}
	}

}
