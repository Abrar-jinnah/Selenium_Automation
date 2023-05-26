package EbayAutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.EbayHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProduct {

	WebDriver driver;
	
	EbayHomePage homePage;
	
	
	@BeforeTest
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		homePage = new EbayHomePage(driver);
		
		homePage.goToHomePage();
		
		}
	
	@Test
	public void search() {
		
		homePage.enterSearchItem("watches");
		while(true); //For not closing the browser
		
	}
}
