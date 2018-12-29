package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1VerifyTitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver,chromedriver" ," chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Open Browser
		
		driver.get("https:\\facebook.com"); // Navigate to URL
		
		String expectedTitle = "Facebook - Log In or Sign Up"; // It will come with functional requirements
		String actualTitle = driver.getTitle(); // method
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("TestCase PASSED");
		} else {
			System.out.println("Test Case FAILED");
		}
		driver.close(); // method for Close Browser
		//driver.quit(); // it's for MAC
		
		
	}

}
