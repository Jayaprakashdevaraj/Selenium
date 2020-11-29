package week3.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String a= "madam";
		String b = "";
		char[] ch = a.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			b= b + a.charAt(i); 
		}
		if(a.equals(b)) {
			System.out.println("madam is palindrome");
		}else {
			System.out.println("madam is not palindrome");
		}

	}

}
