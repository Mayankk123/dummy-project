package com.testPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.HomePage;

public class HomePage_test extends BaseClass {
	HomePage home;
	public HomePage_test()
	{
		super();
	}
	@BeforeMethod
	public void init()
	{
		setup();
		home= new HomePage();
	}
	
	@Test
	public void openSignupPagetest()
	{
		home.getsignup();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
