package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.BasePack.BaseClass;

public class Shipping_Page extends BaseClass 
{
	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proceed_shipment;
	
	@FindBy(id = "cgv")
	WebElement checkbox;
	
	@FindBy(xpath = "//a[@class='fancybox-item fancybox-close']")
	WebElement alertbox;
	
	
	public Shipping_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
    public void selectBox()
    {
    	checkbox.click();
    }
    
    public void alertBox()
    {
    	alertbox.click();
    }
    
    public void proceedfromShippingPage()
    {
    	proceed_shipment.click();
    }
}
