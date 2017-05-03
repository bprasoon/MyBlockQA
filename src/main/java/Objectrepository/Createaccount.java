package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccount {
	
	WebDriver testdriver;
	
	public Createaccount(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(css="[id='email']")
	WebElement emailid;
	
	@FindBy(css="[id='userName']")
	WebElement username;
	
	@FindBy(css="[id='password']")
	WebElement password;
	
	@FindBy(id="confirmpassword")
	WebElement confirmpassword;
	
	@FindBy(css="[id='showhide']")
	WebElement Nextbutton;
	
	
	public WebElement Emailid()
	{
		return emailid;
	}
	public WebElement Username()
	{
		return username;
	}
		public WebElement Password()
	{
		return password;
	}
	public WebElement ConfirmPassword()
	{
		return confirmpassword;
	}
	public WebElement NextButton()
	{
		return Nextbutton;
		
	}
}
