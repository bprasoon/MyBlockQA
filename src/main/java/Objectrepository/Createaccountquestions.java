package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccountquestions {
	
	WebDriver testdriver;
	
	public Createaccountquestions(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindBy(css="[id='securityQuestion1']")
	WebElement ques1;
	
	@FindBy(css="[id='securityQuestion2']")
	WebElement ques2;
	
	@FindBy(css="[id='securityQuestion3']")
	WebElement ques3;
	
	@FindBy(css="[id='securityAnswer1']")
	WebElement ans1;
	
	@FindBy(css="[id='securityAnswer2']")
	WebElement ans2;
	
	@FindBy(css="[id='securityAnswer3']")
	WebElement ans3;
	
	@FindBy(css="[id='termsbox']")
	WebElement termbox;
	
	@FindBy(css="[id='submitButton']")
	WebElement submitbutton;
	
	
	
	public WebElement Ques1()
	{
		return ques1;
	}
	public WebElement Ques2()
	{
		return ques2;
	}
		public WebElement Ques3()
	{
		return ques3;
	}
	public WebElement Ans1()
	{
		return ans1;
	}
	public WebElement Ans2()
	{
		return ans2;
		
	}
	public WebElement Ans3()
	{
		return ans3;
		
	}
	public WebElement Terms()
	{
		return termbox;
		
	}
	public WebElement SubmitButton()
	{
		return submitbutton;
		
	}
}
