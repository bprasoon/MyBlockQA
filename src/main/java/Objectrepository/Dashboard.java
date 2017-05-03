package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver testdriver;
	
	public Dashboard(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}
	
	@FindBy(id="hCDP")
	WebElement Accessmycardlink;
	
	@FindBy(id="profileFLi")
	WebElement profilelinkfooter;
	
	public WebElement AccessMyCard()
	{
		return Accessmycardlink;
	}
	public WebElement ProfileLink()
	{
		return profilelinkfooter;
	}
	
}
