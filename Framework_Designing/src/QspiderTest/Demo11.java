package QspiderTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11 {
	static {
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/driverExecutables/geckodriver.exe");}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://vaio/login.do");
        System.out.println("===============================");
		driver.findElement(By.name("username")).sendKeys("wwwwwwwwwwww");
		System.out.println("usename passed");
		driver.findElement(By.name("pwd")).sendKeys("ssssssssssssssssssssssss");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("pwd passed");
		driver.findElement(By.id("loginButton")).click();

	}

}
