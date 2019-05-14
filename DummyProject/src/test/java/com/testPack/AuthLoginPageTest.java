package com.testPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;

public class AuthLoginPageTest extends BaseClass 
{

	public AuthLoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void init()
	{
		setup();
		HomePage home = new HomePage();
		home.getsignup();
	}
	
	@Test
	public void fillemailadd()
	{
		AuthenticationPage aut = new AuthenticationPage();
		aut.login();
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
		driver.quit();
	}


}
