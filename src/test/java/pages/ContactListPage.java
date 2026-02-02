package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactListPage {

    private WebDriver driver;

    private By addContactBtn = By.id("add-contact");
    private By logoutBtn = By.id("logout");

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

    public void logout() {
        driver.findElement(logoutBtn).click();
    }
}

