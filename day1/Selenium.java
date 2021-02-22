package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//driver.findElement(By.id("gsc-i-id1")).sendKeys("Black Box Testing");
		//driver.findElement(By.id("gsc-i-id1")).click();
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("Blackbox testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys(Keys.ENTER);
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Selenium obj = new Selenium();
		obj.launchBrowser();		
	}

}
