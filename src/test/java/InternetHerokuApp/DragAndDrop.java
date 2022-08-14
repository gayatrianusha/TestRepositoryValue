package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	@Test
	public void test() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		WebElement source=driver.findElement(By.id("column-a"));
		WebElement dest=driver.findElement(By.id("column-b"));
		Actions action= new Actions(driver);
		Thread.sleep(300);
		action.clickAndHold(source).moveToElement(dest).release(dest).build().perform();
		//action.dragAndDrop(source, dest);
	}
	
}
