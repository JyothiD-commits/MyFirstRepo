package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	/*
	 * public static WebDriver driver=null; //Global declaration String
	 * browser="firefox";
	 */

	
	/*
	 * static public void invokeChromeBrowser() //to invoke the chrome {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\drivers\\chromedriver_87\\chromedriver.exe"); driver = new
	 * ChromeDriver(); //create a chrome driver object
	 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 * driver.manage().window().maximize(); }
	 * 
	 * static public void invokeFirefoxBrowser() //firefox browser {
	 * System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
	 * driver = new FirefoxDriver(); driver.manage().timeouts().implicitlyWait(10,
	 * TimeUnit.SECONDS); // driver.manage().window().maximize(); }
	 * 
	 * static public void enterURL(String url) //enter the URL on the browser
	 * address-bar { driver.get(url); }
	 * 
	 * static public void closeBrowser() //to close the browser window {
	 * driver.close(); }
	 */
	static String browser="chrome";
	static WebDriver driver=null;
	static void invokeBrowser() //user defined method to invoke the browser
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			//To Open the Chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
			driver = new FirefoxDriver(); //Upcasting -> Run time polymorphism
		}
		else
		{
			System.out.println("This browser is not supported");
			System.exit(0);
		}
	}

	}


