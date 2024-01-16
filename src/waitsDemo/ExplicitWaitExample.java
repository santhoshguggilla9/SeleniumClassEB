package waitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		// Navigate to Google
		driver.get("https://demoqa.com/radio-button");
			
		
		//driver.findElement(By.name("q")).sendKeys("Abcd" + Keys.ENTER);
		
		//ExplicitWait Syntax
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//Creating WebElement to store the element value
		WebElement btnRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")));
		btnRadio.click();
		
		System.out.println("First Result:"+btnRadio.getText());
				
		//driver.quit();
	}
}
