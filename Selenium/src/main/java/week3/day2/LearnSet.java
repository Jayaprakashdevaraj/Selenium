package week3.day2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {

		Set<Integer> values = new HashSet<Integer>();
		values.add(100);
		values.add(200);
		values.add(300);
		values.add(400);
		values.add(500);
		values.add(600);
		System.out.println(values);

		Set<Integer> values2 = new LinkedHashSet<Integer>();
		values2.addAll(values);
		System.out.println(values2);
		Set<Integer> values3 = new TreeSet<Integer>();
		values3.addAll(values);
		System.out.println(values3);
// to get single data		
		List<Integer> list = new ArrayList<Integer>();	
		list.addAll(values);
		
		System.out.println("to get sinle data : " +list.get(2));

	}
}
