package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class ContactFlowTest extends BaseTest {

    @Test
    public void addContactEndToEndTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        ContactListPage contactList = new ContactListPage(driver);
        AddContactPage addContact = new AddContactPage(driver);

        loginPage.login("test@thinkingtester.com", "password123");
        loginPage.clickSignupIfLoginError();
        addContact.addNewContact();
        addContact.emailExistsError();
        Thread.sleep(1000);
        contactList.verifyUserIsOnContactList();
        Thread.sleep(1000);

        contactList.clickAddContact();
        Thread.sleep(1000);

        

//        loginPage.clickSignupIfLoginError();
        
       
//        contactList.logout();
    }
}
