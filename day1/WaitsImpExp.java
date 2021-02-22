package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsImpExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_2")).click();
				
		
		//WebElement firstName = driver.findElement(By.name("firstname"));
		//WebElement lastName = driver.findElement(By.name("lastname"));
		//WebElement mobNum = driver.findElement(By.name("reg_email__"));
		//WebElement passWrd = driver.findElement(By.name("reg_passwd__"));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("u_1_9"));
		
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot Password?"));
		
		//sendKey(driver,firstName,10,"Tom");
		//sendKey(driver,lastName,5,"Harris");
		//sendKey(driver, mobNum, 5, "123456789");
		//sendKey(driver, passWrd, 5,"test@123");
		
		clickOn(driver, forgotPwd, 5);
				

	}
	
	
	public static void sendKey(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
	}
	public static void clickOn(WebDriver driver, WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}
