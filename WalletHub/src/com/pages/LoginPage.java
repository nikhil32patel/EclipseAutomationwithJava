/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author NIKHIL BHANVADIYA
 *
 */

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#email")
	WebElement emailid;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement button;

	public void logintofacebook(String Uemailid, String Pass) {
		emailid.clear();
		emailid.sendKeys(Uemailid);
		password.clear();
		password.sendKeys(Pass);
		button.click();
	}

}
