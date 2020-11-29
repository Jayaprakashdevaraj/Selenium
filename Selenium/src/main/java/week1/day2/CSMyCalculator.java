package week1.day2;

public class CSMyCalculator {

	public static void main(String[] args) {
		
		CSCalculator cal = new CSCalculator();
		int addition = cal.AddThreeNo(100, 200, 300);
		System.out.println(addition);
		int subtraction = cal.SubTwoNo(200, 100);
		System.out.println(subtraction);
		double mulTwoNo = cal.MulTwoNo(3, 2);
		System.out.println(mulTwoNo);
		float divTwoNo = cal.divTwoNo(5,3);
		System.out.println(divTwoNo);
	}

}
