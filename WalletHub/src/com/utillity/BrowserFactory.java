package com.utillity;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appurl) {
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 88.0.4324.96\\chromedriver.exe"; 
			System.setProperty("webdriver.chrome.driver",ChromeDriver);
			driver = new ChromeDriver(opt);
			
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}
		else if(browserName.equalsIgnoreCase("FireFox"))
		{
			
		}
		else
		{
			
		}
		
		
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		return driver; 
		
	}
	public static void quitBrower(WebDriver driver)
	{
		driver.quit();
	}
}
