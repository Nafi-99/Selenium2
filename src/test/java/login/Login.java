package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup() ;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		String ActualTitle= driver.getTitle();
//		String ExpectedTitle= "Swag Labs";	
		
	   //CHECKING TITLE BY IF-ELSE CONDITION	
		
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title Matched");
//		}else {
//			System.out.println("Title Not Matched");
//		}
		
		//CHECKING BY ASSERTION
		//Assert.assertEquals(ActualTitle,ExpectedTitle,"Conditions True");
		
		
		
		String ActualUrl= driver.getCurrentUrl();
		String ExpectedUrl= "https://www.saucedemo.com/";
		System.out.println(ActualUrl);
		
	    //CHECKING URL BY IF-ELSE CONDITION	
		
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Url Matched");
		}else {
			System.out.println("Url Not Matched");
		}
		
		//CHECKING URL BY ASSERTION
		//Assert.assertEquals(ActualUrl,ExpectedUrl,"Conditions True");

	}

}

