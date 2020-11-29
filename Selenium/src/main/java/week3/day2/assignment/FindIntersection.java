package week3.day2.assignment;


public class FindIntersection {

	public static void main(String[] args) {
		
		
		int[] a = new int[] {3, 2, 11,4,6,7};	 
		int[] b = new int[] {1,2,8,4,9,7}; 
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
		}

	}

}
