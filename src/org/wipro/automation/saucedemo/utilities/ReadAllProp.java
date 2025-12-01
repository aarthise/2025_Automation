package org.wipro.automation.saucedemo.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadAllProp {
	
	public static String readconfig(String key) throws IOException {
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelement(String key) throws IOException {
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

}
