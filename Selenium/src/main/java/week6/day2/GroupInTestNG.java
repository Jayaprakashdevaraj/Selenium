package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class GroupInTestNG {
	
	@Test(groups = {"smoke"})
	public void createLead() {
		System.out.println("Createlead");
		throw new NoSuchElementException();
	}

	@Test(groups = {"regression"}, dependsOnGroups = {"smoke"})
	public void editLead() {
		System.out.println("Edit lead");
	}
	@Test(groups = {"function"})
	public void deleteLead() {
		System.out.println("delete lead");
	}

	@Test(groups = {"function","smoke"})
	public void duplicateLead() {
		System.out.println("duplicate lead");
	}

	
	
}
