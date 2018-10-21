package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;

public class CreateNewUser extends BasePage{
	@FindBy(xpath="//input[@name='username']")
	public WebElement  nameTextbox;
	
	@FindBy(xpath="//input[@name='passwordText']")
	public WebElement  passwordTextbox;
	
	@FindBy(xpath="//input[@name='passwordTextRetype']")
	public WebElement  passwordRetypeTextbox;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement  firstNameTextbox;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement  lastNameTextbox;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement  emailTextbox;
	
	@FindBy(xpath="//input[@value='   Create User   ']")
	public WebElement  CreateUserBtn;
	
	@FindBy(xpath="(//img[@class='sizer'])[2]")
	private WebElement taskMenu;
	
//	@FindBy(xpath="//input[@type='submit']")
	//public WebElement  logoutBtn;
	
	public CreateNewUser(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void userMenu(String username,String password,
	String reTypePassword,String firstName,String lastName,String EmailId) throws InterruptedException
	{
		nameTextbox.sendKeys(username);	
		//Thread.sleep(2000);
		passwordTextbox.sendKeys(password);
	//	Thread.sleep(2000);
		passwordRetypeTextbox.sendKeys(reTypePassword);
		//Thread.sleep(2000);
		firstNameTextbox.sendKeys(firstName);
		//Thread.sleep(2000);
		lastNameTextbox.sendKeys(lastName);
		//Thread.sleep(2000);
		emailTextbox.sendKeys(EmailId);
		//Thread.sleep(2000);
		CreateUserBtn.click();
	//	Thread.sleep(2000);
		System.out.println("taskMenu");
		taskMenu.click();
		System.out.println("taskMenu1");
	//logoutBtn.click();
	}
}
