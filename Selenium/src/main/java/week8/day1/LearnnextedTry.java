package week8.day1;

public class LearnnextedTry {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;

		int[] a = { 1, 2, 3, };

		try {
			int z = x / y;
			System.out.println(z);
			try {
			System.out.println(a[3]);

			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
			
		System.out.println("this is last line of program");
	
		
	}
}
