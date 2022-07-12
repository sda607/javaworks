package chap11;

public class Student {
		private String studentNum;
		
		public Student(String studentNum) {
			this.studentNum = studentNum;
		}
		public String getStudentNum() {
			return studentNum;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student student = (Student) obj;
			}
		}
	}


