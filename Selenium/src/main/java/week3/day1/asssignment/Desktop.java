package week3.day1.asssignment;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("desktopSize is 14inch");
	}

	public static void main(String[] args) {
		Desktop d= new Desktop();
		d.computerModel();
		d.computerRate();
		d.desktopSize();
	}
}
