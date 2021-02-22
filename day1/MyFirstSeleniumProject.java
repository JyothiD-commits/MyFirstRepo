package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProject {
	
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}

	public static void main(String[] args) {
	MyFirstSeleniumProject obj = new MyFirstSeleniumProject();
	obj.launchBrowser();

	}

}
