package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Different_controls_FB {

	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
		
	}
	
	@Test
	public void tc01_Validate_login_functionality_valid_credentials() throws InterruptedException {
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("aarthi.se@gmail.com");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.close();*/
	
	}
	
	@Test
	public void tc02_Validate_signup_functionality_valid_data() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sara");
		driver.findElement(By.name("lastname")).sendKeys("Mathews");
		
		
		Select dob_month = new Select(driver.findElement(By.name("birthday_month")));
		//dob_month.selectByValue("Mar");//did not work, need to check why
		dob_month.selectByVisibleText("Aug");
		Select dob_day = new Select(driver.findElement(By.name("birthday_day")));
		dob_day.selectByIndex(6);//7
		/*dob_day.selectByValue("2");
		dob_day.selectByVisibleText("5");
		dob_day.deselectAll();*/

		Select dob_year = new Select(driver.findElement(By.name("birthday_year")));
		dob_year.selectByValue("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("Queen1@mygmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("1okayigotit");
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(2000);
		//xname("//a[text()='Create new account']")).click();
		
		
	}
}
