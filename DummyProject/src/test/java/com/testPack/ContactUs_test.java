package com.testPack;

import org.sikuli.script.SikuliException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.ContactUs;
import com.PagePack.HomePage;
import com.PagePack.Login_Page;

public class ContactUs_test extends BaseClass
{
	HomePage home;
	AuthenticationPage aut;
	Login_Page log;
	ContactUs contact;
	
	public ContactUs_test()
	{
		super();
	}
	
	@BeforeClass
	public void initContactUs()
	{
		setup();
		home = new HomePage();
		home.getsignup();
		
		aut = new AuthenticationPage();
		aut.login();
	}
	
	@Test(priority=1)
	public void getcontactus()
	{
		log = new Login_Page();
		log.contactpage();
	}
	@Test(priority=2)
	public void fillSubHead()
	{
		contact = new ContactUs();
		contact.getSubHeading();
	}
	
	@Test(priority=3)
	public void fileUpload() throws SikuliException
	{
		home.scroll();
		contact=new ContactUs();
		contact.fileupload();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void addMessage()
	{
		contact=new ContactUs();
		contact.addMessage();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=5)
	public void submit()
	{
		contact=new ContactUs();
		contact.sendBtn();
	}
	
	@AfterClass
	public void exitcontactUs()
	{
		//driver.quit();
		
	}

}
