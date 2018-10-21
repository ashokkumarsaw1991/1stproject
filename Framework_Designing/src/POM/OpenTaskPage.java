package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;

public class OpenTaskPage extends BasePage{
	//Declaration
	@FindBy(xpath="//input[@value='Create New Tasks")
	private WebElement clickCreateNewTaskBtn;
	
	// initialization
	public OpenTaskPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void createTaskPage() throws InterruptedException
	{
		clickCreateNewTaskBtn.click();	
		Thread.sleep(2000);
	}


}
