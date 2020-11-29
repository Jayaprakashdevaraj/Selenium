package week3.day1;

public class CSCalculator {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("sum of two number is : " + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("sum of three number is : " + d);
	}


	public void mul(int a, int b) {
		int e = a * b;
		System.out.println("mul of two number is : " + e);
	}
	public void mul(int a, double b) {
		double f = a * b;
		System.out.println("mul of two number is : " + f);
	}

	
	public void sub(int a, int b) {
		int g = a - b;
		System.out.println("sub of two int number is : " + g);
	}
	public void sub(double a, double b) {
		double h = a - b;
		System.out.println("sub of two double number is : " + h);
	}


	public void div(int a, int b) {
		int i = a / b;
		System.out.println("div of two int number is : " + i);
	}
	public void div(double a, int b) {
		double j = a / b;
		System.out.println("div of two int number is : " + j);
	}


	public static void main(String[] args) {
		CSCalculator cal = new CSCalculator();

		cal.add(100, 200);
		cal.add(100, 200, 300);

		cal.sub(200, 100);
		cal.sub(200.05, 100.02);

		cal.mul(10, 10);
		cal.mul(10, 10.5);

		cal.div(200, 100);
		cal.div(200.98, 20);

	}

}
