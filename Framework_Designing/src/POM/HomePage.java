package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;

public class HomePage extends BasePage{
	//Declaration
			@FindBy(xpath="(//img[@class='sizer'])[3]")
			private WebElement userMenu;
			@FindBy(id="logoutLink")
			private WebElement  logoutbtn;
			
			// initialization
			public HomePage(WebDriver driver)
			{
				super(driver);
				PageFactory.initElements(driver,this);
			}
			
			//utilization
			public void userMenu() throws InterruptedException
			{
				userMenu.click();	
				Thread.sleep(2000);
			}
	        public void logout()
			{
			logoutbtn.click();	
			}
	
}
