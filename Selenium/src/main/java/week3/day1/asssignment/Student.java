package week3.day1.asssignment;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student name is JP");
	}
	public void studentDept() {
		System.out.println("Student department is ECE");
	}
	public void studentId() {
		System.out.println("student Id is 100107120023");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
	}
	
	
}
