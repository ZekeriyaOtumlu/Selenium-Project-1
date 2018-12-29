package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2VerifyErrorMessage {
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver = new ChromeDriver(); // Open Browser
	driver.manage().window().maximize(); // if we want to maximize the window
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //wait for 'driver.findElement'statements
	
    driver.get ("https://www.facebook.com/"); // Navigate to URL
    driver.findElement(By.id("email")).sendKeys("otumluz@gmail.com"); // Enter valid email to Email part
    driver.findElement(By.id("pass")).sendKeys("zek34zek34"); // Enter valid password to Password Element
    driver.findElement(By.id("loginbutton")).click();
    
    String expectedMessage = "The email you’ve entered doesn’t match any account. Sign up for an account.";
    String actualMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
    System.out.println(actualMessage);
    
    if (expectedMessage.equals(actualMessage)) {
    	System.out.println("Test Case PASSED");
    } else {
    	System.out.println("Test Case FAILED");
    }
     driver.close();
    
    
	}   
    
}
