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
	
	@FindBy(xpath=".//a[@title='Go To My 2016 Taxes']")
	WebElement prospectTCX;
	
	public WebElement AccessMyCard()
	{
		return Accessmycardlink;
	}
	public WebElement ProfileLink()
	{
		return profilelinkfooter;
	}
	public WebElement GotoMyTaxes()
	{
		return prospectTCX;
	}
}
