package seleniumDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class WindowHandlePractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		invokeBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();//parent window
		String child = it.next();//child window
		System.out.println("parent "+parent);
		System.out.println("Child "+child);
	
		driver.switchTo().window(child);//Switch to child window from parent window
		System.out.println(driver.getTitle());
		
	//	driver.close();
		
		driver.switchTo().window(parent); //switching back to parent window from child window
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		
	}

	}


