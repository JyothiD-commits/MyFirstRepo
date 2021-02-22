package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class OrangeHRMS extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		invokeBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		

	}

}
