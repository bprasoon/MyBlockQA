package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Objectrepository.Dashboard;
import Objectrepository.Dotcom;
import Objectrepository.Header;
import Objectrepository.TCX;
import Reusable.BrowserinvokeUtility;
import Reusable.Sign_In_reusable;


public class Dotcomto_MyBlock {

	
	
	@Test
	public void dotcommyblock() throws IOException, InterruptedException
	{
		WebDriver testdriver=BrowserinvokeUtility.getDriver();
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\tools\\Maven_Apps\\GittMvn\\src\\main\\java\\Configuration\\Mavendetails.properties");
		prop.load(fis);
		testdriver.get(prop.getProperty("dotcomURL"));
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Dotcom dot=new Dotcom(testdriver);
		dot.SignIn().click();
//		dot.CreateMyacc().click();
		dot.SignInMyacc().click();
		if (testdriver.equals("InternetExplorerDriver"))
		{
		testdriver.navigate().to("javascript:document.getElementById('overridelink').click()");
		}
//Sign in method	
//		Create_Account_reusable nn=new Create_Account_reusable();
//		nn.createaccount(testdriver);
		Sign_In_reusable nn=new Sign_In_reusable();
		nn.signin_reuse(testdriver);

				
		Dashboard prosp= new Dashboard(testdriver);
		prosp.GotoMyTaxes().click();
		
		TCX mbnavigation =new TCX(testdriver);
		WebDriverWait myblocklink=new WebDriverWait(testdriver, 20);
		myblocklink.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pageBodyInnerDiv']/div[3]/div/div[1]/div/div/h1")));
		mbnavigation.MyBlockButton().click();
		//testdriver.findElement(By.xpath("//div[@id='myHRBlockLink']/a")).click();
		Thread.sleep(3000);
		
//Sign Out
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		System.out.println("Sign in Complete");
		//testdriver.quit();
	
	}

	
	

}



		



