package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Help {
	
	WebDriver testdriver;
	
	public Help(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

//	@FindBy(linkText="I don't have access to this email address.")
//	WebElement answersecuritylink;
	
	@FindBy(xpath=".//*[@id='skiptoMainContent']/div/div/div/div[1]")
	WebElement techsupport;
	
	@FindBy(xpath=".//*[@id='skiptoMainContent']/div/div/div/div[2]/h2")
	WebElement communityheader;
	
	public WebElement Technicalsupport()
	{
		return techsupport;
	}
	public WebElement CommunityHeader()
	{
		return communityheader;
	}
	
	
}
