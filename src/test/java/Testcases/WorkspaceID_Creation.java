package Testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;
import Objectrepository.Header;
import Objectrepository.Mydocuments;
import Reusable.Sign_In_reusable;
import Reusable.BrowserinvokeUtility;

public class WorkspaceID_Creation {



	@Test
//	@Parameters("browser")
//	public void workspaceidcreation(String browser) throws IOException, InterruptedException, AWTException
	public void workspaceidcreation() throws IOException, InterruptedException, AWTException
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
		globalnav.MyDoc().click();
		Thread.sleep(3000);
		Mydocuments mydoc= new Mydocuments(testdriver);
		Select select= new Select(mydoc.Yeardropdown());
		select.selectByVisibleText("MY 2017 DOCS");
		Thread.sleep(3000);
	    mydoc.DragNDrop().click();
	    boolean clientmatching= mydoc.ClientMatch().isDisplayed();
	    if(clientmatching)
		{
	    mydoc.Firstname().sendKeys("Testacc");
	    mydoc.Lastname().sendKeys("lastacc");
	    mydoc.Last4ssn().sendKeys("123456789");
	    mydoc.DOB().click();
	    mydoc.DOB().sendKeys("01011980");
	    mydoc.SubmitButton().click();
	    System.out.println("Workspace Id created successfully");
	    Thread.sleep(2000);
	  	}
	    else
	    {
	    System.out.println("Workspace Id already exist");
	    Thread.sleep(2000);
	    }
	    
//Sign Out
		
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		Thread.sleep(2000);
		testdriver.quit();
		
	}

}
	
	
	
	

