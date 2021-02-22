package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByIndex(1);
		
		List<WebElement>listDays = select.getOptions();
		
		int TotalDays = listDays.size()-1;
		System.out.println("Total days are:"+TotalDays);
		
		for(int i=0;i<TotalDays;i++)
		{
			String dayVal=listDays.get(i).getText();
			System.out.println(dayVal);
			if(dayVal.equals("21"))
			{
				listDays.get(i).click();
				break;
			}
		
		
		}
	}
}


		
		
	
	


