package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("connect to whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("take new video---smart phone");
	}
	
	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.sendMsg();
		phone.makeCall();
		phone.saveContact();
		phone.takeVideo();
		phone.connectWhatsApp();
	}
}
