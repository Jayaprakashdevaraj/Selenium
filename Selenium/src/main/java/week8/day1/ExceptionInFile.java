package week8.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ExceptionInFile {

	public void loadFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("./src/test/resource");
	}
	
	public static void main(String[] args) {

		/*
		 * try { FileInputStream fis = new FileInputStream("./src/test/resource");
		 * }catch(FileNotFoundException e) { System.out.println(e); }
		 */
	}
}
