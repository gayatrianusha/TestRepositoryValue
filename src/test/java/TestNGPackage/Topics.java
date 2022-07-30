package TestNGPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Topics {

	
//Desired Capabilities
	//Switch to 3rd Child Window
	@Test
	public void test() throws InterruptedException, MalformedURLException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> links=footer.findElements(By.tagName("a"));
		System.out.println(links.size());	
		for(WebElement link:links)
		{
			link.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(5000L);
			//System.out.println(link.getText());
			String url=link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			if(respcode>400)
			{
				System.out.println("Broken Link"+link.getText());
			}
			
			
			
		}
		
		String parent=driver.getWindowHandle();
	    Set<String> set=driver.getWindowHandles();
		Iterator<String> ite= set.iterator();
		while(ite.hasNext())
		{
		 String child=	ite.next();
		 if(!parent.equals(child))
		 {
			 driver.switchTo().window(child);
			 
			System.out.println(driver.getTitle());	
			
		 }
			driver.switchTo().window(parent);
			
			
			
			
			
		}
	    
	    
	    
	}

	
}
