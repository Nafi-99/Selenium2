package automation;

import io.github.bonigarcia.wdm.WebDriverManager;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Login2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//driver initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		//Link and Window
		driver.get("https://eticket.railway.gov.bd/login");
        driver.manage().window().maximize();
        
        
		//Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        
        //Login
		driver.findElement(By.id("mobile_number")).sendKeys("01748212646");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("fabiha19101184");
		Thread.sleep(3000);
		driver.findElement(By.className("login-form-submit-btn")).click();


		

	}

}
