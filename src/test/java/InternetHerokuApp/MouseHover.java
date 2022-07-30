package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/hovers");
		Actions action = new Actions(driver);
		WebElement user1=driver.findElement(By.xpath("//div[@class='example']//child::div[1]"));
		WebElement user2=driver.findElement(By.xpath("//a[text()='View profile']"));
        action.moveToElement(user1).moveToElement(user2).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)).build().perform();
		WebElement user3=driver.findElement(By.xpath("//div[@class='example']//child::div[2]"));
		WebElement user4=driver.findElement(By.xpath("//a[text()='View profile']"));
		Actions action1 = new Actions(driver);
	    action1.moveToElement(user3).moveToElement(user4).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER)).build().perform();
	}
}
