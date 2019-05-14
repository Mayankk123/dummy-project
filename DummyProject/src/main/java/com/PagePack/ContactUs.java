package com.PagePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import com.BasePack.BaseClass;

public class ContactUs extends BaseClass
{
	@FindBy(id = "id_contact")
	WebElement  subjectHeading;
	
	@FindBy(id = "submitMessage")
	WebElement send;
	
	@FindBy(id = "message")
	WebElement message;
	
	@FindBy(xpath = "//div[@id='uniform-fileUpload']")
	WebElement chooseFile;
	
	public ContactUs()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getSubHeading()
	{
		Select subhead=new Select(subjectHeading);
		subhead.selectByVisibleText("Customer service");
	}
	
	public void addMessage()
	{
		message.sendKeys("payment is not being done.");
	}
	
	/*public void fileupload()
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
	    WebElement uploadElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span[@class='filename']")));
	    uploadElement.click();
	    uploadElement.sendKeys("C:\\Users\\Concretio\\Desktop\\General Test Scenerio.txt");
		
	}*/
	
	public void fileupload() throws SikuliException
		//Using SQILI for file Uploading.
		
	/*	Screen s = new Screen();
		Pattern addfile = new Pattern("choosefile.jpg");
		try {
			s.wait(addfile, 5000);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
	   /* WebDriverWait wait = new WebDriverWait(driver, 50);
	    WebElement uploadElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='uniform-fileUpload']")));
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    uploadElement.sendKeys("C:\\Users\\Concretio\\Desktop\\General Test Scenerio.txt");
	    uploadElement.click();
	}*/
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		chooseFile.click();
		
		Screen s = new Screen();
		Pattern addfile = new Pattern("C:\\Users\\Concretio\\Desktop\\documents.png");
		s.wait(addfile,5000);
		s.click();
		
		Pattern file = new Pattern("C:\\Users\\Concretio\\Desktop\\duplicateIssue.png");
		s.wait(file,5000);
		s.click();
		
		Pattern open = new Pattern("C:\\Users\\Concretio\\Desktop\\open.png");
		s.wait(open,5000);
		s.click();
		}
	
	public void sendBtn()
	{
		send.click();
	}

}