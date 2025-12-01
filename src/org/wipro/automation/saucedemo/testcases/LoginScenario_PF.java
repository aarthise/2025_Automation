package org.wipro.automation.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.base.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;
import org.wipro.automation.saucedemo.pages.LoginPage_PF;

public class LoginScenario_PF extends InitiateBrowser{
	
	@Test
	public void validate_valid_login_credentials() throws IOException 
	{
		LoginPage_PF login_pf =new LoginPage_PF(driver);
		login_pf.enter_username("user1");
		login_pf.enter_password("pass1234");
		login_pf.clickLoginButton();
		
	}

}
