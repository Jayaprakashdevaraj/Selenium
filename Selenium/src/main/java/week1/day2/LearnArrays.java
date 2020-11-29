package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		
		int[] values = new int[3];
		values[0]=100;
		values[1]=20;
		values[2]=300;
		
		//another way
		String[] abc= {"jp","Jaya","prakash"};
		
		for(int i=0;i<values.length; i++) {
			System.out.println(values[i]);
		}
		for(int i=values.length-1;i>=0; i--) {
			System.out.println("reverse order is "+values[i]);
		}
		Arrays.sort(values);
		for(int i=0;i<values.length; i++) {
			System.out.println("After sorting "+values[i]);
		}
		
		for (String eachvalue : abc) {
			System.out.println(eachvalue);
		}

	}

}
