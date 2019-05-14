package com.testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.Address_Page;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;
import com.PagePack.Login_Page;
import com.PagePack.Search_Page;
import com.PagePack.Shipping_Page;
import com.PagePack.Summary_Page;
import com.utilPack.Alert_CLass;

public class ShippingPage_test extends BaseClass
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	Search_Page search;
	Summary_Page summary;
	Address_Page address;
	Shipping_Page shipping;
	Alert_CLass alert; 
	
	public ShippingPage_test()
	{
		super();
	}
	
	@BeforeClass
	public void initShipping()
	{
		setup();
		home = new HomePage();
		home.getsignup();
		
		aut= new AuthenticationPage();
		aut.login();
		
		log= new Login_Page();
		log.enter_element("searchitem");
		home.scroll();
		
		search = new Search_Page();
		search.click_product();
		search.switchtoframes();
		search.addtocart();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		search.checkout_test();
		
		summary = new Summary_Page();
		summary.addproduct();
		summary.proceedFromSummaryPage();
		
		address = new Address_Page();
		address.proceedFromAddressPaage();
	}
	
	@Test(priority=1)
	public void proceedwithoutAccept()
	{
		shipping = new Shipping_Page();
		shipping.proceedfromShippingPage();
	}
	@Test(priority=2)
	public void alerthandel()
	{
		shipping.alertBox();
	}
	@Test(priority=3)
	public void clickbox()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		shipping.selectBox();
		shipping.proceedfromShippingPage();
	}
	
	@AfterClass
	public void exit()
	{
		//driver.quit();
	}
}
