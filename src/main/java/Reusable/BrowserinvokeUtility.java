package Reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserinvokeUtility {
	
	public static WebDriver getDriver() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\tools\\Maven_Apps\\GittMvn\\src\\main\\java\\Configuration\\Mavendetails.properties");
		prop.load(fis);
		WebDriver driver = null;
		
		if (prop.getProperty("browser").equals("mobile"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\x136980\\Downloads\\chromedriver_win32\\2.29\\chromedriver.exe");	
			HashMap<String, String> mobileEmulation = new HashMap<String, String>();
		  	mobileEmulation.put("deviceName", "Apple iPhone 5"); //"Samsung Galaxy S4", "Apple iPad", "Apple iPhone 4"
		    HashMap<String, Object> chromeOptions = new HashMap<String, Object>();
		    chromeOptions.put("mobileEmulation", mobileEmulation);                     
		    DesiredCapabilities dc = DesiredCapabilities.chrome();
		    dc.setCapability(ChromeOptions.CAPABILITY, chromeOptions);   
		    chromeOptions.put("args", Arrays.asList("disable-extensions","test-type", "no-default-browser-check", "ignore-certificate-errors"));
		    driver = new ChromeDriver(dc);

	    }
		else if (prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\x136980\\Downloads\\chromedriver_win32\\2.29\\chromedriver.exe");	
			DesiredCapabilities dc=DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("disable-infobars");
			//options.addArguments("-incognito");
			options.addArguments("start-maximized");
			dc.setCapability(ChromeOptions.CAPABILITY, options);
			//dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			driver= new ChromeDriver(dc);
		}
		
		else if (prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\x136980\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");	
			DesiredCapabilities dc=DesiredCapabilities.firefox();
			dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			driver= new FirefoxDriver(dc);
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\x136980\\Downloads\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");		
			DesiredCapabilities dc= DesiredCapabilities.internetExplorer();
			dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			driver= new InternetExplorerDriver(dc);
		}
		
		return driver;
	
	}
	
	

}
