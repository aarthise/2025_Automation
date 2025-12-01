package org.wipro.automation.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.base.InitiateBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;
import org.wipro.automation.saucedemo.testdata.DataGenerator;

public class LoginScenario_DDF extends InitiateBrowser{
	
	@Test(dataProvider="login",dataProviderClass=DataGenerator.class)
	public void validate_valid_login_credentials(String username,String password) throws IOException 
	{
		LoginPage login = new LoginPage(driver);
		//LoginPage_PF login =new LoginPage_PF(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.clickLoginButton();
		
	}
	
}
