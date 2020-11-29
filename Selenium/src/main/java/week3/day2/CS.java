package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CS {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("HCL");
		l.add("Wipro");
		l.add("Aspire Systems");
		l.add("CTS");
	
		Collections.sort(l);
		for (int i = l.size()-1; i>=0; i--) {
			System.out.println(l.get(i));
		}
		
		String[] input = {"HCL", "Wipro",  "Infosys", "Aspire Systems", "CTS","Infosys"};
		
		Set<String> s = new HashSet<String>();
		
		
		  for (String eachValue : input) { 
			  s.add(eachValue);
		  }
		 System.out.println(s);
	
		
		
		
	}

}
