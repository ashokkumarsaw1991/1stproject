package Scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generics.BaseTest;
import Generics.Excel;
import POM.HomePage;
import POM.LoginPage;

public class Test1 extends BaseTest {
	@Test
	public void tcc1() throws InterruptedException {
		String us1 = Excel.getCellValue(PATH, "Sheet2", 1, 0);
		String pwd1 = Excel.getCellValue(PATH, "Sheet2", 1, 1);
		String title = Excel.getCellValue(PATH, "Sheet1", 1, 2);
		LoginPage l1 = new LoginPage(driver);
		System.out.println("==================================" + us1);
		System.out.println("===============================" + pwd1);
		l1.userName(us1);
		
		l1.passWord(pwd1);
		l1.login();
		HomePage h = new HomePage(driver);
		h.verifytitle(title);
		h.logout();

	}
}
