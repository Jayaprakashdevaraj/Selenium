package week1.day1;

public class BasicCar {
	
	String brandName = "Skoda";
	int numWheels = 4;
	boolean isPuncher = false;
	char fuelType ='p';
	double carPrice = 12345.678904;
		
	public void driveCar() {
		System.out.println("Drive CAR");
		System.out.println(brandName);
		short regNum = 1234; // not able to call apart from this method
		
	}

	public void applyBreak() {
		System.out.println("Break apply");
		System.out.println(numWheels);
	}

	public static void main(String[] args) {

		BasicCar myCar = new BasicCar();

		myCar.applyBreak();
		myCar.driveCar();
		System.out.println(myCar.fuelType);
		System.out.println(myCar.isPuncher);
		

	}

}
