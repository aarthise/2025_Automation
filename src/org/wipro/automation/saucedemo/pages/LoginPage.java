package org.wipro.automation.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.saucedemo.utilities.ReadAllProp;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username (String uname) throws IOException
	{
		
		driver.findElement(By.id(ReadAllProp.readelement("login_username_id"))).sendKeys(uname);
		
	}

	public void enter_password (String pass) throws IOException
	{
		driver.findElement(By.name(ReadAllProp.readelement("login_Password_name"))).sendKeys(pass);
		
	}
	
	public void clickLoginButton () throws IOException
	{
		driver.findElement(By.cssSelector(ReadAllProp.readelement("login_loginbtn_css"))).click();;
		
	}
}
