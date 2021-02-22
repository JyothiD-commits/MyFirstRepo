package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		//Select sel= new Select(month);
		//sel.selectByVisibleText("May");
		selectValueFromDropDown(month,"May");
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		//Select sel1 = new Select(day);
		//sel1.selectByIndex(10);
		selectValueFromDropDown(day,"10");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		//Select sel2 = new Select(year);
		//sel2.selectByValue("2000");
		selectValueFromDropDown(year,"2000");
		

	}
	
	public static void selectValueFromDropDown(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
		
	}


