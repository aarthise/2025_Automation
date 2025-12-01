package org.wipro.automation.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css ="[type='submit']")
	WebElement loginBttn;
	
	public void enter_username (String uname) throws IOException
	{
		
		//driver.findElement(By.id(ReadAllProp.readelement("login_username_id"))).sendKeys(uname);
		username.sendKeys(uname);
	}

	public void enter_password (String pass) throws IOException
	{
		//driver.findElement(By.name(ReadAllProp.readelement("login_Password_name"))).sendKeys(pass);
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() throws IOException
	{
		loginBttn.click();
		
	}
}
