package org.xyz.automation.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	public static void testresults(WebDriver driver,String name) throws IOException 
	{
		TakesScreenshot tss = (TakesScreenshot) driver;
		File f = tss.getScreenshotAs(OutputType.FILE);
		File fd = new File("./screenshot_11Nov/" + name +"test.png");
		FileUtils.copyFile(f, fd);
	}
}
