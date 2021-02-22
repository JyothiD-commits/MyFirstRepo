package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		invokeBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(from).release(to).build().perform();
		Thread.sleep(2000);
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
		driver.close();

	}

}
