package Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.Taxhistory;
import Reusable.Sign_In_reusable;
import Reusable.BrowserinvokeUtility;

public class Tax_History {



	@Test
//	@Parameters("browser")
//	public void workspaceidcreation(String browser) throws IOException, InterruptedException, AWTException
	public void taxhistory() throws IOException, InterruptedException, AWTException
	//
	{
	
	
// Invoking the sign in method		
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
		
		
//Header page	
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		hover.moveToElement(globalnav.MyTax()).build().perform();
		globalnav.TaxHistory().click();
		Thread.sleep(3000);
				Taxhistory mytax= new Taxhistory(testdriver);
				System.out.println(mytax.TaxHistoryHeroText().getText());	
				System.out.println("\n"+ mytax.Yeardropdown().getText());
				Select select= new Select(mytax.Yeardropdown());
				select.selectByVisibleText("MY 2016 TAXES");
				Thread.sleep(2000);
				select.selectByVisibleText("MY 2015 TAXES");
				Thread.sleep(2000);
				select.selectByVisibleText("MY 2014 TAXES");
				Thread.sleep(2000);
				select.selectByVisibleText("MY 2013 TAXES");
				Thread.sleep(2000);
				select.selectByVisibleText("MY 2012 TAXES");
				Thread.sleep(2000);
				select.selectByVisibleText("MY 2011 TAXES");
				Thread.sleep(2000);
			   
			    System.out.println("Able to navigate through all the tax years");
			    Thread.sleep(2000);
				    
//Sign Out
		
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		Thread.sleep(2000);
		testdriver.quit();
		
	}

}
	
	
	
	

