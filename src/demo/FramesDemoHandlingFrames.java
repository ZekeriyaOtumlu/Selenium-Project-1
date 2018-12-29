package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemoHandlingFrames {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // Open Browser
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicitly Wait Time
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html"); // Navigate to URL
		
		driver.switchTo().frame("classFrame"); // Go to into frame
		driver.findElement(By.linkText("DEPRECATED")).click(); // Go to DEPRECATED and click on it
		
		driver.switchTo().defaultContent(); // Go OUT of Frame
		
		driver.switchTo().frame("packageFrame"); // Go to into another frame
		driver.findElement(By.linkText("CloseWindow")).click(); // Go to CloseWindow in frame and click on it
		
		driver.close(); // Close the browser
	}

}
