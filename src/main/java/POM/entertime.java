package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import lombok.Getter;

public class entertime extends Basepage {

	
	@FindBy(xpath="(//td[@class='pagetitle'])[2]")
	private @Getter WebElement homepageTitle;
	

	
	public entertime(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}

	

	

}
