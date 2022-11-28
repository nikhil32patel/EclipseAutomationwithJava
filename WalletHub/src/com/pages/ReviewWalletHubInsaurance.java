package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class ReviewWalletHubInsaurance {
	WebDriver driver;

	public ReviewWalletHubInsaurance(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"reviews-section\"]/div[1]/div[3]/review-star/div")
	WebElement reviewhover;

	// @FindBy(xpath =
	// "/html/body/web-app/div/div[1]/main/div[2]/div/div[3]/section/div[1]/div[3]/review-star/div/svg[4]/g/path[1]")
	// @FindBy(css=path:containt('M16.862 2.398l3.372 10.567h11.091l-8.918 6.52
	// 3.372 10.567-8.918-6.52-8.993 6.52
	// 3.447-10.567-8.993-6.52h11.091l3.447-10.567z'))
	@FindBy(className = "rv review-action ng-enter-element")
	WebElement clickonfourthstar;

	public void HoveronReview(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");

		try {

			Actions Objact = new Actions(driver);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();
			Thread.sleep(3000);
			Objact.moveToElement(reviewhover).perform();

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		try {

			/*
			 * Thread.sleep(3000); JavascriptExecutor JsStart =(JavascriptExecutor)driver;
			 * JsStart.executeScript("arguments[0].click()",clickonfourthstar);
			 */

			clickonfourthstar.click();

		} catch (Exception e) {
			System.out.print(e.getLocalizedMessage());
		}
	}

}
