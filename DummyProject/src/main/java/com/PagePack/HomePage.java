package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class HomePage extends BaseClass 
{
	//PageFactory
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signup;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order']")
	WebElement cart;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AuthenticationPage getsignup()
	{
		signup.click();
		return new AuthenticationPage();
	}
	
	public Summary_Page gotoCart()
	{
		cart.click();
		return new Summary_Page();
	}
	
	
	
	

}
