package week1.day2;

public class EmployeeInfo {

	public void empdetails() {
		System.out.println("Jayaprakash");
	}

	public String getEmpName() {
		return "JP";
	}

	public long getEnpPhoneNo(int id) {
		if (id == 100) {
			return 8122212313L;
		} else {
			return 9879879879l;
		}
	}

	public static void main(String[] args) {

		EmployeeInfo ei = new EmployeeInfo();

		ei.empdetails();
		String empName = ei.getEmpName();
		System.out.println(empName);
		long enpPhoneNo = ei.getEnpPhoneNo(100);
		System.out.println(enpPhoneNo);

	}

}
