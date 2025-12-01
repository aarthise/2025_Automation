package org.xyz.automation.project;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstAutomation {
	
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	/*@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.close();
	}*/
	@Test
	public void tc_01_Validate_login_functionality_valid_credentails() throws InterruptedException
	{
	
			
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		//username.clear();
		//username.sendKeys("normal_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce1234");
		driver.findElement(By.cssSelector("[value='Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("[data-test='error']")),"Epic sadface: Username and password do not match any user in this service" ));
		/*if(driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed()) {
			System.out.println(driver.findElement(By.cssSelector("[data-test='error']")).getText());
		}*/
			/*if(driver.findElement(By.className("error-button")).isDisplayed()) {
			System.out.println(driver.findElement(By.className("error-button")).getText());
		}*/
	}

	/*@Test
	public void tc_02_Validate_product_page() throws InterruptedException {
		String act_page2 = driver.findElement(By.className("title")).getText();
		System.out.println(act_page2);
		String exp_page2 = "Products";
		assertEquals(act_page2, exp_page2);	
	}
	
	@Test
	public void tc_03_Validate_product_page() throws InterruptedException {
		String act_page2 = driver.findElement(By.className("title")).getText();
		System.out.println(act_page2);
		String exp_page2 = "Products";
		assertEquals(act_page2, exp_page2);	
	}*/
}
