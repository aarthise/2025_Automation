package mytraining;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {

	public static void readtextdata() throws IOException {
		//File f = new File("C:\\Users\\karth\\eclipse-workspace\\2025_QA Training\\TestData\\data.txt");
		
		FileReader fr = new FileReader("./TestData/data.txt");
		//"C:\\Users\\karth\\eclipse-workspace\\2025_QA Training\\TestData\\data.txt"
		int r = fr.read();
		while(r!=-1) {
			
			System.out.print((char)(r));
			r=fr.read();
		
		}
		
	}		
		public static void readprop() throws IOException {
		
			FileReader fr = new FileReader("./TestData/config.properties");
			Properties prop = new Properties();
			prop.load(fr);
			System.out.println(prop.get("prog"));
			System.out.println(prop.get("automation"));
			
			//C:\\Users\\karth\\eclipse-workspace\\2025_QA Training\\TestData\\config.properties
			}
		
	public static void main(String[] args) throws IOException {
		readtextdata();
		readprop();
	}
	
}
