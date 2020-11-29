package week1.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		
		int[] a = {10,5,20,5,7,10,30,18,64,7};
		
		Arrays.sort(a);
		
		for(int i=0 ; i<a.length ; i++ ) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
			
		}


	}

}
