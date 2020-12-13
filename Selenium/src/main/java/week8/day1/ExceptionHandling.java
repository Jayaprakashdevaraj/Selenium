package week8.day1;

public class ExceptionHandling {
	public int divide(int a ,int b) {
		int result;
		if(a> b) {
			throw new ArithmeticException("second no is greater than first");
		}else {
		
		 result = a/ b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		ExceptionHandling le = new ExceptionHandling();
		
		try {
		int divide =le.divide(5, 10);
		System.out.println(divide);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}
}		