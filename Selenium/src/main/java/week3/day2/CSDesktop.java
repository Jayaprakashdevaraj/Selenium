package week3.day2;

public class CSDesktop  implements CSSoftware ,  CSHardware{

	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}

	public void softwareResources() {
		System.out.println("softwareResources");
		
	}

	public void desktopModel() {
		System.out.println("desktopModel");
	}

	public static void main(String[] args) {
		
		CSDesktop d = new CSDesktop();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
		
		
	}
	
}
