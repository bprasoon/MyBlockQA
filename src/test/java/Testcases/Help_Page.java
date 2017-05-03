package Testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.Help;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;

public class Help_Page {


	@Test
	public void Helppage() throws IOException, InterruptedException, AWTException
	
	{
	
//Invoking Sign In method		
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
		
		
//Header page	
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.Help().click();
		Thread.sleep(2000);
		Help hel= new Help(testdriver);
		System.out.println(hel.Technicalsupport().getText()+"\n");
		System.out.println(hel.CommunityHeader().getText()+"\n");
			
		
		//Tax Year selection
				 
	    System.out.println("\n"+"Help page is loading correct and has the right data");
	    
//Sign Out
		
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		testdriver.quit();
		
	}

}
	
	
	
	

