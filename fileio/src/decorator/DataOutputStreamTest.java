package decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		//자료형이 그대로 유지됨
		//보조스트림(기반스트림)
		try (FileOutputStream fos =new FileOutputStream("date.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
				
				
				dos.writeByte('C');
				dos.writeChar('나');
				dos.writeFloat(2.54F);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
