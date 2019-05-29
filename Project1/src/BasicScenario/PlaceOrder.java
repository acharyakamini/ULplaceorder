package BasicScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import okio.Timeout;

public class PlaceOrder {
	@Test
	public void search(){
		System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://stg1-hercules.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("siesta bedside table");
		//WebElement check=  driver.findElement(By.xpath("//strong[text() = 'siesta bedside table 5565']"));
		//System.out.println(check);

		WebElement ele = driver.findElement(By.xpath("//span[@class='twitter-typeahead']//div[1]//div[1]//div[1]"));
		try {
			if(ele.isDisplayed()) {
				ele.click();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Closing browser as search results are not found");
		}
		driver.findElement(By.xpath("//img[@title='Siesta Bedside Table (Mahogany Finish)']")).click();
		driver.findElement(By.xpath("//div[@id='buy_details_270']//button[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//select[@id='select_0_quantity']")).click();;
		driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']//button[@id='checkout-link']")).click();
		//String s = "kaminiacharya13@urbanladder.com";
		//WebElement email = driver.findElement(By.id("order_email"));
		//Actions email_action = new Actions(driver);
		//email_action.moveToElement(email).sendKeys(s);
		driver.findElement(By.id("order_email")).sendKeys("kaminiacharya12@gmail.com");
		driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("560076");
		driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys("etuiyrwteyu");
		driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("kam");
		driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys("ach");
		driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("8797878788");
		driver.findElement(By.id("address-form-submit")).click();


	}



}


