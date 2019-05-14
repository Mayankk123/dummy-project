package com.testPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePack.BaseClass;
import com.PagePack.AuthenticationPage;
import com.PagePack.HomePage;
import com.PagePack.SignUp_Page;
import com.utilPack.Excel_Read;

public class SignUp_Page_test extends BaseClass 
{		AuthenticationPage aut;
        SignUp_Page sign ;
	    String sheetName = "create_acc";

	public SignUp_Page_test()
	{
		super();
	}
	
	@BeforeMethod
	public void init()
	{
		setup();
		HomePage home = new HomePage();
		home.getsignup();
		//AuthenticationPage aut = new AuthenticationPage();
		aut = new AuthenticationPage();
		aut.createAccount();	
	}
	
	@DataProvider
	public Object[][] getTestData()
	{
		Object data[][] = Excel_Read.getTestData(sheetName);
		return data;
	}

    @Test(priority=1,dataProvider = "getTestData")
    public void createpage_test(String fname,String lname,String pass,
    		String add,String statedata,String c,String postcode,String number)
    {
    	sign = new SignUp_Page();
    	sign.gettestdata(fname,lname,pass,add,statedata,c,postcode,number);
    	sign.register();
    }
    
    @AfterMethod
    public void end()
    {
    	//driver.quit();
    }


}
