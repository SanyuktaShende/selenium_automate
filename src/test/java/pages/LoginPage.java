package pages;
import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

    private By email = By.id("email");
    private By password = By.id("password");
    private By submitBtn = By.id("submit");
	private By signup = By.id("signup");
	private By error = By.xpath("//*[contains(text(),'Incorrect username or password')]");
	

    public LoginPage(WebDriver driver) {
    	this.driver= driver;
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    
    public void login(String userEmail, String userPassword) {
    	
    	  
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        
        driver.findElement(submitBtn).click();
        
        
    }
    
    public void clickSignupIfLoginError() {
        try {
            WebElement errorMsg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(error)
            );

            if (errorMsg.isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(signup)).click();
            }

        } catch (Exception e) {
            // error not shown → do nothing
        }
    }
    

}
