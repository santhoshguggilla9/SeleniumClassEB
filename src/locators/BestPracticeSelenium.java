package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class google
{
	WebDriver driver;

	google()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	public void test()
	{
		WebElement SearchElement = driver.findElement(By.name("q"));
		SearchElement.sendKeys("Santhosh");
		SearchElement.click();
	}
	public void teardown()
	{
		driver.close();
	}
}
public class BestPracticeSelenium {
	public static void main(String[] args) {
		
		google tobj = new google();
		
		tobj.test();
		tobj.teardown();
	}
}
