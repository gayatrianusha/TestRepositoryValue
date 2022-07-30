package TestNGPackage;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	@Test
	public void tes() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		HashMap<String,Object> chromeprefs= new HashMap<String,Object>();
		chromeprefs.put("profile.default_content_settings.popup",0);
		String downloadpath=System.getProperty("user.dir");
		chromeprefs.put("download_default_directory", downloadpath);
		options.setExperimentalOption("prefs", chromeprefs);
		WebDriver driver= new ChromeDriver(options);
		
		File f= new File(downloadpath+"//DownloadDemo-master.zip");
		if(f.exists())
		{
			System.out.println("File downloaded Successfully");
		}
	 
		else
		{
			System.out.println("File Not downloaded successfully");
		}
		
		
	}
}
