package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auth2 {
	
	@Test
	public void auth()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		String username="admin";
		String password="admin";
		String url="https://"+username+":"+password+"@"+"the-internet.herokuapp.com/digest_auth";
		driver.get(url);
		WebElement confirm=driver.findElement(By.xpath("//div[@class='example']/p"));
		String actual=confirm.getText();
		String expected="Congratulations! You must have the proper credentials.";
		
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
	}
	
	

}
