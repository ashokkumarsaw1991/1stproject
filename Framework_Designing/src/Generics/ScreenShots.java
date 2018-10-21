package Generics;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShots {

	public static void screenShots(String ScreenShotFolderPATH) {
		try{
			Date d=new Date();
			String s=d.toString();
		 String s1=s.replace(":","_");
		 WebDriver driver=new FirefoxDriver();
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File srcFile=ts.getScreenshotAs(OutputType.FILE);
		 File destFile=new File(ScreenShotFolderPATH +s1+".png");
		 FileUtils.copyFile(srcFile, destFile);
		 System.out.println("ScreenShot took place");
		}
		catch(Exception e)
		{
			
		}
		

	}

}
