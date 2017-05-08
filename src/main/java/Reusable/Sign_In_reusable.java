package Reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Objectrepository.security1;
import Objectrepository.security2;
import Objectrepository.signIn;

public class Sign_In_reusable {

	
	
	@Test
	public WebDriver signin_reuse(WebDriver testdriver) throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\tools\\Maven_Apps\\GittMvn\\src\\main\\java\\Configuration\\Mavendetails.properties");
		prop.load(fis);
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//testdriver.manage().window().maximize();
		//testdriver.get(prop.getProperty("URL"));
		
//UserName and Password		
		signIn Inn=new signIn(testdriver);
		Inn.Username().sendKeys(prop.getProperty("username"));
		Inn.Password().sendKeys(prop.getProperty("password"));
		Inn.SignInButton().click();
		
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int a=testdriver.findElements(By.xpath(".//*[@id='maindatacontent']/div/div[3]/p/a")).size();
		if(a>0)
		{
//Security answer link
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		security1 anslink =new security1(testdriver);
		anslink.Answerlink().click();
		
//Security Answer page
		security2 secans =new security2(testdriver);
		String secq=secans.Securityques().getText();	
		
		if(secq.equals("In what city were you born?")){
			secans.Securityans().sendKeys("born");
		}
		else if(secq.equals("In what city was your first job?")){
			secans.Securityans().sendKeys("job");
		}
		else if(secq.equals("What is the middle name of your youngest child?")){
			secans.Securityans().sendKeys("child");
		}
		else if(secq.equals("What was the make and model of your first car?")){
			secans.Securityans().sendKeys("car");
		}	
		else if(secq.equals("What was your high school mascot?")){
			secans.Securityans().sendKeys("mascot");			
		}
		else if(secq.equals("What is your oldest sibling's birthday month and year?")){
			secans.Securityans().sendKeys("year");			
		}
		else if(secq.equals("What was the last name of your 3rd grade teacher?")){
			secans.Securityans().sendKeys("teacher");			
		}
		else if(secq.equals("In what city does your nearest sibling live?")){
			secans.Securityans().sendKeys("live");			
		}
		else if(secq.equals("What street did you live on in 6th grade?")){
			secans.Securityans().sendKeys("grade");			
		}
		else if(secq.equals("What was the name of your first pet?")){
			secans.Securityans().sendKeys("pet");			
		}
		else if(secq.equals("What is your favorite vacation spot?")){
			secans.Securityans().sendKeys("spot");			
		}
		else if(secq.equals("What was your childhood nickname?")){
			secans.Securityans().sendKeys("nickname");			
		}
		boolean selection1= secans.Remembercheck().isEnabled();
				
		 if(selection1==true)
		 {
			 secans.Remembercheck().click(); 
		 }
		secans.Nextbutton().click();
		return testdriver;
		}
		
		else
		{
			return testdriver;
		}
		
		
		}
		

	}



