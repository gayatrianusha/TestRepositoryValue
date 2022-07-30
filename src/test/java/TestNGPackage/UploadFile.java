package TestNGPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	
	@Test
	public void check()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		//Upload a File
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Image1.jpg");
		
		
		WebElement but=driver.findElement(By.id("but1"));
		//Enabled or not
		if(but.isEnabled())
		{
			
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is Disabled");
		}
		
		//Disabled text-Enter text in disabled text through JavaScriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('tb2').value='test'");
		
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
		
		WebElement chbox=driver.findElement(By.id("dte"));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(chbox));
		driver.findElement(By.id("dte")).click();
		
		//Multi Selectdriver
		
		WebElement se=driver.findElement(By.id("multiselect1"));
		Select select= new Select(se);
		select.selectByIndex(0);
		select.selectByVisibleText("Hyundai");
		select.selectByValue("audix");
		
		if(select.isMultiple())
		{
			
			List<WebElement> s=select.getAllSelectedOptions();
			for(WebElement so:s)
			{
				System.out.println(so.getText());
				
						
			}
		
		}
		
		select.deselectAll();
		
		
		//Select 
		
		WebElement si= driver.findElement(By.id("drop1"));
		Select sm= new Select(si);
		sm.selectByIndex(0);
		sm.selectByValue("abc");
		sm.selectByVisibleText("doc 3");
		
		//
		
		
		
		
		
	}

}
