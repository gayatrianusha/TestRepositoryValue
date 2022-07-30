package InternetHerokuApp;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatePopup {
	
	@Test
	public void test()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//http://the-internet.herokuapp.com/basic_auth
		
		String username="admin";
		String password="admin";
		String url="https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		//"https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth"
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
	}

}
