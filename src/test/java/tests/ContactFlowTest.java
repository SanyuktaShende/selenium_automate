package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class ContactFlowTest extends BaseTest {

    @Test
    public void addContactEndToEndTest() {

        LoginPage loginPage = new LoginPage(driver);
        ContactListPage contactList = new ContactListPage(driver);
        AddContactPage addContact = new AddContactPage(driver);

        loginPage.login("test@thinkingtester.com", "password123");
        contactList.verifyUserIsOnContactList();

        loginPage.clickSignupIfLoginError();
        contactList.clickAddContact();
        addContact.addNewContact();

        contactList.verifyUserIsOnContactList();
        contactList.logout();
    }
}
