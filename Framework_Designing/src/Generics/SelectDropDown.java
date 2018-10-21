package Generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDown {
	public static WebDriver driver;
	
	public SelectDropDown(WebDriver driver) {
	}
	
public  void ABC()
{
Alert a=driver.switchTo().alert();
System.out.println("ABC method decaration");
a.dismiss();
Select oSelect=new Select(driver.findElement(By.name("customerId")));
oSelect.selectByVisibleText("indian Air Force");	
}
}
	

