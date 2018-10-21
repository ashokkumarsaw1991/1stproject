package Scripts;

import org.testng.annotations.Test;

import Generics.BaseTest;
import Generics.Excel;
import Generics.SelectDropDown;
import POM.CreateNewUser;
import POM.HomePage;
import POM.LoginPage;
import POM.UserListPage;

public class Test2 extends BaseTest {
	@Test
	public void tcc2() throws InterruptedException
	{
	String us=Excel.getCellValue(PATH, "Sheet1", 1, 0);
 		String pwd=Excel.getCellValue(PATH, "Sheet1", 1, 1);
		String title=Excel.getCellValue(PATH, "Sheet1", 1, 2);
		LoginPage l=new LoginPage(driver);
		l.userName(us);
		l.passWord(pwd);
		l.login();
		HomePage p=new HomePage(driver);
	  p.userMenu();
	  UserListPage up=new UserListPage(driver);
	  up.createNewUser();
	  CreateNewUser cu=new CreateNewUser(driver);
	  String username=Excel.getCellValue(PATH,"Sheet2",1,0);
	  String password=Excel.getCellValue(PATH,"Sheet2",1,1);
	  String reTypePassword=Excel.getCellValue(PATH,"Sheet2",1,2);
	  String firstName=Excel.getCellValue(PATH,"Sheet2",1,3);
	  String lastName=Excel.getCellValue(PATH,"Sheet2",1,4);
	  String EmailId=Excel.getCellValue(PATH,"Sheet2",1,5);
	  cu.userMenu(username, password, reTypePassword, firstName, lastName, EmailId);
	  SelectDropDown D= new SelectDropDown(driver);
	  D.ABC();
	  System.out.println("ABC method call");
	  
	}

}
