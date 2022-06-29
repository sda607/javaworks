package statics;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		Student han = new Student();
		
		lee.setName("디대한");
		han.setName("한지수");
		
//		System.out.println(lee.seriaNum);
		Student.seriaNum++;
		System.out.println(Student.seriaNum++);//클래스로 직접 접근
		System.out.println(lee.getName());
		
		Student.seriaNum++;
		System.out.println(Student.seriaNum++);
		System.out.println(han.getName());
	}

}
