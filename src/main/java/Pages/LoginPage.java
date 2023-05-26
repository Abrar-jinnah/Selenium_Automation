package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	  private WebDriver driver;
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void enterEmail(String email) {
	        driver.findElement(By.id("userid")).sendKeys(email);
	    }
	    
	    public void clickContinueBtn() {
	        driver.findElement(By.id("signin-continue-btn")).click();;
	    }
	    
	    public void enterPassword(String password) {
	        driver.findElement(By.id("pass")).sendKeys(password);;
	    }
	    
	    public void clickSignInBtn() {
	        driver.findElement(By.id("sgnBt")).click();
	    }
	    
	    
	  
}
