package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	
	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		//file-upload
		WebElement browse=driver.findElement(By.xpath("//input[@id='file-upload']"));
		browse.sendKeys("E:\\ExcelData.xlsx");
		
	}
	
}
