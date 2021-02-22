package seleniumDemo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo extends BaseClass {

	public static void main(String[] args) {
		invokeBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		Actions act = new Actions(driver);
		
		Action action = act
				.moveToElement(search)
				.click()
				.keyDown(search, Keys.SHIFT)  //press down
				.sendKeys("Selenium")         //caps
				.keyUp(search, Keys.SHIFT)  
				.keyDown(search, Keys.CONTROL)  //highlight				
				.sendKeys("Testing")				
				.doubleClick()
				.contextClick()
				.build();				
		        action.perform();

				
		

	}

}
