package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org");
		
	    List<WebElement>linkList = driver.findElements(By.id("p-navigation"));
	    System.out.println(linkList.size());
	    
	    for(int i=1;i<linkList.size();i++)
	   {
	    String linktext = linkList.get(i).getText();
	    	
	    System.out.println(linktext);
	    	
	   }
	    Thread.sleep(5000);
	    driver.close();
	    
		}

}
