package week1.assignments;

import java.util.Arrays;

public class FindingSecondLargest {
	
	
	public static void main(String[] args) {
		
	
	int[] abc = {10,20,5,7,30,18,64};
	
	Arrays.sort(abc);
	
	int l = abc.length;
	
	System.out.println(abc[l-2]);
	
	}
}
