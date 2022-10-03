package mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateSignup {

	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Mphasis\\MLA\\Phase5\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void signUp() {
				driver.get("https://cupsofmagik.com/account/register");
				
				driver.findElement(By.id("FirstName")).sendKeys("John");
				driver.findElement(By.id("LastName")).sendKeys("Wick");
				driver.findElement(By.id("Email")).sendKeys("johnwick@gmail.com");
				driver.findElement(By.id("CreatePassword")).sendKeys("John@1234");
				
				driver.findElement(By.className("btn")).click();
				System.out.println("SignUp Successful"); 
				
		  }
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
