package org.xyz.automation.project;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKBMousewindows_Mphasis {

	Actions act;
	WebDriver driver;
	
	
	@Test
	public void handleFrames() throws InterruptedException, IOException{
		
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText());
		CaptureScreenshot.testresults(driver,"handleFrames");
	}
	
	@Test(enabled=true)
	public void handleAlerts() throws InterruptedException, IOException{
		
		driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.className("signin-btn")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		CaptureScreenshot.testresults(driver, "handleAlerts");
		}

	
	@Test(enabled=false)
	public void handleMouse() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();//right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		//act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();

		driver.switchTo().window(win2);
		driver.switchTo().window(win1);

	}
	
	/*@Test//(enabled=false)
	public void handleKeyboard() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//h5[contains(text(), 'Interactions')]")).click();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement listItem = driver.findElement(By.xpath("//ul[contains(@class, 'menu-list')]//li[@id='item-3']"));
		listItem.click();
		act.sendKeys(Keys.PAGE_UP).perform();
	}*/
}
