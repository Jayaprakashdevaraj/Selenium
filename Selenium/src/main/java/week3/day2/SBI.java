package week3.day2;

public class SBI implements RBI{

	public void miniBal() {
		System.out.println("SBI min bal = 12345678");
		
	}

	public void maxLoanAmount() {
		System.out.println("SBI max loan amount = 5000000000");
				
	}
	public void ItLoan() {
		System.out.println("It Loan");
				
	}
	
	public static void main(String[] args) {
		SBI s= new SBI();
		s.miniBal();
		s.maxLoanAmount();
		s.ItLoan();
	}

	public void floodReliefFund() {
		
		System.out.println("SBI - floodReliefFund");
	}
}
