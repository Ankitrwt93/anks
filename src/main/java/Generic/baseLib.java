package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseLib {

		public static WebDriver driver;
		
		
		@BeforeMethod
		@Parameters({"browser","baseurl"})
		public void precondition(String browsername, String baseurl) 
		{
			driver=BrowserLaumcher.launch(browsername);		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.navigate().to(baseurl);
			Reporter.log("Browser launched and " +baseurl+" is navigated",true);
			
		}
		
		@AfterMethod
		public void postcondition()
		{
			if(driver!=null)
			{
				driver.quit();
			}
			Reporter.log("Browser closed",true);
			System.out.println();
		
		}

		

	}



