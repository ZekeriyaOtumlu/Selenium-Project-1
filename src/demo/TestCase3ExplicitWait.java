package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase3ExplicitWait {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // Open Browser
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait time
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1"); // Navigate to URL
		driver.findElement(By.cssSelector("#start > button")).click(); //Click on Start Button
		
		String expectedText = "Hello World!"; // After push the Start button 'Hello World!' Displayed
		
		WebDriverWait wait = new WebDriverWait(driver,10); // Explicit wait, after press Start button it will refresh only 
		                                                  //Start button part (IF WE DO NOT USE EXPLICIT WAIT TC WILL FAILED)
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
	    
	    String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
	    
	    if (expectedText.equals(actualText)) {
	    	System.out.println("Test Case PASSED");
	    	
	    	 } else {
	    		 System.out.println("TEST CASE FAILLED");
	    	 }
	    driver.close();
	    
	
	} 

}
