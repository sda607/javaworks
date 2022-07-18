package decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("animal.txt");
				BufferedWriter bw = new BufferedWriter(fw)){
			
			bw.write("cat");
			bw.write("dog");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
