package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		WebElement countries = driver.findElement(By.name("country")); // Uniquely identified the Object
		
		Select drpDown = new Select (countries); // Method for select 
		drpDown.selectByVisibleText("FINLAND"); // Select it  in the List
		Thread.sleep(5000); // pause 5 seconds
		
		driver.close();
	}

}
