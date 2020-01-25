package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class loginpagepom3 {

	
	
	@FindBy(name="username")
	public WebElement untxtbx;
	
	@FindBy(name="pwd")
	public WebElement pwdtxtbx;
	
	@FindBy(id="loginButton")
	public  WebElement loginbutton;
	
	@FindBy(xpath="//table[@id='ErrorsTable']//span")
	public WebElement errormsg;
	
	

	public loginpagepom3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login (String username, String password) 
	{
		
	untxtbx.sendKeys(username);
	pwdtxtbx.sendKeys(password);
	loginbutton.click();

	}	
	
	public String erm()
	{
		
	String	errortext=errormsg.getText();
		return errortext;
		
	}
	
	
	
	
	
	
	
	

	
	
	
}
