package controlsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkAssignment {

	public static void main(String[] args) {
		
		// First step to create webdriver instance
        WebDriver driver;

        driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://designsystem.digital.gov/components/checkbox/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        driver.findElement(By.xpath("//body/div[@class='default-container']/div[@class='usa-in-page-nav-container']/main[@id='main-content']/div[@class='styleguide-content usa-prose site-prose']/div[@class='usa-accordion usa-accordion--bordered site-accordion-code site-component-preview']/div[@id='checkbox-preview-content']/fieldset[1]/div[3]/label[1]")).click();

	}

}
