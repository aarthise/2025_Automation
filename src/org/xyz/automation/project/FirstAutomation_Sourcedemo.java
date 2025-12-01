package org.xyz.automation.project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstAutomation_Sourcedemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
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
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[value='Login']")).click();
		Thread.sleep(1000);
		String act_page2 = driver.findElement(By.className("title")).getText();
		System.out.println(act_page2);
		String exp_page2 = "Products";
		assertEquals(act_page2, exp_page2);	
		String element1 = driver.findElement(By.partialLinkText("Sauce Labs Backpack")).getText();
		String element2 = driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).getText();
		String element3 = driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).getText();
		String element4 = driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).getText();
		String element5 = driver.findElement(By.partialLinkText("Sauce Labs Onesie")).getText();
		String element6 = driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).getText();
		/*System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);
		System.out.println(element4);
		System.out.println(element5);
		System.out.println(element6);*/
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		//driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		//driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		//driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		//driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.PAGE_DOWN).perform();
		//actions.sendKeys(Keys.END).perform();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(1000);
		//actions.sendKeys(Keys.PAGE_UP).perform();
		driver.findElement(By.name("firstName")).sendKeys("Maggie");
		driver.findElement(By.id("last-name")).sendKeys("Sullavian");
		driver.findElement(By.id("postal-code")).sendKeys("30328");
		//actions.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("continue")).click();
		String checkout = driver.findElement(By.cssSelector("[data-test='title']")).getText();
		System.out.println(checkout);
		//actions.sendKeys(Keys.END).perform();
		driver.findElement(By.name("finish")).click();
		actions.sendKeys(Keys.PAGE_UP).perform();
		driver.findElement(By.className("complete-header"));
		Thread.sleep(1000);
		//driver.findElement(By.className("class='complete-header'"));


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
