/**
 * 
 */
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author NIKHIL BHANVADIYA
 *
 */
public class SignUpWalletHub {
	
	WebDriver driver;
	public SignUpWalletHub(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(name = "em") 
	  WebElement emailid;
	  
	  @FindBy(name = "pw1") 
	  WebElement password;
	  
	  @FindBy(name = "pw2") 
	  WebElement Conpassword;
	  
	  @FindBy(xpath = "//*[@id=\"join-light\"]/form/div/div[4]")
	  WebElement chkbxofreecreditscore;
	  
	  @FindBy(xpath = "//*[@id=\"join-light\"]/form/div/div[6]/button") 
	  WebElement button;
	  
	  public void SignUptoWallethub(String Uemailid,String Pass,String ConPass) 
	  {
		  emailid.clear();
		  emailid.sendKeys(Uemailid);
		  
		  password.clear();
		  password.sendKeys(Pass); 
		  
		  Conpassword.clear();
		  Conpassword.sendKeys(ConPass);
		  
		  try
		  {
			  
			  chkbxofreecreditscore.click();
			  
		  }
		  catch (Exception e)
		  {
			  System.out.print(e.getLocalizedMessage());
			  
		  }
		  button.click(); 
	  }
	
	

}
