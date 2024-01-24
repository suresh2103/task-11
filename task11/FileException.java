package task11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileException obj = new FileException();
		obj.readData();

	}

	public void readData() {
		String value = null;
		Properties prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Subasri Suresh\\OneDrive\\Desktop\\JavaFile.txt");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			System.out.println("File does not exits");

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		value = prop.getProperty("name");

		System.out.println(value);
	}

}
