package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.name("name592d8eda")).sendKeys("Naga Jyothi");
		driver.findElement(By.xpath("//input[@name='login592d8eda']")).sendKeys("jdandemraju");
		driver.findElement(By.xpath("//input[@name='passwd05213b7f']")).sendKeys("ashwath1");

	}

}
