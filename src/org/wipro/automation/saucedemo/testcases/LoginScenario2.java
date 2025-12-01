package org.wipro.automation.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.base.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;

public class LoginScenario2 extends InitiateBrowser{
	
	@Test
	public void validate_valid_login_credentials() throws IOException 
	{
		LoginPage login = new LoginPage(driver);
		//LoginPage_PF login =new LoginPage_PF(driver);
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.clickLoginButton();
		
	}

}
