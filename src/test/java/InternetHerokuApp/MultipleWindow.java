package InternetHerokuApp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	
	@Test
	public void test()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		 
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 String parent=driver.getWindowHandle();
	    Set<String>s= driver.getWindowHandles();
	    Iterator<String>it= s.iterator();
	    while(it.hasNext())
	    {
	    	String child= it.next();
	    	if(!parent.equals(child))
	    	{
	    		driver.switchTo().window(child);
	    		System.out.println(driver.getTitle());
	    	}
	    	
	    }
	    
	   driver.switchTo().window(parent);
	  System.out.println(driver.getTitle()); 
	 String actual= driver.findElement(By.tagName("h3")).getText();
	 String expected="Opening a new window";
	 
	 Assert.assertEquals(actual,expected);
	    
	}
}
