package Generics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest{
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyElement(WebElement elements)
	{
		try{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) elements));
			Reporter.log("element is found",true);
			
		}
		catch(Exception e)
		{
			Reporter.log("element is not found",true);
			Assert.fail();
		}
	}
	
	public void verifytitle(String title)
	{
		try{
			//String title1=driver.getTitle();
			//System.out.println("..........................."+title1); 
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching",true);
			
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	
	
}
