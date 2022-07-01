package arraylist;

import java.util.ArrayList;

public class Student {
	//필드
	private int studentID;
	private String studentName;
	private ArrayList<subject> subjectList;
	
	public Student(int StudentID, String studentName) {
		this.studentID = studentID;
		this.studentID = studentID;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	
}
