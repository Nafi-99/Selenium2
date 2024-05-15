package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//link and window
		driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); 
        
        //login
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        
        //Add to cart
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        Thread.sleep(2000);
        
       //checkout
        driver.findElement(By.xpath("//button[@id='checkout']")).click(); 
        
        //checkout-information
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nafisa"); 
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Tabassum"); 
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1230"); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        
        //finish
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();



     

	}

}
