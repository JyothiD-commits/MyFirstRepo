package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {
WebDriver driver;

    public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\jdand\\OneDrive\\Desktop\\SelWebDriver\\FireFox Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.wikipedia.org/");
}

    public void launchLanguage() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("js-link-box-en")).click();
	Thread.sleep(2000);
}
    public void searchObject() throws InterruptedException
    {
    	Thread.sleep(2000);
    	driver.findElement(By.id("searchInput")).sendKeys("Software Testing");
    	Thread.sleep(2000);
    	driver.findElement(By.id("searchButton")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("Black-box_testing")).click();
    	Thread.sleep(2000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	driver.close();
    }

	public static void main(String[] args) throws InterruptedException {
		
Wikipedia obj = new Wikipedia();
obj.launchBrowser();
obj.launchLanguage();
obj.searchObject();
	}

}
