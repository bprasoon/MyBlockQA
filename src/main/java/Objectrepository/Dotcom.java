package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dotcom {
	
	WebDriver testdriver;
	
	public Dotcom(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

//	@FindBy(linkText="I don't have access to this email address.")
//	WebElement answersecuritylink;
	
	@FindBy(xpath=".//*[@id='body']/header/div/button[2]")
	WebElement signin;
	
	@FindBy(xpath=".//*[@id='nav-signin']/a[1]")
	WebElement signinmyacc;
	
	@FindBy(xpath=".//*[@id='nav-signin']/a[2]")
	WebElement createmyacc;
	
	public WebElement SignIn()
	{
		return signin;
	}
	public WebElement SignInMyacc()
	{
		return signinmyacc;
	}
	public WebElement CreateMyacc()
	{
		return createmyacc;
	}
	
}
