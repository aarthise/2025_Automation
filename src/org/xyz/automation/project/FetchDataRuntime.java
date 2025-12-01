package org.xyz.automation.project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchDataRuntime {

	
	@Test
	public void tc01_validate_login_functionality_valid_credentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String expURL = "https://www.facebook.com/";
		driver.get(expURL);
		String actURL = driver.getCurrentUrl();
		
		assertEquals(actURL, expURL);
		
		String expLoginTitle = "Facebook - log in or sign up";
				
		String actLoginTitle = driver.getTitle();
		
		assertEquals(actLoginTitle, expLoginTitle);
				
		String exp_username = "Email or phone number";
		String act_username = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(act_username);
		assertEquals(act_username,exp_username);
		
		String exp_Login = "Log In";
		String act_Login = driver.findElement(By.name("login")).getText();
		assertEquals(exp_Login,act_Login);
		
		//System.out.println(driver.findElement(By.name("login")).getLocation());
	
		//System.out.println(driver.getPageSource());
	}
}
