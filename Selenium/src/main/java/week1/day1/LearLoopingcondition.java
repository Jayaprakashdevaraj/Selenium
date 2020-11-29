package week1.day1;

public class LearLoopingcondition {
	public static void main(String[] args) {

		// print 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("Increment "+i);
		}
		// decrement
		for (int j = 10; j > 0; j--) {
			System.out.println("decrement " + j);
		}

		// print even no only
		for (int a = 1; a <= 10; a++) {
			if (a%2==0) {
				System.out.println("Even nos from 1 to 10 is "+a);
			}
		}

	}

}
