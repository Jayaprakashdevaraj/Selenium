package week3.day2.assignment;

public class ReverseString {

	public static void main(String[] args) {

		String test = "feeling good";
		char[] charArray = test.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);

		}
		
		System.out.println(charArray[5]);
	}

}
