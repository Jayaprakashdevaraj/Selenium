package week3.day2;

public class CanaraTMR extends Canara{

	@Override
	public void studentLoan() {
		System.out.println("CanaraTMT = studentLoan");
		
	}
	
	public static void main(String[] args) {
		
		CanaraTMR tmr = new CanaraTMR();
		tmr.studentLoan();
		
	}

}
