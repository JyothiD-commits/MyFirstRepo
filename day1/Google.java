package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		}
	
	public void launchProduct() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
		
	}
	public void launchSite() throws InterruptedException
	{
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.id("gsc-i-id1")).sendKeys("Blackbox Testing");
		Thread.sleep(2000);
		//driver.findElement(By.id("gsc-i-id1")).click();
		driver.findElement(By.className("search-icon")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Google obj = new Google();
		obj.launchBrowser();
		obj.launchProduct();
		obj.launchSite();

	}

}
