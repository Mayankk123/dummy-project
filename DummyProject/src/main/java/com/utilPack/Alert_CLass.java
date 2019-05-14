package com.utilPack;

import org.openqa.selenium.Alert;
import com.BasePack.BaseClass;

public class Alert_CLass extends BaseClass 
{
	public void alert()
	{
   	   Alert alert = driver.switchTo().alert();
   	   System.out.println("Alert Box Contains:"+alert.getText());
   	   //alert.accept();
   	   alert.dismiss();
	}
	
}

