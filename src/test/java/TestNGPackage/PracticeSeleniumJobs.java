package TestNGPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumJobs {
	
	
	@Test
     public void Practice() throws InterruptedException, MalformedURLException, IOException
     {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		WebElement selectDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select select= new Select(selectDropdown);
		select.selectByIndex(0);
		select.selectByVisibleText("Option2");
		select.selectByValue("option3");
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("openwindow")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>handles= driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		while(it.hasNext())
		{
			String child= it.next();
			System.out.println(child);
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				
			}
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("alertbtn")).click();
		try {
		Alert alert= driver.switchTo().alert();
		alert.accept();
		}catch(Exception e)
		{
			System.out.println("Alert Exception");
		}
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("opentab")).click();
		String parent1= driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();
		
		while(ite.hasNext())
		{
			String child1=ite.next();
			if(!parent1.equals(child1))
			{
				driver.switchTo().window(child1);
				System.out.println(driver.getTitle());
			}
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("autocomplete")).sendKeys("in");
	    List<WebElement>lists=driver.findElements(By.xpath("//ul[@id='ui-id-1']//descendant::li"));
		//driver.quit();
	    for(WebElement list:lists)
	    {
	    	if(list.getText().equalsIgnoreCase("india"))
	    	{
	    		list.click();
	    		System.out.println("India is clicked");
	    		break;
	    	}
	    	
	    }
		
	    /*JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)"," ");*/
	    
	    
	    //Broken Link
	/*   WebElement footer= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	    List<WebElement>links= footer.findElements(By.xpath("//table[@class='gf-t']//descendant::a"));
	 for(WebElement link:links)
	    { 
	    	String url=link.getAttribute("href");
	    	link.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	    	Thread.sleep(5000L);
	    	HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
	    	con.setRequestMethod("HEAD");
	    	con.connect();
	    	int responseCode=con.getResponseCode();
	    	if(responseCode>400)
	    	{
	    		System.out.println("The Broken Link is:"+link.getText());
	    	}
	    	
	    }
	    //Child Windows Handle
	   String parent2= driver.getWindowHandle();
	   Set<String> windows1= driver.getWindowHandles();
	   Iterator<String>iter=windows1.iterator();
	   while(iter.hasNext())
	   {
		   String child2=iter.next();
		   if(!parent2.equals(child2))
		   {
			   driver.switchTo().window(child2);
			  System.out.println(driver.getTitle());
		   }
	   }
	   */
	   driver.switchTo().window(parent);
	   List<WebElement> fram= driver.findElements(By.tagName("iframe"));
	   System.out.println(fram.size());
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//div[@class='login-btn']")).click();
	   driver.switchTo().defaultContent();
	   
	   //Mouse Hover
	   
	   Actions action= new Actions(driver);
	   WebElement mousehover= driver.findElement(By.xpath("//button[@id='mousehover']"));
	   action.moveToElement(mousehover).build();
			 
	   //Tabs 
	   
	   //jumbotron text-center header_style
	   
	   
	   /*
	    DesiredCapabilities c= DesiredCapabilities.chrome();
	    c.setCapability(CapabilityType.Accept_SSL_CERTS,true)
	    */
	   
	//  driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click();
	   
	   Dimension d= new Dimension(400,600);
	   driver.manage().window().setSize(d);
	 
	
	   
	
	      
	      
	   
	   
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     }

}
