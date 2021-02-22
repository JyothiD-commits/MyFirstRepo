package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");//enter the URL
		
		
		//to identify the select dropdown box
		WebElement currencydrpbox=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
	//	WebElement currencydrpbox = driver.findElement(By.xpath("//select[@class='valid']"));
		//currency selection
		Select currency = new Select(currencydrpbox);
		Thread.sleep(1000);
		currency.selectByValue("USD");
		Thread.sleep(1000);
		currency.selectByIndex(1);
		currency.selectByVisibleText("AED");
	//	driver.close();
		
		//Identify passenger & perform action
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		WebElement adlt = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	//	boolean adult1 = adult.isEnabled();
		
		Select adult = new Select(adlt);
		adult.selectByValue("5");
		adult.selectByVisibleText("9");
		adult.selectByIndex(5); //index starts from 0
		System.out.println("value of adult passenger is selected");
		
		//check friends & family checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println("Checkbox checked");
		
		//Select From City
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@text,'Hyderabad')]")).click();
		
		//select To City -> (//a[@value='BLR'])[2]
		driver.findElement(By.xpath("(//a[contains(@text,'Delhi')])[2]")).click();
	
		//Selecting the month
		String month = driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText();
		boolean monthname = month.contains("March");
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("May")) //!false -> opposite is true
		{
			driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		int count = driver.findElements(By.className("ui-state-default")).size();
	
		System.out.println("Total number of days "+ count);
		
		//Day Selection
		for(int i=0;i<count;i++)
		{
			String dayvalue = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(dayvalue.equalsIgnoreCase("10")) //if true
			{
			//	Thread.sleep(2000);
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
		
		/*//default date picker * 
		 * 
		WebDriverWait wait = new WebDriverWait(driver, 10); //explicit wait
		WebElement fromcity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ui-state-default ui-state-highlight ui-state-active")));
		fromcity.click();
		//	driver.findElement(By.cssSelector("ui-state-default ui-state-highlight ui-state-active")).click();
		*/
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		
		//Search button
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();	
		Thread.sleep(2000);
		driver.close();

	}

	


	}


