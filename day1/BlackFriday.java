package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlackFriday {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.kohls.com/");
	}
	public void searchObject() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("Black Friday Deals");
		Thread.sleep(2000);
		//driver.navigat().to.By.className("holiday-offers-4row-header")).click();
		driver.findElement(By.name("submit-search")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		
BlackFriday obj = new BlackFriday();
obj.launchBrowser();
obj.searchObject();
	
	}

}
