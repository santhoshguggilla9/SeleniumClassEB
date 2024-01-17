package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBExample {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement gSearch = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		gSearch.sendKeys("sign up for facebook" + Keys.ENTER);
	
		driver.close();

	}

}
