package InternetHerokuApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextMenu {

	
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Context Menu']")).click();
		WebElement text=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions action= new Actions(driver);
		action.moveToElement(text).contextClick().build().perform();
		Thread.sleep(100);
		
		WebElement menuItem = driver.findElement(By.cssSelector("menuitem[label='the-internet']"));
		
		
		
		
	}
	
	
	
}
