package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCX {
	
	WebDriver testdriver;
	
	public TCX(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(xpath="//div[@id='myHRBlockLink']/a")
	WebElement myblockbutton;
	
	@FindBy(xpath=".//*[@id='pageBodyInnerDiv']/div[3]/div/div[1]/div/div/h1")
	WebElement tcxtext;
	
	
				
	public WebElement MyBlockButton()
	{
		return myblockbutton;
	}
	public WebElement TCXtext()
	{
		return tcxtext;
	}
		
}
