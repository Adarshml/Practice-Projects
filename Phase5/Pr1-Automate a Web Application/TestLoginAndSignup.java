package automate;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginAndSignup {
	private static String url = "http://localhost:4200";
	
	public static void main(String[] args) {
			
			WebDriver webdriver = null;
			
			System.setProperty("webdriver.chrome.driver", "E:\\Mphasis\\MLA\\Phase5\\browsers\\chromedriver.exe");
			webdriver = new ChromeDriver();
			automatesignup(webdriver,"signup", "Arjith", "9988774455", "arjith@gmail.com", "1234");
			automateLogin(webdriver, "login", "arjith@gmail.com", "1234");

			}
	private static void automateLogin(WebDriver webdriver, String route, String email, String password ) {
		webdriver.get(url+"/"+route);
//		provide user name
		webdriver.findElement(By.id("email")).sendKeys(email);
		
//		provide password
		webdriver.findElement(By.id("password")).sendKeys(password);	
		
//		Click on the login button
		webdriver.findElement(By.id("login")).click();
		
//		Handling alert box
		String expectedResult ="Login Successful !!";
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert simpleAlert = webdriver.switchTo().alert();
		String result = simpleAlert.getText();
		if(result.equals(expectedResult)) {
			System.out.println(result);
			System.out.println("Login test successful");
		}
		else {
			System.out.println("Login test failed");
		}
		simpleAlert.accept();			
	}
	
	private static void automatesignup(WebDriver webdriver, String route, String fullname, String mobile, String email, String password ) {
		webdriver.get(url+"/"+route);
//		provide full name
		webdriver.findElement(By.id("fullname")).sendKeys(fullname);
		
//		provide Mobile number
		webdriver.findElement(By.id("mobile")).sendKeys(mobile);
		
//		provide Email Address
		webdriver.findElement(By.id("email")).sendKeys(email);
		
//		provide password
		webdriver.findElement(By.id("password")).sendKeys(password);	
		
//		Click on the SignUp button
		webdriver.findElement(By.id("signup")).click();
		
//		Handling alert box
		String expectedResult ="Signup Successful";
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert simpleAlert = webdriver.switchTo().alert();
		String result = simpleAlert.getText();
		if(result.equals(expectedResult)) {
			System.out.println(result);
			System.out.println("SignUp test successful");
		}
		else {
			System.out.println("SignUp test failed");
		}
		simpleAlert.accept();			
				
	}
}
