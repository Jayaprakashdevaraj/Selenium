package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		String s1 = "Jayaprakash is online selenium class ";
		String s2 = new String("Jp");
		
		String s4 = s2.concat("12");
		System.out.println(s4);
		
		String[] words = s1.split(" ");
		for (int i = words.length-1; i >=0 ; i--) {
			System.out.println(words[i]);
		}
		
		
		String s6 = "Wel123come4567";
		System.out.println(s6.replaceAll("[^0-9]", ""));
		System.out.println(s6.substring(2, 7));

	}

}
