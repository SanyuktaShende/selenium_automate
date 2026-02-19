package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

	private WebDriver driver;

    private By email = By.id("email");
    private By password = By.id("password");
    private By submitBtn = By.id("submit");
	private By signup = By.id("signup");
	private By error = By.xpath("//*[contains(text(),'Incorrect username or password')]");
	

    public LoginPage(WebDriver driver) {
    	this.driver= driver;
    }
    
    
    public void login(String userEmail, String userPassword) {
    	
    	try {
        driver.findElement(email).sendKeys(userEmail);
        driver.findElement(password).sendKeys(userPassword);
        driver.findElement(submitBtn).click();
    }}
    catch(Exception e) {
    	
    }

}
