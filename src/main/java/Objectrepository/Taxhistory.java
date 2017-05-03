package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taxhistory {
	
	WebDriver testdriver;
	
	public Taxhistory(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(xpath=".//*[@id='togglecst']/div[2]")
	WebElement clientmatchpopup;
	
	@FindBy(id="taxYears")
	WebElement taxyear;
	
	@FindBy(css=".eight.columns.omega>h1>strong")
	WebElement taxhistoryherotext;
	
				
	public WebElement Yeardropdown()
	{
		return taxyear;
	}
	public WebElement TaxHistoryHeroText()
	{
		return taxhistoryherotext;
	}
	public WebElement ClientMatch()
	{
		return clientmatchpopup;
	}
		
}
