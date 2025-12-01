package org.xyz.automation.project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKBMouseWindows
{

	@Test
	public void handleKeyboard() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		Actions  act = new Actions(driver);
		act.sendKeys("user1").perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE).perform();
		/*act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1").perform();
		act.sendKeys(Keys.ENTER).perform();*/

	}
	
			
		
}
