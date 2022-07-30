package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {
	
	@Test
	public void test()
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Select se= new Select(driver.findElement(By.id("dropdown")));
		//se.selectByIndex(2);
		se.selectByVisibleText("Option 2");
		se.selectByIndex(0);
		se.selectByValue("1");
		
		
	}

}
