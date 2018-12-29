package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();  // Disable the Push notifications
		options.addArguments("--disable-notifications");// Disable the Push notifications
		WebDriver driver = new ChromeDriver(options); // add options in the method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
		
		driver.findElement(By.cssSelector("#bx-element-891353-txSrrII > button")).click(); // When pop up windows appears and we want to close
		
		WebElement toys = driver.findElement(By.linkText("Toys"));
		
		Actions action = new Actions(driver); // we use Select for drop down list
		action.moveToElement(toys).perform();
		
		driver.findElement(By.linkText("Building & LEGO")).click();
		
		driver.close();
	}

}
