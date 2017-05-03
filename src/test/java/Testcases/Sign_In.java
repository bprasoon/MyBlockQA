package Testcases;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Objectrepository.Header;
import Objectrepository.Responsiveheader;
import Reusable.Sign_In_reusable;
import Reusable.BrowserinvokeUtility;

public class Sign_In {

	
	
	@Test
	public void signin() throws IOException, InterruptedException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\tools\\Maven_Apps\\Mavenproject\\src\\main\\java\\Configuration\\Mavendetails.properties");
		prop.load(fis);
// Invoking the sign in method	
		Sign_In_reusable n=new Sign_In_reusable();
		WebDriver testdriver = n.signin_reuse(BrowserinvokeUtility.getDriver());
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Sign Out
		if (prop.getProperty("browser").equals("mobile"))
		{
			Responsiveheader rightnav=new Responsiveheader(testdriver);
			rightnav.LogoutIcon().click();
			Thread.sleep(2000);
			rightnav.signout.click();
			System.out.println("Sign in/Sign out in responsive mobile browser is working as expected");
			testdriver.quit();
		}
		
		else
		{
			Actions hover=new Actions(testdriver);
			Header globalnav=new Header(testdriver);
//			hover.moveToElement(globalnav.Username()).build().perform();
			hover.moveToElement(globalnav.Username()).perform();
			globalnav.SignOut().click();
			System.out.println("Sign in/Sign out is working as expected in web");
			testdriver.quit();
		}
	
	}


}



		
//		public void signin_reuse() throws IOException
//		WebDriver testdriver=null;
//		Properties prop = new Properties();
//		FileInputStream fis= new FileInputStream("C:\\Users\\x136980\\workspace1\\Intro\\src\\testcases\\details.properties");
//		prop.load(fis);
//		
//			
//		if (prop.getProperty("browser").equals("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\x136980\\Downloads\\chromedriver_win32\\chromedriver.exe");		
//			testdriver= new ChromeDriver();
//	    }
//		else if (prop.getProperty("browser").equals("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\x136980\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");	
//			testdriver= new FirefoxDriver();
//		}
//		else
//		{
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\x136980\\Downloads\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe");			
//			testdriver= new InternetExplorerDriver();
//		}
//		testdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		testdriver.get(prop.getProperty("URL"));
//		
////UserName and Password		
//		signIn Inn=new signIn(testdriver);
//		Inn.Username().sendKeys(prop.getProperty("username"));
//		Inn.Password().sendKeys(prop.getProperty("password"));
//		Inn.SignInButton().click();
//		
////Security answer link
//		security1 anslink =new security1(testdriver);
//		anslink.Answerlink().click();
//		
////Security Answer page
//		security2 secans =new security2(testdriver);
//		String secq=secans.Securityques().getText();	
//		
//		if(secq.equals("In what city were you born?")){
//			secans.Securityans().sendKeys("born");
//		}
//		else if(secq.equals("In what city was your first job?")){
//			secans.Securityans().sendKeys("job");
//		}
//		else if(secq.equals("What is the middle name of your youngest child?")){
//			secans.Securityans().sendKeys("child");
//		}
//		else if(secq.equals("What was the make and model of your first car?")){
//			secans.Securityans().sendKeys("car");
//		}	
//		else if(secq.equals("What was your high school mascot?")){
//			secans.Securityans().sendKeys("mascot");			
//		}
//		else if(secq.equals("What is your oldest sibling's birthday month and year?")){
//			secans.Securityans().sendKeys("year");			
//		}
//		else if(secq.equals("What was the last name of your 3rd grade teacher?")){
//			secans.Securityans().sendKeys("teacher");			
//		}
//		else if(secq.equals("In what city does your nearest sibling live?")){
//			secans.Securityans().sendKeys("live");			
//		}
//		else if(secq.equals("What street did you live on in 6th grade?")){
//			secans.Securityans().sendKeys("grade");			
//		}
//		else if(secq.equals("What was the name of your first pet?")){
//			secans.Securityans().sendKeys("pet");			
//		}
//		else if(secq.equals("What is your favorite vacation spot?")){
//			secans.Securityans().sendKeys("spot");			
//		}
//		else if(secq.equals("What was your childhood nickname?")){
//			secans.Securityans().sendKeys("nickname");			
//		}
//		boolean selection1= secans.Remembercheck().isEnabled();
//				
//		 if(selection1==true)
//		 {
//			 secans.Remembercheck().click(); 
//		 }
//		secans.Nextbutton().click();
		



