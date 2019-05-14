package com.PagePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BasePack.BaseClass;

public class SignUp_Page extends BaseClass 
{
	@FindBy(id = "customer_firstname")
	WebElement firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement emailid;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "firstname")
	WebElement first;
	
	@FindBy(id = "lastname")
	WebElement last;
	
	@FindBy(id = "address1")
	WebElement addr;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "postcode")
	WebElement zipcode;
	
	@FindBy(id = "phone_mobile")
	WebElement number;
	
	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement register;
	
	 public SignUp_Page()
		{
			PageFactory.initElements(driver, this);
		}
	 
	 public void gettestdata(String fname,String lname,String pass,String add,String statedata,String c,String postcode,String phone)
	 {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		password.sendKeys(pass);
		addr.sendKeys(add);
		Select setstate=new Select(state);
		setstate.selectByVisibleText(statedata);
		city.sendKeys(c);
		zipcode.sendKeys(postcode);
		number.sendKeys(phone);
	 }
	 
	/* public void selectstate()
	 {
		 //driver.findElement(By.xpath(prop.getProperty("Alaska")));
		 
			WebElement drop= driver.findElement(By.id("id_state"));
			Select quantity=new Select(drop);
			quantity.selectByVisibleText(prop.getProperty("state"));
	 }*/
	 
	 public AuthenticationPage register()
	 {
		 register.click();
		 
		 return new AuthenticationPage();
	 }

}
