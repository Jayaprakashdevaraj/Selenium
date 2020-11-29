package week5.day1;

import org.testng.annotations.Test;

public class LearnAttribute {
	@Test(invocationCount =3)
	public void createLead() {
		System.out.println("Create Lead");
	}

	@Test
	public void editLead() {
		System.out.println("edit Lead");
	}

	@Test
	public void deleteLead() {
		System.out.println("delete Lead");
	}

	@Test(enabled =false)
	public void createLead1() {
		System.out.println("Create Lead 1");
	}
	@Test(dependsOnMethods = "createLead3")
	public void createLead2() {
		System.out.println("Create Lead 2");
	}
	@Test
	public void createLead3() {
		System.out.println("Create Lead 3");
	}

	
	
}
