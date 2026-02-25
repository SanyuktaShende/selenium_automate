package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactListPage {

    private WebDriver driver;

    private By addContactBtn = By.id("add-contact");
    private By logoutBtn = By.id("logout");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By birthdate = By.id("birthdate");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By street1 = By.id("street1");
    private By street2 = By.id("street2");
    private By city = By.id("city");
    private By stateProvince = By.id("stateProvince");
    private By postalCode = By.id("postalCode");
    private By country = By.id("country");
    private By submit = By.id("submit");


    public ContactListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyUserIsOnContactList() {
        Assert.assertTrue(driver.findElement(addContactBtn).isDisplayed(),
                "User is not on Contact List page");
    }
    
    

    public void clickAddContact() {
        driver.findElement(addContactBtn).click();
    }

    public void addDetailForContact() {
    	driver.findElement(firstName).sendKeys("Tyfyfla");
    	driver.findElement(lastName).sendKeys("Guther");
    	driver.findElement(birthdate).sendKeys("2001-09-29");
    	driver.findElement(email).sendKeys("tygyga@gmail.com");
    	driver.findElement(phone).sendKeys("198474622");
    	driver.findElement(street1).sendKeys("kjlekjlkjlr");
    	driver.findElement(street2).sendKeys("iwhhhuoirewru");
    	driver.findElement(city).sendKeys("Newyork");   
    	driver.findElement(stateProvince).sendKeys("USA");
    	driver.findElement(postalCode).sendKeys("2930");
    	driver.findElement(country).sendKeys("USA");
    	driver.findElement(submit).click();
    
    }
    
    public void logout() {
        driver.findElement(logoutBtn).click();
    }
}

