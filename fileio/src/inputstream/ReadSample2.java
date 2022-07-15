package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample2 {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			 is = new FileInputStream("c:/File/test2.db");
			 
			 byte[] buffer = new byte[100];
			 
			 int data;
			 while((data = is.read(buffer)) != -1) {
				 for(int i=0; i < data; i++) {
					 System.out.println(buffer[i]);
				 }
			 }
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
			is.close();
			}catch
		}
	}
}
