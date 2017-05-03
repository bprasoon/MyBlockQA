package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class security1 {
	
	WebDriver testdriver;
	
	public security1(WebDriver testdriver)
	{
		this.testdriver=testdriver;
		PageFactory.initElements(testdriver, this);
	}

	@FindAll({
		@FindBy(linkText = "I don't have access to this email address."),
		@FindBy(id ="resendsignInCode")
		})
	WebElement answersecuritylink;
//	@FindBy(xpath=".//*[@id='maindatacontent']/div/div[3]/p/a")
//	WebElement answersecuritylink;
	
	
	public WebElement Answerlink()
	{
		return answersecuritylink;
	}
	
	
}
