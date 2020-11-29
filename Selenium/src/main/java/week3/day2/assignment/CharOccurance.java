package week3.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {

		String s = "welcome to chennai";
		char[] charArray = s.toCharArray();
		int Count = 0;
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]=='e') {
			
				Count++;
				
			}
			
		}
		System.out.println("no of char e is : "+Count);
	}

}
