package week3.day2.assignment;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] word = text.split(" ");
		for (int i = 0; i <= word.length - 1; i++) {
			System.out.println(word[i]);
			for (int j = 1; j <= word.length - 1; j++) {

				if (word[i].equals(word[j]))
					count++;

			}
			System.out.println(count);

		}
	}

}
