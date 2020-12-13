package week8.day1;

public interface LearnFinally {

public static void main(String[] args) {
	
	
		int x= 10;
		int y =0;
		
		int[] a = {1,2,3,};
		
		try {
		int z = x/y;
		System.out.println(z);
		System.out.println(a[3]);	
		}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
		}finally{
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			System.out.println("it is very important, which should be execute always");
		}

			
		
		System.out.println("this is last line of program");
				
	}
	}

