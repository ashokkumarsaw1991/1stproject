package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;

public class LoginPage extends BasePage{
	
	//Declaration
		@FindBy(name="username")
		private WebElement  usernameTextbox;
		
		@FindBy(name="pwd")
		private WebElement passwordTextbox;
		
		@FindBy(id="loginButton")
		public  WebElement loginbtn;
		
		//Initialization
		public LoginPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
	
		public void userName(String usname) throws InterruptedException
		{
			usernameTextbox.sendKeys(usname);
			Thread.sleep(5000);
	    }
		public void passWord( String pwdname) throws InterruptedException
		{
			passwordTextbox.sendKeys(pwdname);
			Thread.sleep(5000);
	    }
		public void login() throws InterruptedException
		{
			loginbtn.click();
			Thread.sleep(5000);
		
	    }
		
}
