package com.BasePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	public static JavascriptExecutor jse;
	
	public BaseClass()
	{
		try {
			prop = new Properties();
			
			FileInputStream fs = new FileInputStream("C:\\Users\\Concretio\\eclipse-workspace\\"
					+ "DummyProject\\src\\main\\java\\com\\configPack\\configfile.properties");
			prop.load(fs);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setup()
	{
		String setbrowser = prop.getProperty("browser");
		
		if(setbrowser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Concretio\\Desktop\\Selenium Files\\chromedriver.exe");
		      driver=new ChromeDriver();
		}
		
		else if(setbrowser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Concretio\\Desktop\\eclipse\\geckodriver.exe");
            driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		// driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	
	public static void scroll()
	{
		  try {
			jse=(JavascriptExecutor)driver;  
		    jse.executeScript("scroll(0,500)");
			  Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
}
