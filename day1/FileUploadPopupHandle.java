package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\jdand\\OneDrive\\Desktop\\Selwebdriver\\Training\\popup.txt");
		
		

	}

}
