package arraylist;

public class Studentmain {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "이양파");
		
		s1.addSubject("국어", 95);
		
		s1.showStudentInfo();
	}

}
