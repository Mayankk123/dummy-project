package com.testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;
import com.PagePack.Login_Page;
import com.PagePack.Search_Page;
import com.PagePack.Summary_Page;

public class SummaryPage_test extends BaseClass
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	Search_Page search;
	Summary_Page summary;
	
	public SummaryPage_test()
	{
		super();
	}
	
	@BeforeClass
	public void initsummarypage()
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
	}
	
	@Test(priority=1)
	public void addItem()
	{
		summary = new Summary_Page();
		summary.addproduct();
	}
	
	@Test(priority=2)
	public void proceed()
	{
		summary = new Summary_Page();
		summary.proceedFromSummaryPage();
	}
	
	@AfterClass
	public void end()
	{
		//driver.quit();
	}
		
 }
