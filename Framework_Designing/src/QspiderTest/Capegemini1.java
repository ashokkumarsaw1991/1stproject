package QspiderTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capegemini1 {

	public static void main(String[] args) {
	
WebDriver driver=new FirefoxDriver();
  List<WebElement>iframeCount=driver.findElements(By.tagName("iframe"));
  System.out.println(iframeCount.size());
	}
}

