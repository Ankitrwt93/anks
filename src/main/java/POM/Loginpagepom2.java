package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;

public class Loginpagepom2 {
	public WebDriver driver;
	
	
	By Usernamefield=By.name("username");
	
	By passwordfield=By.name("pwd");
	
	By SubmitBtn= By.id("loginButton");
	
	By errmsg=By.xpath("//table[@id='ErrorsTable']//span");
	
	
			
	
	public void usernameField(String username) 
	{
		 driver.findElement(Usernamefield).sendKeys(username);
	}
	
	public void passwordfield(String Password)
	{
		driver.findElement(passwordfield).sendKeys(Password);
	}
	
	public void Submitbtn() {
		driver.findElement(SubmitBtn).click();
		
	}
	public String errormsg() {
		return driver.findElement(errmsg).getText();
		
	}
	
	
	
	private WebElement findElement(By errmsg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Loginpagepom2(WebDriver driver) {
		this.driver=driver;
		
	}
	

}
