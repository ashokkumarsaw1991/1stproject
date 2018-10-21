package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;
import Generics.SelectDropDown;

public class OpenNewTaskPage extends BasePage{
	//Declaration
		@FindBy(xpath="//select[@name='customerId']")
		private WebElement PleaseSelectOneCustomer;
		
		@FindBy(xpath="//select[@name='projectId']")
		private WebElement PleaseSelectOneProject;
		
		@FindBy(xpath="//input[@name='task[0].name'][1]")
		private WebElement Taskname;
		
		@FindBy(xpath="//input[@id='taskDeadline0']")
		private WebElement selectDeadLine;
		
		@FindBy(xpath="//input[@value='Create Tasks']")
		private WebElement CreateTaskbtn;
		
		@FindBy(xpath="(//a[@class='item'])[1]")
		private WebElement OpenTasksbar;
		
		// initialization
		public OpenNewTaskPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public void createTaskPage() throws InterruptedException
		{
			PleaseSelectOneCustomer.click();
		}



}
