package week3.day1;

public class Employees extends Company {
	
	int empID;
	String empName;
	
	Employees(){
		System.out.println("default constructor- child");
	}
	
Employees(int id, String name){
		empID = id;
		empName = name;
		System.out.println("parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		Employees emp = new Employees();
	//	Employees emp = new Employees(100, "jp");
		
		
		
		System.out.println(emp.empID);
		System.out.println(emp.empName);
	}

}
