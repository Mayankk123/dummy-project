package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class Summary_Page extends BaseClass
{
	@FindBy(xpath="//i[@class='icon-plus']")
	WebElement plus;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	WebElement proceed;
	
	public Summary_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addproduct()
	{
		plus.click();
	}
	
	public Address_Page proceedFromSummaryPage()
	{
		proceed.click();
		return new Address_Page();
	}

}
