package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserControl {

	@Test
	public void tc_01_Validate_login_functionality_valid_credentails() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.navigate().to("https://www.saucedemo.com/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("[value='Login']")).click();
	Thread.sleep(1000);
	driver.close();
	driver.quit();
	}
}
