package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click(); //first popup
		//driver.findElement(By.linkText("Good PopUp #2")).click();  //second popup
		//driver.findElement(By.cssSelector("tr:nth-child(1) td:nth-child(1) font:nth-child(14) b:nth-child(1) > a.black:nth-child(7)")).click();//third popup
		driver.findElement(By.partialLinkText("Good PopUp #4")).click(); //fourth popup
		
		
		
	}
}