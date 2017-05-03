package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Objectrepository.Cardproofingscreen;

import Objectrepository.Dashboard;
import Objectrepository.Header;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;

public class Card_Proofing {

	
	@Test
	public void cardproofing() throws IOException, InterruptedException
	//
	{
			
// Invoking the sign in method	
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//Header page		
		Dashboard Accesscard=new Dashboard(testdriver);
		Accesscard.AccessMyCard().click();
		testdriver.switchTo().frame("basic-modal-iframe-cardproof");
		Cardproofingscreen cardproof=new Cardproofingscreen(testdriver);
		cardproof.FirstName().sendKeys("Test");
		cardproof.LastName().sendKeys("card");
		cardproof.SSN1().sendKeys("526");
		cardproof.SSN2().sendKeys("89");
		cardproof.SSN3().sendKeys("0442");
		cardproof.DateOfBirth().click();
		cardproof.DateOfBirth().sendKeys("01011950");
		cardproof.SubmitButton().click();
		cardproof.Cardlast4digit().sendKeys("3157");
		cardproof.CVV().sendKeys("542");
		cardproof.PIN().sendKeys("3157");
		cardproof.CheckBox().click();
		cardproof.NextButton().click();
		Thread.sleep(2000);
		
		int confmsg=testdriver.findElements(By.xpath("//*[@id='rdCardStatusDiv1']")).size();
		 if(confmsg>0)
		{
			 String confmsgtxt=cardproof.ConfirmMessage().getText();
	
			 if(	confmsgtxt.equals("Congratulations, you now have access to your Emerald Card!"))
				{
				cardproof.OKButton().click();
				testdriver.switchTo().defaultContent();
				System.out.println("Card proof is complete and successful");
				
				}
		
			else
			{
			System.out.println("Card proof is unsuccessful");
			}
		}
		else
			{
			testdriver.switchTo().defaultContent();
			cardproof.Close().click();
			System.out.println("Card proofing failed");
			}
//Sign Out
		Actions hover=new Actions(testdriver);
		Thread.sleep(2000);
		Header globalnav=new Header(testdriver);
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		testdriver.quit();
		
	}


		
	}
	
	
	
	

