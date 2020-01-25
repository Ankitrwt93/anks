package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPagePOM {

	@FindBy(name="username")
	private @Getter WebElement untxtbx;
	
	@FindBy(name="pwd")
	private @Getter WebElement pwdtxtbx;
	
	@FindBy(id="loginButton")
	private @Getter WebElement loginbutton;
	
	@FindBy(xpath="//table[@id='ErrorsTable']//span")
	private @Getter WebElement errormsg;
	
	
	
	public void login (String username, String password) 
	{
		
	untxtbx.sendKeys(username);
	pwdtxtbx.sendKeys(password);
	loginbutton.click();
	
	}
	
	
	
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

	
	
	
}
