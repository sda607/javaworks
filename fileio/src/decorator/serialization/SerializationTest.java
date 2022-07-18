package decorator.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// 현재의 인스턴스 상태를 저장 - 보조 스트림
		// 직렬화
		// person 객체생성
		Person personSon = new Person("손정의", "대표이사");
		Person personJang = new Person("장그레", "부장");
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			//객체를 파일에 씀
			oos.writeObject(personSon);
			oos.writeObject(personJang);
		} catch (IOException  e) {
			e.printStackTrace();
			}
		//역직렬화
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			//객체 정보 읽기
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
