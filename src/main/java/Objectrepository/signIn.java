package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {
	
	WebDriver testdriver;
	
	public signIn(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(css="[id='username']")
	WebElement username;
	
	@FindBy(css="[id='password']")
	WebElement password;
	
	@FindBy(css="[id='defaultSignInUser']")
	WebElement signinbutton;
	
	@FindBy(css="[id='createID']")
	WebElement createaccountbutton;
	
	public WebElement Username()
	{
		return username;
	}
		public WebElement Password()
	{
		return password;
	}
	public WebElement SignInButton()
	{
		return signinbutton;
		
	}
	public WebElement CreatAccountButton()
	{
		return createaccountbutton;
		
	}
}
