package org.wipro.automation.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.saucedemo.utilities.ReadAllProp;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickCreatenewaccountButton () throws IOException
	{
		driver.findElement(By.xpath(ReadAllProp.readelement("login_create_new_account_xpath"))).click();;
		
	}
	
	public void enter_firstname (String firstname) throws IOException
	{
		
		driver.findElement(By.name(ReadAllProp.readelement("signup_firstname_name"))).sendKeys(firstname);
		
	}
	public void enter_lastname (String lastname) throws IOException
	{
		
		driver.findElement(By.name(ReadAllProp.readelement("signup_lastname_name"))).sendKeys(lastname);
		
	}

	public void select_dob_month_name (String dob_month) throws IOException
	{
		Select month = new Select(driver.findElement(By.name(ReadAllProp.readelement("signup_dob_month_name"))));
		month.selectByVisibleText(dob_month);
		
	}
	public void select_dob_day_name (String dob_day) throws IOException
	{
		Select day = new Select(driver.findElement(By.name(ReadAllProp.readelement("signup_dob_day_name"))));
		day.selectByVisibleText(dob_day);	
		
	}

	public void select_dob_year_name (String dob_year) throws IOException
	{
		Select year = new Select(driver.findElement(By.name(ReadAllProp.readelement("signup_dob_year_name"))));
		year.selectByVisibleText(dob_year);
	}
	public void click_female_gender (String signup_gender) throws IOException
	{
		
		driver.findElement(By.xpath(ReadAllProp.readelement("signup_gender_female_xpath"))).click();
		
	}

	public void enter_signup_username (String SignupUsername) throws IOException
	{
		
		driver.findElement(By.name(ReadAllProp.readelement("signup_username_name"))).sendKeys(SignupUsername);
		
	}

	public void enter_signup_password (String SignupPassword) throws IOException
	{
		driver.findElement(By.name(ReadAllProp.readelement("signup_password_name"))).sendKeys(SignupPassword);
		
	}

	public void click_SignupButton() throws IOException
	{
		driver.findElement(By.name(ReadAllProp.readelement("signup_Signup_button_name"))).click();;
		
	}


}
