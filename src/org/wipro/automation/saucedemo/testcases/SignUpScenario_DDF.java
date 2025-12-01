package org.wipro.automation.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.base.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;
import org.wipro.automation.saucedemo.pages.SignUpPage;
import org.wipro.automation.saucedemo.testdata.DataGenerator;

public class SignUpScenario_DDF extends InitiateBrowser{
	
	@Test(dataProvider="signup",dataProviderClass=DataGenerator.class)
	public void validate_valid_Signup_functionality(String firstname,String lastname,String year,String username,String password) throws IOException 
	{
		SignUpPage signUp = new SignUpPage(driver);

		signUp.clickCreatenewaccountButton();
		signUp.enter_firstname(firstname);
		signUp.enter_lastname(lastname);
		signUp.select_dob_month_name("Mar");
		signUp.select_dob_day_name("20");
		signUp.select_dob_year_name(year);
		signUp.click_female_gender("Female");
		signUp.enter_signup_username(username);
		signUp.enter_signup_password(password);
		//signUp.click_SignupButton();

		/*
		 * LoginPage login = new LoginPage(driver);
		 * 
		 * login.enter_username("john.lee@gmail.com");
		 * login.enter_password("tyuiop@123"); login.clickLoginButton();
		 */
	}

}
