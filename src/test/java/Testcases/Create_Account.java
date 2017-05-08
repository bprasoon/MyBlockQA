package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objectrepository.Createaccount;
import Objectrepository.Createaccountquestions;
import Objectrepository.Header;
import Objectrepository.signIn;
import Reusable.BrowserinvokeUtility;

public class Create_Account {

	
	@Test
	public void createaccount() throws IOException, InterruptedException
	//
	{
		WebDriver testdriver=null;
		for(int i=1;i<3;i++)
		{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\tools\\Maven_Apps\\GittMvn\\src\\main\\java\\Configuration\\Mavendetails.properties");
		prop.load(fis);
		
		testdriver=BrowserinvokeUtility.getDriver();	
		testdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testdriver.get(prop.getProperty("URL"));
		signIn Inn=new signIn(testdriver);
		Inn.CreatAccountButton().click();
		
//UserName and Password	creation
		Createaccount crea=new Createaccount(testdriver);
		crea.Emailid().sendKeys(prop.getProperty("email"));
		crea.Username().sendKeys(i+"qa582017");
		crea.Password().sendKeys(prop.getProperty("password"));
		crea.ConfirmPassword().click();
		crea.ConfirmPassword().sendKeys(prop.getProperty("password"));
		crea.NextButton().click();
		
//Security question and answer
		Createaccountquestions creaq=new Createaccountquestions(testdriver);
		Select dropdown = new Select(creaq.Ques1());
		dropdown.selectByVisibleText("In what city were you born?");
		creaq.Ans1().sendKeys("born");
		Select dropdown1 = new Select(creaq.Ques2());
		dropdown1.selectByVisibleText("In what city was your first job?");
		creaq.Ans2().sendKeys("job");
		Select dropdown2 = new Select(creaq.Ques3());
		dropdown2.selectByVisibleText("What was the make and model of your first car?");
		creaq.Ans3().sendKeys("car");
		creaq.Terms().click();
		creaq.SubmitButton().click();
		
//		Sign Out
		Actions hover=new Actions(testdriver);
		Header globalnav=new Header(testdriver);
		Thread.sleep(1000);
		hover.moveToElement(globalnav.Username()).build().perform();
		globalnav.SignOut().click();
		System.out.println("Account created successfully");
		testdriver.quit();
		
		}

	}
	
	
	
	
}
