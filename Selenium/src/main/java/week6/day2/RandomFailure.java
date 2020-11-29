package week6.day2;

import org.testng.annotations.Test;

public class RandomFailure {
	
	@Test(timeOut = 500)
	public void testcase1() throws InterruptedException {
		int ranNum = (int) (Math.random()*1000);   // here int using to get whole number
		System.out.println(ranNum);
		Thread.sleep(ranNum);   //now testcase exe time random
	}

}
