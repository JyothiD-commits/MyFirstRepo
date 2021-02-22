package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EBaySearch {
	WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
			
	}
	public void searchProduct() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speaker");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.linkText("Daily Deals")).click();
	}
public void navigate() throws InterruptedException
{
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.com");
	Thread.sleep(5000);
	driver.navigate().back();
}
public void printTitle() throws InterruptedException
{
	Thread.sleep(2000);
	System.out.println("https://www.ebay.com/");
}
public void closeWindow()
{
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
	EBaySearch obj = new EBaySearch();
	obj.launchBrowser();
	obj.searchProduct();
	obj.navigate();
	obj.printTitle();
	obj.closeWindow();
	

	}

}
