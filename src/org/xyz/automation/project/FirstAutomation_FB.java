package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstAutomation_FB {

	@Test
	public void tc01_Validate_login_functionality_valid_credentials() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("aarthi.se@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.close();
		
		
	}
}
