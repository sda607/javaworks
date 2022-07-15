package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample2 {

	public static void main(String[] args) {
		OutputStream os = null;
	
			try {
				os = new FileOutputStream("c:/File/test2/db");
				
				byte[] array = new byte[] {10, 20, 30};
				
				os.write(array);
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					os.flush();
					os.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			

		
	}
}
