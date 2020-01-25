package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public abstract class Basepage {
	
	@FindBy(xpath = "//div[text()='Tasks']")
	public @Getter WebElement tasks;
	
	
	public Basepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}


