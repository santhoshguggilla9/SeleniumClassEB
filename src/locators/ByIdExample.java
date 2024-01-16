package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ByIdExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement img_clk = driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='q8WwEU']/div[@class='_3zsGrb']/div[@class='_2-LWwB']/div/div[@class='css-1dbjc4n r-13awgt0 r-1udh08x']/div[@class='css-1dbjc4n r-13awgt0']/div[@class='css-1dbjc4n r-13awgt0 r-1iqfa7g r-60vfwk']/div[@class='css-1dbjc4n r-13awgt0 r-1iqfa7g r-60vfwk']/div[@class='_1ui5b4']/div[@class='yAlKeh']/div[@class='_2L0uxW']/div[@class='_3116_u']/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"));
//		
		
		driver.get("https://www.flipkart.com/toys/stuffed-toys/pr?sid=mgl%2C1zt&hpid=aYIiqog0ctRH4fZXM42Ro6p7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJVcHRvIDcwJSBPZmYiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19LCJoZXJvUGlkIjp7InNpbmdsZVZhbHVlQXR0cmlidXRlIjp7ImtleSI6Imhlcm9QaWQiLCJpbmZlcmVuY2VUeXBlIjoiUElEIiwidmFsdWUiOiJTVEZHTVE2MzI3WVFOSFlZIiwidmFsdWVUeXBlIjoiU0lOR0xFX1ZBTFVFRCJ9fSwidGl0bGUiOnsibXVsdGlWYWx1ZWRBdHRyaWJ1dGUiOnsia2V5IjoidGl0bGUiLCJpbmZlcmVuY2VUeXBlIjoiVElUTEUiLCJ2YWx1ZXMiOlsiU29mdCBUb3lzIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//a[contains(text(),'CRAZY DIPS 3 Feet -36 inch Cute & Soft Toys Valent')]")).click();
		
		try {
            // Wait for the "Add to Cart" button to be clickable
            WebElement addToCartButton = new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")));

            // Click on the "Add to Cart" button
            addToCartButton.click();

            System.out.println("Clicked on 'Add to Cart' button successfully!");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
//		String expected_res="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
//		Assert.assertEquals(expected_res,act_res);
		
//		// by using name locator
//		driver.findElement(By.name("btnK")).click();
		
	}
}
