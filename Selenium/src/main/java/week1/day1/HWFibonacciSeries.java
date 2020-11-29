package week1.day1;

public class HWFibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i;

		for(i=1 ; i<=10; i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
