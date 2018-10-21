package QspiderTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CapeGemini2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		WebElement dropDownLIst=driver.findElement(By.id("id"));
		
		Select dropDownList1=new Select(dropDownLIst);
		List<WebElement> Options=dropDownList1.getOptions();
		for(WebElement text:Options)
		{
			String AllTexts=text.getText();
			System.out.println(AllTexts);
		Dimension count = text.getSize();
		System.out.println(count);
		}

	}

}
