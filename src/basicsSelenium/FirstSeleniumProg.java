package basicsSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProg {

	public static void main(String[] args){

		//First step to create webdriver instance
		WebDriver driver;

		driver = new ChromeDriver();
		
		// Navigate to Google
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
			
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		
		driver.close(); // close the current window
		driver.quit(); // close all the opened windows
	}
}
