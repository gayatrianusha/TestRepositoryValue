package InternetHerokuApp;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	@Test
	public void test()
	{
		
		WebDriverManager.chromedriver().setup();
		
	/*	HashMap<String,Object>prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popup", 0);
	//	String downloadpath="D:\\";
		String downloadpath=System.getProperty("user.dir");
		prefs.put("download.default_directory", downloadpath);
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver= new ChromeDriver(options);*/
		
	   HashMap<String,Object> prefs= new HashMap<String,Object>();
	 prefs.put("profile.default_content_settings.popup",0);
	   String download=System.getProperty("user.dir");
	   prefs.put("download.default_directory",download);
	   ChromeOptions options= new ChromeOptions();
	   options.setExperimentalOption("prefs", prefs);
	    WebDriver driver= new ChromeDriver(options);
		
	}
}
