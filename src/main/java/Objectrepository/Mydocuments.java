package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mydocuments {
	
	WebDriver testdriver;
	
	public Mydocuments(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(xpath=".//*[@id='togglecst']/div[2]")
	WebElement clientmatchpopup;
	
	@FindBy(id="taxYears")
	WebElement taxyear;
	
	@FindBy(id="fileDropzone")
	WebElement filedrop;
	
	@FindBy(css=".eight.columns.omega>h1>strong")
	WebElement mydocherotext;
	@FindBy(css="#fname")
	WebElement firstname;
	@FindBy(css="#lname")
	WebElement lastname;
	@FindBy(css="#last4ssn")
	WebElement last4ssn;
	@FindBy(css="#clientmatchDOB")
	WebElement clientdob;
	@FindBy(css="#clk_submitidp")
	WebElement submitbutton;
			
	@FindBy(partialLinkText="SIGN OUT")
	WebElement signout;
	

	public WebElement Yeardropdown()
	{
		return taxyear;
	}
	
	public WebElement MyDocHeroText()
	{
		return mydocherotext;
	}
	public WebElement ClientMatch()
	{
		return clientmatchpopup;
	}
	public WebElement DragNDrop()
	{
		return filedrop;
	}
	public WebElement Firstname()
	{
		return firstname;
	}
	public WebElement Lastname()
	{
		return lastname;
	}
	public WebElement Last4ssn()
	{
		return last4ssn;
	}
	public WebElement DOB()
	{
		return clientdob;
	}
	public WebElement SubmitButton()
	{
		return submitbutton;
	}
	
}
