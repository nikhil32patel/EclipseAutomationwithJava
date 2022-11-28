package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.utillity.BrowserFactory;
import com.pages.SignUpWalletHub;

public class TestSignUpWallethub 
{

	
	WebDriver driver;
	@BeforeSuite
	public void startBrowser()
	{
		driver = BrowserFactory.startApplication(driver,"Chrome","https://wallethub.com/join/light");
	}
	@Test
	public void SignUpApplication()
	{
		SignUpWalletHub ObjSignUpWalletHub = new SignUpWalletHub(driver);
		ObjSignUpWalletHub.SignUptoWallethub("nikhil32patel@gmail.com","Wh@#1990","Wh@#1990");
	}
	@AfterSuite
	public void quitBrowser()
	{
		//BrowserFactory.quitBrower(driver);
	}
}
