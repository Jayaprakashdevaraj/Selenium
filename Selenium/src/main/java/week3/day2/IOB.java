package week3.day2;

public class IOB implements RBI, FinanceMinistry {

	public void miniBal() {

		System.out.println("5000");
	}

	public void maxLoanAmount() {

		System.out.println("100000");
	}

	public void agriLoan() {

		System.out.println("agri = 1400000");
	}

	public static void main(String[] args) {

		IOB i = new IOB();
		i.miniBal();
		i.maxLoanAmount();
		i.emergencyLoanForCovid();
		i.floodReliefFund();
		
	}

	public void emergencyLoanForCovid() {
		System.out.println("emergency loan for Covid");

	}

	public void floodReliefFund() {
	System.out.println("flood Relief Fund");
		
	}

}
