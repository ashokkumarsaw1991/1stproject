package QspiderTest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class actiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Softwares/driverExecutables/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://vaio/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		WebElement listbox=driver.findElement(By.name("customerId"));
		Select s=new Select(listbox);
		s.selectByVisibleText("Indian Air Force");
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		Set<String> handles=driver.getWindowHandles();
			System.out.println(handles.size());
		
		driver.findElement(By.xpath("(//span[text()='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("as123");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("as123");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("AshokKumar@gmail.com");
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
