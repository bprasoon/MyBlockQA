package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manageaccount {
	
	WebDriver testdriver;
	
	public Manageaccount(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	
	@FindBy(id="currentPassword")
	WebElement currentpass;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="confirmPassword")
	WebElement confirmpass;
	@FindBy(id="securityQuestion1")
	WebElement secques1;
	@FindBy(id="securityAnswer1")
	WebElement secans1;
	@FindBy(id="securityQuestion2")
	WebElement secques2;
	@FindBy(id="securityAnswer2")
	WebElement secans2;
	@FindBy(id="securityQuestion3")
	WebElement secques3;
	@FindBy(id="securityAnswer3")
	WebElement secans3;
	@FindBy(id="mobileNumber")
	WebElement mobnum;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="defaultmanageaccount")
	WebElement savechangesbutton;
	
	
	public WebElement CurrentPassword()
	{
		return currentpass;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement ConfirmPassword()
	{
		return confirmpass;
	}
	public WebElement SecurityQuestion1()
	{
		return secques1;
	}
	public WebElement SecurityQuestion2()
	{
		return secques2;
	}
	public WebElement SecurityQuestion3()
	{
		return secques3;
	}
	public WebElement SecurityAnswer1()
	{
		return secans1;
	}
	public WebElement SecurityAnswer2()
	{
		return secans2;
	}
	public WebElement SecurityAnswer3()
	{
		return secans3;
	}
	public WebElement Email()
	{
		return email;
	}
	public WebElement SaveButton()
	{
		return savechangesbutton;
	}
	
}
