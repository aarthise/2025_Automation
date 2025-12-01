package org.xyz.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalendarDemo {

	
	@Test(enabled=false)
	public void iconbasedcalendar() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//[data-cy='outsideModal']")).click();
		//calendar.sendKeys("2025-05-17");
		//calendar.click();
		driver.findElement(By.cssSelector("[data-cy='closeModal']")).click();
		
		driver.findElement(By.cssSelector("[data-cy='departureDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[aria-label='Wed Nov 12 2025']")).click();

	}
	
	@Test()
	public void textbasedcalendar(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/calendars/");
		WebElement calendar = driver.findElement(By.xpath("//input[contains(@id,'selectorenteradate')]"));
		calendar.sendKeys("2025-05-17");
		calendar.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(@class,'pushbutton-wide')]"));	
		submitButton.click();
	}
}
