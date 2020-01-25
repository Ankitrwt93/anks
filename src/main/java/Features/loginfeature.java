package Features;
import static org.testng.Assert.assertEquals;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import POM.entertimepom2;
import POM.loginpagepom3;




public class loginfeature {
	WebDriver driver;
	loginpagepom3 lp3;
	entertimepom2 etp2;
	
	public loginfeature(WebDriver driver)
	{
	this.driver=driver;
	lp3=new loginpagepom3(driver);
	etp2=new entertimepom2(driver);
	
	

	
	}
	
	public void validlogin(String username, String password) throws InterruptedException
	{
		Thread.sleep(3000);
		lp3.login(username, password);
		String actualtext=etp2.pagetitle();       
		String expectedtext="Enter Time-Track";
		assertEquals(actualtext, expectedtext); 
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Enter Time-Track";
		assertEquals(actualTitle, expectedTitle);
		Reporter.log("homepage(Enter Title track) is verified"+new Date(),true);
			
	}
	public void invalidlogin(String username, String password) throws InterruptedException
	
	{
		
		lp3.login(username, password);
		String actualMessage=lp3.erm();
		Thread.sleep(3000);
		String expectedmessage= "Username or Password is invalid. Please try again.";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		assertEquals(actualMessage, expectedmessage);
		Reporter.log("Invalid login message is verified"+new Date(),true);
		
	}
	
	
}


