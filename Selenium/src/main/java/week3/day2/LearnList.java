package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		
		List<String> values = new ArrayList<String>();
		
		values.add("Jp");
		values.add("RAM");
		values.add("ABC");
		values.add("sam");
		values.add("Jp");
		values.add("abcd");
		
		List<Integer> values1 = new ArrayList<Integer>();
		values1.add(100);
		values1.add(200);

// to get size
		System.out.println(values.size()); 
		
		
// to get 3rd value
		System.out.println(values.get(2));
// to get 3rd value
		System.out.println(values.get(values.size()-1));
// iteration
		System.out.println("*************for loop******************");
		for (int i =  values.size()-1; i>=0; i--) {
			System.out.println(values.get(i));
			
		}
	
		System.out.println("*************foreach loop*******************");

		for (String eachvalue : values) {
			System.out.println(eachvalue);
			
		}
		
// remove
		System.out.println(values.remove(4));
		
// copy all vales from one to another list
		List<String> values2 = new ArrayList<String>();
		
		values2.addAll(values);
	System.out.println("***********new list**********");
	System.out.println(values2);
		

		
	
	}

}
