package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddContactPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    public By email = By.id("email");
    private By password = By.id("password");
    private By submitBtn = By.id("submit");
	private By erroremail = By.xpath("//*[contains(text(),'Email address is already in use')]");


    public AddContactPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addNewContact() {
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(email).sendKeys("testuser@email.com");
        driver.findElement(password).sendKeys("Pass@123");
        driver.findElement(submitBtn).click();
    }
    
    
    public void emailExistsError() {
        try {
            WebElement errorMsg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(erroremail)
            );

            if (errorMsg.isDisplayed()) {
            	driver.findElement(email).clear();
            	driver.findElement(email).sendKeys("Bill@email.com");
            	 driver.findElement(submitBtn).click();
            }

        } catch (Exception e) {
            // error not shown → do nothing
        }
    }
}

