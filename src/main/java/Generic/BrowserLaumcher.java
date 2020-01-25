package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserLaumcher 
{
	public static WebDriver launch(String browsername) 
	{
		WebDriver driver = null;
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			 driver=new ChromeDriver();
			Reporter.log("Chrome launched",true);

		}
		if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			 driver =new FirefoxDriver();
			Reporter.log("Firefox launched",true);
		}		
		return driver;
		
	}


}
