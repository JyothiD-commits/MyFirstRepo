package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//driver.findElement(By.id("gsc-i-id1")).sendKeys("Black Box Testing");
		//driver.findElement(By.id("gsc-i-id1")).click();
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("Blackbox testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys(Keys.ENTER);
		
	}

}
