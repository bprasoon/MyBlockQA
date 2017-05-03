package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class security2 {
	
	WebDriver testdriver;
	
	public security2(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(xpath="//div[@id='maindatacontent']/div[1]/fieldset/div[2]/dl/dd[1]/label")
	WebElement secutityquestion;
	
	@FindBy(css="[id='securityAnswer']")
	WebElement secutityanswer;
	
	@FindBy(css="[id='box']")
	WebElement remember;
	
	@FindBy(css="[id='defaultsecurityqn-next']")
	WebElement nextbutton;
	
	
	public WebElement Securityques()
	{
		return secutityquestion;
	}
	public WebElement Securityans()
	{
		return secutityanswer;
	}
	
	public WebElement Remembercheck()
	{
		return remember;
	}

	public WebElement Nextbutton()
	{
		return nextbutton;
	}
}
