package week3.day1.asssignment;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit the amount in bank----Axis bank");
	}

	public static void main(String[] args) {

		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();

	}
}
