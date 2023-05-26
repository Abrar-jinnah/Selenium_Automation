package EbayAutomationTest;

import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;




import Pages.EbayHomePage;
import Pages.EbayRegistrationPage;
import Pages.LoginPage;

public class Login {
	
	WebDriver driver;
	
	EbayHomePage homePage;
	
	EbayRegistrationPage regPage;
	
	LoginPage loginpage;
	
	Faker faker = new Faker();

	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String email = firstName+"@maiinator.com";
	String password = lastName+"*123";
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		regPage = new EbayRegistrationPage(driver);
		homePage = new EbayHomePage(driver);
		
		homePage.goToHomePage();
		homePage.clickRegisterLink();
		
		regPage.registerToEbay(firstName,lastName,email,password);
	}
	
	@Test
	public void login() {
		
		loginpage = new LoginPage(driver);
		
		homePage.goToHomePage();
		homePage.clickLoginlink();
		loginpage.enterEmail(email);
		loginpage.clickContinueBtn();
		loginpage.enterPassword(password);
		loginpage.clickSignInBtn();
		
	}
	
	 @AfterTest
	    public void teardown() {
		 driver.manage().deleteAllCookies();
	     driver.quit();
	        
	    }
	
}
