package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	
	WebDriver testdriver;
	
	public Header(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

		
	@FindBy(xpath=".//*[@id='navRighthighR']/div[1]/a/img")
	WebElement myblockicon;
	
	@FindBy(css="#taxlifeTopLi")
	WebElement mytax;
	
	@FindBy(css="#documentTopLi")
	WebElement mydoc;
	
	@FindBy(css="#historyTopLi")
	WebElement taxhistory;
	
//	@FindBy(css="#myaccountTopLi")
//	WebElement username;
	
	@FindBy(id="myaccountTopLi")
	WebElement username;
	
	@FindBy(linkText="Profile")
	WebElement profile;
	
	@FindBy(linkText="Help")
	WebElement help;
	
	@FindBy(linkText="Manage Account")
	WebElement manageacct;
	
//	@FindBy(partialLinkText="SIGN OUT")
//	WebElement signout;
	@FindAll({
	@FindBy(linkText = "SIGN OUT"),
	@FindBy(partialLinkText = "SIGN OUT")
	})
	public WebElement signout;
	
	
	public WebElement MyTax()
	{
		return mytax;
	}
	public WebElement MyDoc()
	{
		return mydoc;
	}
	public WebElement TaxHistory()
	{
		return taxhistory;
	}
	public WebElement Username()
	{
		return username;
	}
	public WebElement Profile()
	{
		return profile;
	}
	public WebElement Help()
	{
		return help;
	}
	public WebElement ManageAccount()
	{
		return manageacct;
	}
	public WebElement SignOut()
	{
		return signout;
	}
		
}
