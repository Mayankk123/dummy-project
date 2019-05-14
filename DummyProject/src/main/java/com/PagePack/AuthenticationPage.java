package com.PagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePack.BaseClass;

public class AuthenticationPage extends BaseClass
{
	@FindBy(id = "email_create")
	WebElement emailId;
	
	@FindBy(xpath = "//i[@class='icon-user left']")
	WebElement create;
	
	@FindBy(id = "email")
	WebElement loginEmail;
	
	@FindBy(id = "passwd")
	WebElement loginPasword;
	
	@FindBy(id = "SubmitLogin")
	WebElement loginbtn;
	
	public AuthenticationPage()
	{
		PageFactory.initElements(driver, this);
	}
		
	public SignUp_Page createAccount()
	 {
		 emailId.sendKeys(prop.getProperty("emailid_for_signup"));
		 create.click();
		 return new SignUp_Page();
	 }
	
	public Login_Page login()
	{
		loginEmail.sendKeys(prop.getProperty("loginid"));
		loginPasword.sendKeys(prop.getProperty("paswordid"));
		loginbtn.click();
		return new Login_Page();
	}

}