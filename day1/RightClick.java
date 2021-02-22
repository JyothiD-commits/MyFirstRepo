package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement rightClickButton=driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		
		action.contextClick(rightClickButton).build().perform();
		

		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-edit"));
		//WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		//WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-cut"));
		String copyText = copy.getText();
		System.out.println(copyText);
		Thread.sleep(2000);
		copy.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

}
