package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Responsiveheader {
	
	WebDriver testdriver;
	
	public Responsiveheader(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

		
	@FindBy(id="ADArn")
	WebElement logoutouticon;
	
	@FindBy(id="profileLi")
	WebElement profile;
	
	@FindAll({
	@FindBy(linkText = "SIGN OUT"),
	@FindBy(partialLinkText = "SIGN OUT")
	})
	public WebElement signout;
	
	
	public WebElement LogoutIcon()
	{
		return logoutouticon;
	}
	public WebElement Profile()
	{
		return profile;
	}
	public WebElement SignOut()
	{
		return signout;
	}
		
}
