package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayRegistrationPage {
	
    WebDriver driver;
    
    public EbayRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterFirstName(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
    }
    
    public void enterLastName(String lastName) {
        driver.findElement(By.id("lastname")).sendKeys(lastName);
    }
    
    public void enterEmail(String email) {
        driver.findElement(By.id("Email")).sendKeys(email);
    }
    
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    
    public void submitRegistrationForm() {
        driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
    }
    
    
    public void registerToEbay(String fName, String lName, String email, String password) throws InterruptedException {
    	this.enterFirstName(fName);
    	this.enterLastName(lName);
    	this.enterEmail(email);
    	this.enterPassword(password);
    	Thread.sleep(2000);
    	this.submitRegistrationForm();
    	
    }
}
