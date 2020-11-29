package week3.day2;

public class SBICbi extends SBI{
	
	public void fixedDeposit() {
		System.out.println("SBi Coimbatore fixed Deposit");

	}
	
	public static void main(String[] args) {
		SBICbi c = new SBICbi();
		c.miniBal();
		c.maxLoanAmount();
		c.ItLoan();
		c.fixedDeposit();
		
	}

}
