package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScript {

	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	public static void main(String[] args) {
	MyFirstScript obj =  new MyFirstScript();
	obj.launchBrowser();
	

	}

}
