package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://guide.blazemeter.com/hc/en-us");
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("ul#categories"));  //to select total categories
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//header/div[2]/ul[1]/li[1]/a[1]")).click();  //to select first link
		//driver.findElement(By.cssSelector("ul#categories>li:first-of-type")).click();  //to select first link
		//driver.findElement(By.cssSelector("ul#categories>li:last-of-type")).click();   //to select last link
		driver.findElement(By.cssSelector("ul#categories>li:nth-of-type(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Creating API Functional Tests')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Scripting an API Functional Test in the UI')]")).click();
		
		
		

	}

}
