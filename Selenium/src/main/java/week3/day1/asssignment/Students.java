package week3.day1.asssignment;

public class Students {
	
	public void getStudentInfo(String name) {
		System.out.println("get student information by using name : "+ name);
	}

	public void getStudentInfo(long id) {
		System.out.println("get student information by using id : "+id);
	}
	public void getStudentInfo(String name, int id) {
		System.out.println("get student information by using name : "+name+" and id : "+id);
	}
	public void getStudentInfo(long id, String name) {
		System.out.println("get student information by using phone number : "+id+" and Email : "+name);
	}
	public void getStudentInfo(Short regno) {
		System.out.println("get student information by using reg no :" +regno);
	}
	public void getStudentInfo(boolean attentance) {
		System.out.println("student is present or not : " +attentance);

	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo("JP");
		s.getStudentInfo(100107120023l);
		s.getStudentInfo("jp", 23);
		s.getStudentInfo(8122212313L, "Jp");
		s.getStudentInfo(12345);
		s.getStudentInfo(true);
		
		
		
	}
	
}
