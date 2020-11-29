package week3.day1;

public class MethodOverloading {
	
	public void getStudentDetails(String name) {
		
		System.out.println("student details based on given name");

	}
	public void getStudentDetails(int id) {
		
		System.out.println("student details based on given id");

	}

	public void getStudentDetails(String name,int id) {
		
		System.out.println("student details based on given name and id");

	}

	public void getStudentDetails(int id,String name) {
		
		System.out.println("student details based on given id, name");

	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading s = new MethodOverloading();
		
		s.getStudentDetails("jp");
		s.getStudentDetails(100);
		
		
	}
}
