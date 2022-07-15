package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FielcopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originFile = "c:/File/bg0.jpg";
		String copyFile = "c:/File/bg3.jpg";

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		try {
			fis = new FileInputStream(originFile);
			fos =new FileOutputStream(copyFile);
			
			//파일 읽기
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
