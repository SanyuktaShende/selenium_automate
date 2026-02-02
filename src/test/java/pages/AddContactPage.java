package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactPage {

    private WebDriver driver;

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By birthdate = By.id("birthdate");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By submitBtn = By.id("submit");

    public AddContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewContact() {
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(birthdate).sendKeys("1995-01-01");
        driver.findElement(email).sendKeys("testuser@email.com");
        driver.findElement(phone).sendKeys("9999999999");
        driver.findElement(submitBtn).click();
    }
}

