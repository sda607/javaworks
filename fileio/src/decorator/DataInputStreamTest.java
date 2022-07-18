package decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis =new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){
			
				System.out.println(dis.read());
				System.out.println(dis.readChar());
				System.out.println(dis.readInt());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
