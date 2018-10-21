package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  implements Constants {
	public WebDriver driver;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
@BeforeMethod
public void openApp()
{
	
	driver=new FirefoxDriver();
	driver.get(Property.propertyFile(PATH1,"url"));
}
@AfterMethod
public void closeApp(ITestResult test)
{
	int status=test.getStatus();
	if(status==1)
	{
		String TestCaseName=test.getName();
		//Reporter.log("..............."+TestCaseName,true);
		System.out.println("-----------)"+TestCaseName);
		ScreenShots.screenShots(ScreenShotFolderPATH);
	}
	driver.quit();
}
}
