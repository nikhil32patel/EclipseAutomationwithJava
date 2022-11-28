/**
 * 
 */
package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.SignUpWalletHub;
import com.utillity.BrowserFactory;

/**
 * @author NIKHIL BHANVADIYA
 *
 */
public class ReviewWalletHubInsaurance {

	WebDriver driver;

	@BeforeSuite
	public void startBrowser() {
		driver = BrowserFactory.startApplication(driver, "Chrome",
				"http://wallethub.com/profile/test_insurance_company/");
	}

	@Test
	public void reviewInsaurance() throws Exception {
		com.pages.ReviewWalletHubInsaurance ObjReviewWhub = new com.pages.ReviewWalletHubInsaurance(driver);
		ObjReviewWhub.HoveronReview(driver);

	}

	@AfterSuite
	public void quitBrowser() {
		// BrowserFactory.quitBrower(driver);
	}

}
