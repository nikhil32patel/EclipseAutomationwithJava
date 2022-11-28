/**
 * 
 */
package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.facbookPostPage;
import com.utillity.BrowserFactory;

/**
 * @author NIKHIL BHANVADIYA
 *
 */
public class LoginTestFacebook 
{
	WebDriver driver;
	@BeforeSuite
	public void startBrowser()
	{
		driver = BrowserFactory.startApplication(driver,"Chrome","https://en-gb.facebook.com/login/");
	}
	@Test
	public void LoginApplication()
	{
		LoginPage ObjloginPage = new LoginPage(driver);
		ObjloginPage.logintofacebook("nikhil32patel@gmail.com","Booknick@#1990");
		
		facbookPostPage ObjfacbookPostPage = new facbookPostPage(driver); 
		ObjfacbookPostPage.post("hi guys");
	}
	@AfterSuite
	public void quitBrowser()
	{
		BrowserFactory.quitBrower(driver);
	}

}
