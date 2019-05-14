package com.testPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;
import com.PagePack.Login_Page;

public class LoginPageTest extends BaseClass 
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void init()
	{
		setup();
        home = new HomePage();
        aut= new AuthenticationPage();
		home.getsignup();
		aut.login();
	}
	
	@Test
	public void searchItem()
	{
		log= new Login_Page();
		log.enter_element("searchitem");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}


}

