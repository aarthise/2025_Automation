package org.wipro.automation.saucedemo.testdata;

import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="login")
	public Object[][] login_data() {
		//String data1 ="user1";
		//Object[] data2 = {"user1","pass1"}; 
		Object[][] data3 ={{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
		return data3;
	}
	
	@DataProvider(name="signup")
	public Object[][] signup_data() {
		//String data1 ="user1";
		//Object[] data2 = {"user1","pass1"}; 
		Object[][] data3 ={{"John","lee","2000","user1","pass1"},{"David","Seo","2020","user2","pass2"},{"Rahul","Dravid","2021","user3","pass3"}};
		
		return data3;
	}

}
