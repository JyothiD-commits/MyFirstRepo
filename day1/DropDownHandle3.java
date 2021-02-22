package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandle3 {
    static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		
		String month_xpath = "//select[@id='month']";
		String day_xpath = "//select[@id='day']";
		String year_xpath = "//select[@id='year']";
		
		selectDropDownValue(month_xpath,"May");
		selectDropDownValue(day_xpath,"10");
		selectDropDownValue(year_xpath,"2000");
				

	}
	public static void selectDropDownValue(String xpathValue, String value)
	{

		List<WebElement>monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());
		
		for(int i=0;i<monthList.size();i++)
				{
					System.out.println(monthList.get(i).getText());
					
					if(monthList.get(i).getText().equals(value))
							{
						monthList.get(i).click();
						break;
							}
				}
		
	}
	

}
