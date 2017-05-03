package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	WebDriver testdriver;
	
	public Footer(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}
	
	@FindBy(id="profileFLi")
	WebElement profilelinkfooter;
	
	@FindBy(name="Sign Out")
	WebElement signoutfooter;
	
	public WebElement ProfileLink()
	{
		return profilelinkfooter;
	}
	public WebElement SignOut()
	{
		return signoutfooter;
	}
}
