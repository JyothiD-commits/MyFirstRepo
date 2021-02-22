package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*static String browser = "firefox";
		static WebDriver driver=null;*/
		
		
			System.out.println("Welcome to Selenium and Java Training");
			
		// Invoking the browser	
			invokeBrowser();
			
			driver.manage().window().maximize();
			//Enter the URL
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			
			//To identify the list of columns
			List<WebElement> columns = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
			
			System.out.println("Columns/Headers : "+ columns.size());
			
			for(int i=0;i<columns.size();i++)
			{
				System.out.println(columns.get(i).getText());
			}
			
			//To find the number of rows/records within the table
			List<WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
			
			System.out.println(rows.size());
			
			/*System.out.println(rows.get(1).getText());//1st cell value of the header
			System.out.println(rows.get(2).getText()); //2nd header
			System.out.println(rows.get(3).getText()); //3rd
			System.out.println(rows.get(4).getText());
			System.out.println(rows.get(5).getText());*/
			
			for(int i=0;i<rows.size();i++)
			{
				System.out.println(rows.get(i).getText());
			}
			
			//To get the cell data
			WebElement cell = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[10]/td[1]"));
			System.out.println("particular cell value : "+cell.getText());
			
			Thread.sleep(2000);
			driver.close();
			
		}

	}


