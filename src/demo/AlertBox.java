package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	  
		driver.findElement(By.cssSelector("body > app-root > app-home > app-header > div.h_container > div."
				+ "h_main_div > div.h_head1 > a:nth-child(8) > span")).click();
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000); // Pause for 5 seconds
		
		driver.switchTo().alert().accept(); // Accept ()method emulates the action of clicking OK / YES button
		
		//driver.switchTo().alert().dismiss(); // Dismiss () method emulates the action of clicking NO/ CANCEL button
		
		driver.close();
	
	}
	

}
