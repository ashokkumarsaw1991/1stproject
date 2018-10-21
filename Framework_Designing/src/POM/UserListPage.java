package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;

public class UserListPage extends BasePage{
	@FindBy(xpath="//span[text()='Create New User']")
	private WebElement createNewUserbtn;
	
	public UserListPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void createNewUser() throws InterruptedException
	{
		createNewUserbtn.click();	
		Thread.sleep(2000);
	}

}
