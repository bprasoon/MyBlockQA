package Objectrepository;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\x136980\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
    
    }
}
