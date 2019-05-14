package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class Address_Page extends BaseClass
{
	@FindBy(xpath = "//textarea[@class='form-control']")
	WebElement addCom;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	WebElement proceed;
	
	public Address_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addcomment(String element)
	{
		addCom.sendKeys(prop.getProperty("comment"));
	}
	
	public void proceedFromAddressPaage()
	{
		proceed.click();
	}

}
