package InternetHerokuApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptAlert {

	
		// TODO Auto-generated method stub
		@Test
		public void test()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		    Alert alert=driver.switchTo().alert();
		    alert.accept();
		    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		    Alert alert1=driver.switchTo().alert();
		    alert1.dismiss();
		    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		   Alert alert2= driver.switchTo().alert();
		   alert2.sendKeys("Hello Welcome");
		   alert2.accept();
		
			
		}
	
		

	

}
