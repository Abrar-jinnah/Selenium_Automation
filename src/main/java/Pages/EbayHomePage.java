package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EbayHomePage {
	
    private WebDriver driver;
    
    public EbayHomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void goToHomePage() {
        driver.get("https://www.ebay.com/");
    }
    
    public void clickRegisterLink() {
        driver.findElement(By.xpath("//a[normalize-space()='register']")).click();

    }
    public void clickLoginlink() {
        driver.findElement(By.xpath("//*[contains(@href,'SignIn')]")).click();
    }
    
    public void enterSearchItem(String item) {
        driver.findElement(By.id("gh-ac")).sendKeys(item, Keys.ENTER);
    }
    
    
}
