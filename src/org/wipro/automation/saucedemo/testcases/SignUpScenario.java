package org.wipro.automation.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.base.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;
import org.wipro.automation.saucedemo.pages.SignUpPage;

public class SignUpScenario extends InitiateBrowser{
	
	@Test
	public void validate_valid_Signup_functionality() throws IOException 
	{
		SignUpPage signUp = new SignUpPage(driver);

		signUp.clickCreatenewaccountButton();
		signUp.enter_firstname("John");
		signUp.enter_lastname("Lee");
		signUp.select_dob_month_name("Mar");
		signUp.select_dob_day_name("20");
		signUp.select_dob_year_name("2020");
		signUp.click_female_gender("Female");
		signUp.enter_signup_username("john.lee@gmail.com");
		signUp.enter_signup_password("tyuiop@123");
		signUp.click_SignupButton();

		LoginPage login = new LoginPage(driver);
		
		login.enter_username("john.lee@gmail.com");
		login.enter_password("tyuiop@123");
		login.clickLoginButton();

	}

}
