package week3.day2;

public class CSCollege extends CSUniversity{

	@Override
	public void ug() {
		System.out.println("Unimplement method -UG");
		
	}
	
	public static void main(String[] args) {
		
		CSCollege c =new CSCollege();
		c.pg();
		c.ug();
	}

}
