package com.testPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;
import com.PagePack.Login_Page;
import com.PagePack.Search_Page;

public class SearchPage_test extends BaseClass 
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	Search_Page search;
	
	public SearchPage_test()
	{
		super();
	}
	
	@BeforeClass
	public void init()
	{
		setup();
		home = new HomePage();
		home.getsignup();
		
		aut = new AuthenticationPage();
		aut.login();
		
		log= new Login_Page();
		log.enter_element("searchitem");
		home.scroll();
	}
	
	@Test(priority=1)
	public void searchItem()
	{
		search = new Search_Page();
		search.click_product();
	}
	
	@Test(priority=2)
	public void movetoFrame()
	{
		search = new Search_Page();
		search.switchtoframes();
	}
	
	@Test(priority=3)
	public void add_to_cart()
	{
		search = new Search_Page();
		search.addtocart();
		search.switchoutframe();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void checkOut()
	{
		search = new Search_Page();
		search.checkout_test();
	}
	
	@AfterMethod
	public void end()
	{
		//driver.quit();
	}

}