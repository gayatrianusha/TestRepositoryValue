package InternetHerokuApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	@Test
	public void test()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
	    List<WebElement> fra=	driver.findElements(By.tagName("frame"));
	    System.out.println(fra.size());
	    driver.switchTo().frame(0);
	    List<WebElement>subfr=driver.findElements(By.tagName("frame"));
	    System.out.println(subfr.size());
	   // Actions action= new Actions(driver);
	    //action.contextClick().build().perform();
	    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
	    // Actions action= new Actions(driver);
	  //  action.contextClick().build().perform();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	  Actions action1= new Actions(driver);
	  action1.contextClick().build().perform();
	    
	    
	}

}
