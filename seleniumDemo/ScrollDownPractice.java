package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://web-school.in/try-demo/");
		 WebElement guardian = driver.findElement(By.xpath("//span[contains(text(),'Login as Guardian')]"));
			//	driver.findElement(By.xpath("//span[contains(text(),'Login as Admin')]")).click();
		     //  JavascriptExecutor js = (JavascriptExecutor) driver;
		   //    js.executeScript("arguments[0].scrollIntoView();", guardian);
		        Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);
				guardian.click();
				Thread.sleep(5000);
				driver.quit();    //closes both open windows
				

	}

}
