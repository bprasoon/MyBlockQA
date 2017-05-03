package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.Mydocuments;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;

public class My_Documents_Doc_Upload {

static Robot robot;

	@Test
	public void documentupload() throws IOException, InterruptedException, AWTException
	
	{
		
//Invoking Sign In method		
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver=n.signin_reuse(BrowserinvokeUtility.getDriver());
//		testdriver.manage().window().maximize();
		
//Header page	
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		hover.moveToElement(globalnav.MyTax()).build().perform();
		globalnav.MyDoc().click();
		Thread.sleep(3000);
		Mydocuments mydoc= new Mydocuments(testdriver);
		System.out.println(mydoc.MyDocHeroText().getText());
		Select select= new Select(mydoc.Yeardropdown());
		
		//uploading doc to tax year 2017
		select.selectByVisibleText("MY 2017 DOCS");
		Thread.sleep(3000);
	    mydoc.DragNDrop().click();
	    
	    //Client matching validation for the prospective client
	    boolean clientmatching= mydoc.ClientMatch().isDisplayed();
	    if(clientmatching)
		{
	    mydoc.Firstname().sendKeys("Testacc");
	    mydoc.Lastname().sendKeys("lastacc");
	    mydoc.Last4ssn().sendKeys("123456789");
	    mydoc.DOB().click();
	    mydoc.DOB().sendKeys("01011980");
	    mydoc.SubmitButton().click();
	    Thread.sleep(2000);
	    select.selectByVisibleText("MY 2017 DOCS");
	    Thread.sleep(3000);
	    mydoc.DragNDrop().click();
	    StringSelection s2017 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\Capture.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2017, null);
	    docupload();
	    Thread.sleep(3000);
	    System.out.println("Document uploaded successful for tax year 2017");
	  	}
	    else
	    {
	    StringSelection s2017 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\Capture.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2017, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2017");
	    }
	
	    //uploading doc to tax year 2016
	    select.selectByVisibleText("MY 2016 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2016 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\cman.tif");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2016, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2016");
	   
	  //uploading doc to tax year 2015
	    select.selectByVisibleText("MY 2015 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2015 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\Heros.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2015, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2015");
	   
	  //uploading doc to tax year 2014
	    select.selectByVisibleText("MY 2014 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2014 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\png4.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2014, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2014");
	    
	  //uploading doc to tax year 2013
	    select.selectByVisibleText("MY 2013 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2013 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\7MB.txt");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2013, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2013");
	  
	  //uploading doc to tax year 2012
	    select.selectByVisibleText("MY 2012 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2012 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\Tax form.gif");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2012, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2012");
	   
	  //uploading doc to tax year 2011
	    select.selectByVisibleText("MY 2011 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2011 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\BUG_150317_Current.doc");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2011, null);
	    docupload();
	    Thread.sleep(4000);
	    System.out.println("Document uploaded successful for tax year 2011");
	  
	  //uploading doc to tax year 2010
	    select.selectByVisibleText("MY 2010 DOCS");
		Thread.sleep(2000);
	    mydoc.DragNDrop().click();
	    StringSelection s2010 = new StringSelection("C:\\Users\\x136980\\Desktop\\Doc upload\\Capture.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2010, null);
	    docupload();
	    Thread.sleep(6000);
	    System.out.println("Document uploaded successful for tax year 2010"+"\n");
	    System.out.println("Document uploaded successfully to all the tax years");
	    
//Sign Out
		
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		testdriver.quit();
		
	}
public static void docupload() throws AWTException {
	
	    
	    robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);

		
	}
}
	
	
	
	

