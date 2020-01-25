package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;






public class entertimepom2   {
	
	@FindBy(xpath="(//td[@class='pagetitle'])[2]")
	public @Getter WebElement errormsg;
	
	

	public entertimepom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String pagetitle () throws InterruptedException 
	{
		Thread.sleep(3000);
		return errormsg.getText();
		

	
	}	

}