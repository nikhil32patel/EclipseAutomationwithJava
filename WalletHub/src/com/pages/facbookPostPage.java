package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facbookPostPage 
{
	WebDriver driver;
	
	@FindBy(css = ".q5xnexhs")
	WebElement selfImage;
	
	@FindBy(css = "div[data-pagelet=\"ProfileComposer\"] span")
	WebElement whatOnYourMindElement;
	
	@FindBy(css = ".o8yuz56k ._5rp7 span")
	WebElement txtWhatOnYourMind;
	
	@FindBy(xpath = "//*[text()='Post']")
	WebElement btnPost;
	
	
	 public facbookPostPage(WebDriver driver) 	
	{
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void post(String InputText)
	{
		selfImage.click();
		
		whatOnYourMindElement.click();
		
		txtWhatOnYourMind.sendKeys(InputText);
		
		btnPost.click();
		
	}
	

}
