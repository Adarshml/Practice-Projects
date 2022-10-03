package mystore;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCart {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Mphasis\\MLA\\Phase5\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void searchAndAddproduct() {
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Acer Nitro 5");
		searchBox.submit();
		driver.findElement(By.linkText("Acer Nitro 5 Gaming Laptop/12th Gen Intel Core i7-12700H Processor 14core/15.6\"(39.6cm) FHD 144Hz Display(16GB/512GB SSD/1TB HDD/RTX 3050Ti Graphics/Windows 11/RGB),AN515-58 + Xbox Game Pass Ultimate")).click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("product added to cart successfully"); 
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
