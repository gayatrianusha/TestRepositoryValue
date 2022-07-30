package InternetHerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	
	@Test
	public void test()
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//child::input[1]"));
		checkbox1.click();
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox1 is checked "+checkbox1.getText());
		}
		else {
			System.out.println("Checkbox1 is not checked "+checkbox1.getText());
		}
		
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//child::input[2]"));
		checkbox2.click();
		if(checkbox2.isSelected())
		{
			System.out.println("Checkbox2 is checked");
		}
		else {
			System.out.println("Checkbox2 is not checked");
		}
		
		driver.close();
	}

}
