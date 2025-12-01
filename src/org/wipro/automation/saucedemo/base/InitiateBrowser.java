package org.wipro.automation.saucedemo.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.saucedemo.utilities.ReadAllProp;

public class InitiateBrowser {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		

		if(ReadAllProp.readconfig("BrowserName").equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
			
		} 
		else if (ReadAllProp.readconfig("BrowserName").equalsIgnoreCase("Edge")) 
		{
			
			driver =  new EdgeDriver();
			System.out.println("INITIATEBROWSERedge"+driver);
			
		}
		
		else if (ReadAllProp.readconfig("BrowserName").equalsIgnoreCase("Firefox")) 
		
		{
			driver =  new FirefoxDriver();
			
		}
		else if (ReadAllProp.readconfig("BrowserName").equalsIgnoreCase("Safari")) 
		
		{
			driver =  new SafariDriver();
					
		}
		else 
		{
			driver = new ChromeDriver();
			
		}
		
		driver.get(ReadAllProp.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}

	@AfterMethod
	public void closeBrowser() 
	{
		//driver.quit();
	}

}
