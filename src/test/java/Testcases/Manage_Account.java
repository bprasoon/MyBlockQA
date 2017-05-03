package Testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.Manageaccount;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;

public class Manage_Account {

	
	@Test
	public void manageaccount() throws IOException, InterruptedException
	//
	{
			
// Invoking the sign in method	
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testdriver.manage().window().maximize();
		// Header page

		Actions hover = new Actions(testdriver); // Hover over
		Header globalnav = new Header(testdriver); // global navigation
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.ManageAccount().click();
		testdriver.switchTo().frame("basic-modal-iframe-manageaccount");
		testdriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Manageaccount manage = new Manageaccount(testdriver); // manage account
																// screen
		manage.CurrentPassword().sendKeys("Testing@1");
//		manage.Password().sendKeys("Testing@2");
//		manage.ConfirmPassword().sendKeys("Testing@2");
		Select sel = new Select(manage.SecurityQuestion1());
		sel.selectByVisibleText("What is the middle name of your youngest child?"); // 1st
																					// question
		manage.SecurityAnswer1().sendKeys("child");
		Select sel1 = new Select(manage.SecurityQuestion2());
		sel1.selectByVisibleText("What was your high school mascot?"); // 2nd
																		// question
		manage.SecurityAnswer2().sendKeys("mascot");
		Select sel2 = new Select(manage.SecurityQuestion3());
		sel2.selectByVisibleText("What is your oldest sibling's birthday month and year?"); // 3rd
																							// question
		manage.SecurityAnswer3().sendKeys("year");
		manage.SaveButton().click();

// Sign Out

		Thread.sleep(3000);
		System.out.println("Manage account editing was successful");
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		testdriver.quit();

	}
		
	}
	
	
	
	

