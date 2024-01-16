package waitsDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	public static void test() throws InterruptedException{
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		// Navigate to Google
		driver.get("https://www.google.com/");	

		driver.findElement(By.name("q")).sendKeys("Abcd" + Keys.ENTER);


		//Waits for 30 sec element to be present
		//Checks the present every 5 secs
		Wait<WebDriver> wait = new FluentWait <WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement GOption = wait.until(new Function<WebDriver,WebElement>()
		{
			public WebElement apply(WebDriver driver) 
			{
				WebElement linkElement=  driver.findElement(By.xpath("//h3[normalize-space()='ABCD: Any Body Can Dance']"));

				if(linkElement.isEnabled()) {
					System.out.println("Element Found");
				}
				return linkElement;
			}	
		}
		);
		GOption.click();
	}
}


