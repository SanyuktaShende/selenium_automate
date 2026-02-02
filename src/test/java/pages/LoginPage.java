package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

	private WebDriver driver;

    private By email = By.id("email");
    private By password = By.id("password");
    private By submitBtn = By.id("submit");
	
    public LoginPage(WebDriver driver) {
    	this.driver= driver;
    }
    public void login(String userEmail, String userPassword) {
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(submitBtn).click();
    }

}
