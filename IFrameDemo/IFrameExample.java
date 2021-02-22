package IFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		driver.switchTo().frame("moneyiframe");
		
		String nse = driver.findElement(By.id("nseindex")).getText();
		System.out.println("NSE Index = "+nse);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("MOVIES")).click();
		driver.close();
		
		
		

	}

}
