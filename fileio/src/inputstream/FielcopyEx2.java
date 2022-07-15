package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FielcopyEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try ~ with ~ resource문
		//close()를 명시하지 않아도 됨
		long start = 0, end =0;
		
		String originFile = "c:/File/bg0.jpg";
		String copyFile = "c:/File/bg3.jpg";

		try(FileInputStream fis = new FileInputStream(originFile);
				FileOutputStream fos = new FileOutputStream(copyFile)){
			
			//이미지 읽고 쓰기
			start = System.currentTimeMillis();//수행 전 현재시간
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}	
			end	= System.currentTimeMillis(); //수행 후 현재시간 
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요시간:" + (end-start));
	
	}
}
