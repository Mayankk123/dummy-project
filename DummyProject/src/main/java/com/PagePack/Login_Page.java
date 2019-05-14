package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class Login_Page extends BaseClass
{
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement search;
	
	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-default button-search']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//div/a[@href='http://automationpractice.com/index.php?controller=contact']")
	WebElement contactus;
	
	public Login_Page()
	{
		//Initilizing the Page Factory objects
		
		PageFactory.initElements(driver, this);
	}
	
	public Search_Page enter_element(String ob)
	{
		search.sendKeys(prop.getProperty("searchitem"));
		searchbutton.click();
		System.out.println("Searching done successfully");
		return new Search_Page();
	}
	
	public ContactUs contactpage()
	{
		contactus.click();
		return new ContactUs();
	}
	
}
