package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.profile;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;

public class Profile_Page {

static Robot robot;

	@Test
	public void profile_user() throws IOException, InterruptedException, AWTException
	
	{
				
//Invoking Sign In method		
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
				
//Header page
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		testdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		int present=testdriver.findElements(By.xpath(".//*[@id='profileFLi']")).size();
		if(present>0)
		{
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.Profile().click();
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		profile pro=new profile(testdriver);
		Thread.sleep(2000);
		String namesec=pro.NameSection().getText();

		if(namesec.contains("Preferred:"))
		{
			System.out.println("Profile services seems to be working, lets try editing the profile");
		}
		
		else
		{
			System.out.println("Profile services may be down");
		}
		
		testdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		int size=testdriver.findElements(By.xpath(".//*[@id='box']")).size();
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(size>0)
		{
		pro.CheckBox().click();
		Thread.sleep(2000);
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.Profile().click();
		Thread.sleep(2000);
		}
				    
		pro.Editlink().click();
		pro.PreferredFN().clear();
		pro.PreferredFN().sendKeys("JACK");
		pro.PreferredLN().clear();
		pro.PreferredLN().sendKeys("BEANSTALK");
		pro.Homestreetadd().clear();
		pro.Homestreetadd().sendKeys("Test street");
		pro.Homeapt().clear();
		pro.Homeapt().sendKeys("suite 100");
		pro.Homecity().clear();
		pro.Homecity().sendKeys("Test city");
		Select statedrop=new Select(pro.Homestate());
		statedrop.selectByValue("KS");
		pro.Homepostal().clear();
		pro.Homepostal().sendKeys("66666");
		pro.Mailingaddcheckbox().click();
		pro.HomePhone().clear();
		pro.HomePhone().sendKeys("9192818901");
		pro.CellPhone().clear();
		pro.CellPhone().sendKeys("8162342341");
		pro.BusinessPhone().clear();
		pro.BusinessPhone().sendKeys("9109103456");
		pro.PreferredEmail().clear();
		pro.PreferredEmail().sendKeys("prasoon.bhaskaran@hrblock.com");

		pro.SubmitButton().click();
		Thread.sleep(2000);
		
		
		String msg=pro.SucessMsg().getText();
		if(msg.equalsIgnoreCase("Thanks for updating your profile. It might take a few minutes for your changes to appear."))
		{
			System.out.println("\n"+"Profile editing was successful"+"\n");
			Thread.sleep(2000);
			hover.moveToElement(globalnav.Username()).build().perform();
			globalnav.Profile().click();
			Thread.sleep(2000);
			String namesec1=pro.NameSection().getText();

			if(namesec1.contains("Preferred:"))
			{
					System.out.println("Profile services are up and running");
										
			}
			
			else
			{
					System.out.println("Profile services are down");
			}
		}
		else
		{
			System.out.println("\n"+"Profile editing was not successful"+"\n");
			System.out.println("Profile services are down");
		}
		
//Sign Out
		
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		testdriver.quit();
	}
		else
		{
			System.out.println("Profile is not available for the user");
			hover.moveToElement(globalnav.Username()).build().perform();
			globalnav.SignOut().click();
			testdriver.quit();
		}
		
	}

}
	
	
	
	

