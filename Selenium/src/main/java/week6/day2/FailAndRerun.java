package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class FailAndRerun {
	
	@Test(retryAnalyzer = RetryFailedTC.class)
	public void createLead() {
		System.out.println("Createlead");
		throw new NoSuchElementException();
	}

	@Test
	public void editLead() {
		System.out.println("Edit lead");
	}
	@Test
	public void deleteLead() {
		System.out.println("delete lead");
	}

	@Test
	public void duplicateLead() {
		System.out.println("duplicate lead");
	}

	
	
}
