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

public class AddressPage_test extends BaseClass
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	Search_Page search;
	Summary_Page summary;
	Address_Page address;
	
	public AddressPage_test()
	{
		super();
	}
	
	@BeforeClass
	public void init()
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
	}
	
	@Test
	public void addcomments()
	{
		address = new Address_Page();
		address.addcomment("comment");
	}
	
	@Test
	public Shipping_Page proceed()
	{
		address = new Address_Page();
		address.proceedFromAddressPaage();
		return new Shipping_Page();
	}
	
	@AfterClass
	public void endAddress()
	{
		//driver.quit();
	}

}
