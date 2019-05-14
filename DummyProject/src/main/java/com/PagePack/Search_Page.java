package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class Search_Page extends BaseClass 
{
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement product;
	
	@FindBy(xpath = "//div/p[@id='add_to_cart']")
	WebElement add;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium'and//a[@href='http://automationpractice.com/index.php?controller=order']]")
	WebElement checkout;
	
	public Search_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_product()
	{
		Actions action = new Actions(driver);
		action.moveToElement(product).click().build().perform();
	}
	
	public void switchtoframes()
	{
		//driver.switchTo().frame("authiframe");
		driver.switchTo().frame(0);
	}
	
	public void switchoutframe()
	{
		driver.switchTo().defaultContent();
	}
	
	public void addtocart()
	{
		add.click();
	}
	
	public Summary_Page checkout_test()
	{ 
		checkout.click();
		return new Summary_Page();
	}

}