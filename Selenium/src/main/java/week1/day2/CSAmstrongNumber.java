package week1.day2;

public class CSAmstrongNumber {
	
	public static void main(String[] args) {
		
	
	
	int input = 153;
	int calculated=0, remainder, original;
	original=input;
		while(input >0) {
			remainder = input %10;
			input=input/10;
			calculated =calculated +(remainder*remainder*remainder);
						
		}
		if(original==calculated) {
			System.out.println("given no is Anstrong Number");
		}else {
			System.out.println("given no is not Anstrong Number");
		}
	}	
	}


