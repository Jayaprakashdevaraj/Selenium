package week1.day1;

public class CsMobile {
	long mobileNumber = 8122212313L;
	float price = 17500.81f;
	String brand = "Redmi note 6 pro";
	boolean isFullCharge = true;
	

	public static void main(String[] args) {

		CsMobile mobile = new CsMobile();
		mobile.sendSMS();
		mobile.makeCall();
		mobile.takePhoto();
		System.out.println("my mobile number is "+mobile.mobileNumber);
		System.out.println("my mobile price is "+mobile.price);
		System.out.println("my mobile brand is "+mobile.brand);
		System.out.println("my mobile is" +mobile.isFullCharge);	
	}

	public void sendSMS() {
		System.out.println("Send sms to friend");
	}

	public void takePhoto() {
		System.out.println("Take selfie");
	}

	public void makeCall() {
		System.out.println("Make call to friend");
	}
}
