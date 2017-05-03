package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile {
	
	WebDriver testdriver;
	
	public profile(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(xpath=".//*[@id='editsec']")
	WebElement editlink;
	
	@FindBy(xpath=".//*[@id='accordion1']/fieldset/dl[1]")
	WebElement namesection;
	
	@FindBy(xpath=".//*[@id='profileAccAdmin']")
	WebElement changelink;
	
	@FindBy(xpath=".//*[@id='box']")
	WebElement checkbox;
	
	@FindBy(xpath=".//*[@id='accordion2']/fieldset/div/span/a")
	WebElement privacylink;
	
	@FindBy(id="prefFirstName")
	WebElement prefirstname;
	
	@FindBy(id="prefLastName")
	WebElement prelastname;
	
	@FindBy(id="homeLineOne")
	WebElement lineone;
	
	@FindBy(id="homeLineTwo")
	WebElement linetwo;
	
	@FindBy(id="homeCity")
	WebElement homecity;
	
	@FindBy(id="stateIdHome")
	WebElement stateid;
	
	@FindBy(id="homePostalCode")
	WebElement postalcode;
	
	@FindBy(id="Mailingaddress")
	WebElement mailingaddcheckbox;
	
	@FindBy(id="mailingLineOne")
	WebElement mailingone;
	
	@FindBy(id="mailingLineTwo")
	WebElement mailingtwo;
	
	@FindBy(id="mailingLineCity")
	WebElement mailingcity;
	
	@FindBy(id="stateIdMailing")
	WebElement mailingstate;
	
	@FindBy(id="mailingPostalCode")
	WebElement mailingzip;
	
	@FindBy(id="homephoneNumber")
	WebElement homephone;
	
	@FindBy(id="cellphoneNumber")
	WebElement cellphone;
	
	@FindBy(id="businessphoneNumber")
	WebElement businessphone;
	
	@FindBy(id="preferredEmail")
	WebElement preferredemail;
	
	@FindBy(xpath=".//*[@id='accordion2']/fieldset/input")
	WebElement submitbutton;
	
	@FindBy(css="#successStatus")
	WebElement successmsg;
	
	
	public WebElement NameSection()
	{
		return namesection;
	}	
	public WebElement ChangeLink()
	{
		return changelink;
	}
	public WebElement CheckBox()
	{
		return checkbox;
	}
	public WebElement Editlink()
	{
		return editlink;
	}
	public WebElement privacylink()
	{
		return privacylink;
	}
	public WebElement PreferredFN()
	{
		return prefirstname;
	}
	public WebElement PreferredLN()
	{
		return prelastname;
	}
	public WebElement Homestreetadd()
	{
		return lineone;
	}
	public WebElement Homeapt()
	{
		return linetwo;
	}
	public WebElement Homecity()
	{
		return homecity;
	}
	public WebElement Homestate()
	{
		return stateid;
	}
	public WebElement Homepostal()
	{
		return postalcode;
	}
	public WebElement Mailingaddcheckbox()
	{
		return mailingaddcheckbox;
	}
	public WebElement Mailingstreet()
	{
		return mailingone;
	}
	public WebElement Mailingapt()
	{
		return mailingtwo;
	}
	public WebElement Mailingcity()
	{
		return mailingcity;
	}
	public WebElement Mailingstate()
	{
		return mailingstate;
	}
	public WebElement Mailingzip()
	{
		return mailingzip;
	}
	public WebElement HomePhone()
	{
		return homephone;
	}
	public WebElement CellPhone()
	{
		return cellphone;
	}
	public WebElement BusinessPhone()
	{
		return businessphone;
	}
	public WebElement PreferredEmail()
	{
		return preferredemail;
	}
	public WebElement SubmitButton()
	{
		return submitbutton;
	}
	public WebElement SucessMsg()
	{
		return successmsg;
	}
	
	
}
