package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPage {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public void demoSite() throws InterruptedException {
		WebElement userid = driver.findElement(By.name("uid"));
		userid.sendKeys("mngr303036");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("udUrUbY");
		Thread.sleep(2000);
		WebElement logbtn = driver.findElement(By.name("btnLogin"));
		logbtn.click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		loginPage lp = new loginPage();
		lp.launchBrowser();
		lp.demoSite();
		
		

	}

}
