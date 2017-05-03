package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cardproofingscreen {
	
	WebDriver testdriver;
	
	public Cardproofingscreen(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="ssn1")
	WebElement ssn1;
	
	@FindBy(id="ssn2")
	WebElement ssn2;
	
	@FindBy(id="ssn3")
	WebElement ssn3;
	
	@FindBy(id="dob")
	WebElement dateofbirth;
	
	@FindBy(id="submitbtn")
	WebElement submitbutton;
	
	@FindBy(id="block4")
	WebElement last4card;
	
	@FindBy(id="cvv")
	WebElement cvv;
	
	@FindBy(id="pin")
	WebElement pin;
	
	@FindBy(id="box")
	WebElement checkbox;
	
	@FindBy(id="nxtBtn")
	WebElement nextbutton;
	
	@FindBy(xpath="//*[@id='basic-modal-cardproof']/div[1]/a")
	WebElement close;
	
	@FindBy(id="rdCardStatusDiv1")
	WebElement confirmmsg;
	
	@FindBy(id="rdCardStatusBtn1")
	WebElement Okbutton;
	
	public WebElement FirstName()
	{
		return firstname;
	}
	public WebElement LastName()
	{
		return lastname;
	}
	public WebElement SSN1()
	{
		return ssn1;
	}
	public WebElement SSN2()
	{
		return ssn2;
	}
	public WebElement SSN3()
	{
		return ssn3;
	}
	public WebElement DateOfBirth()
	{
		return dateofbirth;
	}
	public WebElement SubmitButton()
	{
		return submitbutton;
	}
	public WebElement Cardlast4digit()
	{
		return last4card;
	}
	public WebElement CVV()
	{
		return cvv;
	}
	public WebElement PIN()
	{
		return pin;
	}
	public WebElement CheckBox()
	{
		return checkbox;
	}
	public WebElement NextButton()
	{
		return nextbutton;
	}
	public WebElement ConfirmMessage()
	{
		return confirmmsg;
	}
	public WebElement Close()
	{
		return close;
	}
		public WebElement OKButton()
	{
		return Okbutton;
	}
}
