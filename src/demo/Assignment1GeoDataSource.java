package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1GeoDataSource {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  //Open Browser
		driver.manage().window().maximize();    // Maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicitly Wait Time
		
		driver.get("https://www.geodatasource.com/world-major-cities-database"); // Navigate to URL
		
		WebElement countryName = driver.findElement(By.id("countryCode"));
		Select drpDown = new Select(countryName); // Method
		drpDown.selectByVisibleText("Finland"); // Chose the Finland in the List
		
    	WebDriverWait wait = new WebDriverWait(driver,10); //Explicit wait time( for the next we do not need to write again )
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("countryCode")));
		
		WebElement regionName = driver.findElement(By.id("regionName"));
		Select drpDown1 = new Select(regionName); //Method
		drpDown1.selectByVisibleText("Uusimaa"); // Select it from the list
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10); // Explicit Wait // we do not need write again
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("regionName"))); // Explicit Wait
		
		WebElement cityName = driver.findElement(By.id("cityName"));
		Select drpDown2 = new Select(cityName); // method
		drpDown2.selectByVisibleText("Espoo"); // Selected from city list
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cityName"))); // Explicit Wait
		
		String expectedText = "Note: For demo, only first 5 characters of the city names will be shown.";
		String actualText = driver.findElement(By.cssSelector("body > div.main > div > div > div > div > div > div.col-md-9.col-sm-7 > div > div > div:nth-child(7) > div.portlet-body > div > form > div.note.note-info")).getText();
		
		if (expectedText.equals(actualText)) {
			System.out.println("PASSED:):):)");
		} else { 
			System.out.println("FAILED:(:(:(");
		}
		
		driver.close(); // Close Browser
	}

}
