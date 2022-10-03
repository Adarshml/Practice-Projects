package mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateLogin {
	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Mphasis\\MLA\\Phase5\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
		public void login() {
				driver.get("https://www.saucedemo.com/");
				
				WebElement username = driver.findElement(By.id("user-name"));
				WebElement password = driver.findElement(By.id("password"));
				WebElement login = driver.findElement(By.name("login-button"));
				
				username.clear();
				username.click();
				username.sendKeys("standard_user");
				
				password.clear();
				password.click();
				password.sendKeys("secret_sauce");
				login.click();
				//verifying title 
				WebElement title = driver.findElement(By.className("title"));
				String expectedResult = "PRODUCTS";
				String result = title.getText();
				Assert.assertEquals(result, expectedResult);
				System.out.println("Login Successful "); 
				//Error Message
//				WebElement actual_error = driver.findElement(By.cssSelector("h3[data-test='error']"));
//				System.out.println("Error message : "); 
//				System.out.println(actual_error.getText()); 
			}
		
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

